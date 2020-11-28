package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private Map<String,Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,Object> hello(){
        result.put("name","stephen");
        result.put("city","San Jose");
        return result;
    }
}
