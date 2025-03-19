package com.sist.docker_0319_3.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {

    @Value("${values.msg}")
    private String msg;

    @RequestMapping("/msg")
    public Map<String, Object> msg() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }
    
}
