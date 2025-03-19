package com.sist.docker_0319.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg","Docker Practice.");
        return map;
    }
}
