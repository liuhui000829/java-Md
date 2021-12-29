package com.company.bean2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] score;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> sets;

    private List<Course> listSub;

    public List<Course> getListSub() {
        return listSub;
    }

    public void setListSub(List<Course> listSub) {
        this.listSub = listSub;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public String[] getScore() {
        return score;
    }

    public void setScore(String[] score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "score=" + Arrays.toString(score) +
                ", list=" + list +
                ", map=" + map +
                ", sets=" + sets +
                ", listSub=" + listSub +
                '}';
    }
}
