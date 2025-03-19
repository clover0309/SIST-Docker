package com.example.docker_0319_2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/dotest")
    public Map<String, Object> daewoo(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "Docker testtttttttttttttt");
        return map;
    }
}
