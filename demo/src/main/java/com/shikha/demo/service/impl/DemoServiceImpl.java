package com.shikha.demo.service.impl;

import com.shikha.demo.bean.DemoBean;
import com.shikha.demo.dto.DemoTable;
import com.shikha.demo.repository.DemoUserRepo;
import com.shikha.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoUserRepo demoUserRepo;

    @Override
    public int get(int id) {
        return id + id;
    }

    @Override
    public int saveUser(DemoTable d) {
        return demoUserRepo.save(d).getId();
    }

    @Override
    public DemoTable findById(int xyz) {
        return demoUserRepo.findByIdCustom(xyz);
    }

    @Override
    public DemoTable findByIdAndAge(int id, int age) {
        return demoUserRepo.findByIdAndAge(id, age);
    }

    @Override
    public int deleteByCustom(int id) {
        return demoUserRepo.deleteByCustom(id);
    }

    @Override
    public int updateByIdCustom(int id, String n) {
        return demoUserRepo.updateByIdCustom(id, n);
    }


}
