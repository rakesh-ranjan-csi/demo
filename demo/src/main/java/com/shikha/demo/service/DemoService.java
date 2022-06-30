package com.shikha.demo.service;


import com.shikha.demo.dto.DemoTable;

public interface DemoService {

    int get(int id);

    int saveUser (DemoTable d);

    DemoTable findById(int id);

    DemoTable findByIdAndAge(int id, int age);

    int deleteByCustom(int id);

    int updateByIdCustom(int id, String n);

}
