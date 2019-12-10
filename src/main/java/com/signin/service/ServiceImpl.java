package com.signin.service;

import com.signin.data.User;
import com.signin.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Autowired
    Repository repository;

    @Override
    public boolean isLogin(User user) {
        User getUser = repository.selectUserByUserId(user.getUserId());
        if (getUser.getUserPwd().equals(user.getUserPwd())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getUserPassword(String userId) {
        User user = repository.selectUserByUserId(userId);
        if (user != null){
            return user.getUserPwd();
        }
        return null;
    }

    @Override
    public String getUserNickname(String userId) {
        User user = repository.selectUserByUserId(userId);
        if (user != null){
            return user.getUserNickname();
        }
        return null;
    }

    @Override
    public String getUserPhone(String userId) {
        User user = repository.selectUserByUserId(userId);
        if (user != null) {
            return user.getUserPhone();
        }
        return null;
    }

    @Override
    public void insertUser(User user) {
        repository.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        repository.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.deleteUser(user);
    }
}
