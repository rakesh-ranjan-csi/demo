package com.shikha.demo.controller;

import com.shikha.demo.bean.DemoBean;
import com.shikha.demo.dto.DemoTable;
import com.shikha.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@Component
//@ResponseBody

@RestController
@Slf4j
public class DemoController {
    @Autowired
    private DemoService ds;

    @GetMapping("/home/{id}")
    public int meth(@PathVariable int id) {
        return ds.get(id);
    }

    @PostMapping("/saveUser")
    public int saveUser(@RequestBody DemoTable d) {
        return ds.saveUser(d);
    }

    @GetMapping("/getValue/id/{id}")
    public DemoTable getValue(@PathVariable int id)  {
        return ds.findById(id);

    }

    @GetMapping("/getDetails/id/{id}/age/{age}")
    public DemoTable getDetails(@PathVariable int id, @PathVariable int age) {
        return ds.findByIdAndAge(id, age);
    }

    @DeleteMapping("/delete/id/{id}")
    public int delete(@PathVariable int id) {
        return  ds.deleteByCustom(id);
    }

    @PutMapping("/update/id/{id}/name/{name}")
    public int updateById(@PathVariable int id, @PathVariable String name) {
        return ds.updateByIdCustom(id, name);
    }
}
