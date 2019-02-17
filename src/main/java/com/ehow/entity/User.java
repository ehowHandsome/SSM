package com.ehow.entity;

/**
 * Created by eHow on 2019/1/30.
 */
public class User {
    private String id;//用户id
    private String account;//用户账号
    private String pwd;//用户密码
    private String creditRating;//用户信用等级
    private String state;//用户状态： 1 - 在用 0 - 注销
    private String remark;//备注

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPwd() {
        return pwd;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public String getState() {
        return state;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", creditRating='" + creditRating + '\'' +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
