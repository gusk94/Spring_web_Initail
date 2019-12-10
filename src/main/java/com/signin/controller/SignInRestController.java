package com.signin.controller;

import com.signin.data.User;
import com.signin.service.Service;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignInRestController {
    @Autowired
    private Service service;

    @RequestMapping(value="/signin", method = RequestMethod.GET)
    public String Signin(HttpServletRequest request, @RequestParam String userId, @RequestParam String userPwd){
        User user = new User();
        user.setUserId(userId);
        user.setUserPwd(userPwd);

        JSONObject json = new JSONObject();
        json.put("result", service.isLogin(user));
        return json.toJSONString();
    }
}
