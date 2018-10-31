package com.fuzamei.filterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: filterdemo
 * @description:
 * @author: Andy
 * @create: 2018-10-31 14:30
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/test")
    public String test() {
        return "hello1";
    }
}
