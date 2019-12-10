package com.signin.controller;

import com.signin.data.User;
import com.signin.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
    @Autowired
    private Service service;

    @RequestMapping("/signup")
    public String Signup(){
        return "signup";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public void Signup(@RequestParam String userId, @RequestParam String userPwd, @RequestParam String userNickname, @RequestParam String userPhone){
        User user = new User();
        user.setUserId(userId);
        user.setUserPwd(userPwd);
        user.setUserNickname(userNickname);
        user.setUserPhone(userPhone);

        service.insertUser(user);
    }

}
