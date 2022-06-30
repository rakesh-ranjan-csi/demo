package com.shikha.demo.repository;

import com.shikha.demo.dto.DemoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DemoUserRepo extends JpaRepository<DemoTable, Long> {
    DemoTable findById(int id);
    DemoTable findByIdAndAge(int id, int age);

    @Query (nativeQuery = true, value = "select * from demo_user where user_id = :number")
    DemoTable findByIdCustom(int number);

    @Modifying
    @Transactional
    @Query (nativeQuery = true, value = "delete from demo_user where user_id = :id ")
    int deleteByCustom(int id);

    @Modifying
    @Transactional
    @Query (nativeQuery = true, value = "update demo_user set name = :n where user_id = :id ")
    int updateByIdCustom(int id, String n);


}
