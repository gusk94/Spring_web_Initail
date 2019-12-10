package com.signin.repository;

import com.signin.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public User selectUserByUserId(String userId){
        User user = sqlSession.selectOne("mapper.selectUser", userId);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public void insertUser(User user){
        sqlSession.selectOne("mapper.insertUser", user);
    }

    @Override
    public void updateUser(User user){
        sqlSession.selectOne("mapper.updateUser", user);
    }

    @Override
    public void deleteUser(User user) {
        sqlSession.selectOne("mapper.deleteUser", user);
    }
}
