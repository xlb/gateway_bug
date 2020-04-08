package com.example.server.controller;

import com.example.server.entity.ParamEntity;
import com.example.server.entity.RestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xulb
 * @Date: 2020/4/8 15:57
 */
@RestController
public class testController {

    @GetMapping("/")
    public RestBody test(ParamEntity paramEntity)
    {
        System.out.println(paramEntity.toString());
        return new RestBody();
    }
}
