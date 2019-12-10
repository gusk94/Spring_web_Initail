package com.signin.controller;

import com.signin.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController {

    @Autowired
    Service service;

    @RequestMapping("/")
    public String signin() {
        return "index";
    }
}
