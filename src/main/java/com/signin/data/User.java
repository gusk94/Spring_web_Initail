package com.signin.data;

public class User {
    private String UserId;
    private String UserPwd;
    private String UserNickname;
    private String UserPhone;

    public String getUserNickname() {
        return UserNickname;
    }


    public String getUserPhone() {
        return UserPhone;
    }


    public void setUserNickname(String userNickname) {
        UserNickname = userNickname;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }


    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPwd() {
        return UserPwd;
    }

    public void setUserPwd(String userPwd) {
        UserPwd = userPwd;
    }
}
