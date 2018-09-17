package com.example.demo.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserApi {

    @RequestMapping("/addUser")
    @PostMapping
    public Map<String,Object> addUser(@RequestBody HashMap<String, Object> userData) {
        Map<String,Object> map = new HashMap<String, Object>();
        String name = String.valueOf(userData.get("name"));
        String age = (String) userData.get("age");
        int newAge = Integer.parseInt(age);
        map.put("name", name);
        map.put("age", newAge);
        return map;
    }
}
