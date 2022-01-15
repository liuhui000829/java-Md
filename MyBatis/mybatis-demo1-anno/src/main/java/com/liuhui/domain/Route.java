package com.liuhui.domain;

import java.util.List;

public class Route {
    private int rid;
    private String rname;

    private List<User> userList;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Route{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", userList=" + userList +
                '}';
    }
}
