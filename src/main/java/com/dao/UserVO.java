package com.dao;

import java.io.Serializable;

public class UserVO implements Serializable {
    private int id;
    private String name;
    private Integer age;

    public UserVO(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "dao.User {" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

}
