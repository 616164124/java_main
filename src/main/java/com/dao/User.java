package com.dao;


import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class User implements Serializable, Comparable {
    private int id;
    private String name;
    private Integer age;

    public User(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
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

    @Override
    public int compareTo(@NotNull Object o) {
        return this.age;
    }
}
