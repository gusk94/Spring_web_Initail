package com.signin.service;

import com.signin.data.User;

public interface Service {
    boolean isLogin(User user);
    String getUserPassword(String userId);
    String getUserNickname(String userId);
    String getUserPhone(String userId);
    void insertUser(User user);
    void updateUser(User user);
    void  deleteUser(User user);
}
