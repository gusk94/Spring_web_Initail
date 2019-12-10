package com.signin.repository;

import com.signin.data.User;

public interface Repository {
    User selectUserByUserId(String userId);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
