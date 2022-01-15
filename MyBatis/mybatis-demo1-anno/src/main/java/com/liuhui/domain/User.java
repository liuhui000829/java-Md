package com.liuhui.domain;

import java.util.Date;
import java.util.List;

public class User {
    private int uid;
    private String username;
    private String password;
    private Date birthday;

    // 描述的是当前用户具备的角色
    private List<Route> routeList;

    public User(){}

    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(int uid, String username, String password) {
        this.uid=uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<Route> routeList) {
        this.routeList = routeList;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", routeList=" + routeList +
                '}';
    }
}
