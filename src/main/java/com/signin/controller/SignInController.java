package com.signin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController {

    @RequestMapping("/")
    public String signin() {
        return "index";
    }
}
