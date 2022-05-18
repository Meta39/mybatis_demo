package com.fu.mybatis_demo.entity;


import java.io.Serializable;

public class Student implements Serializable {

    private Long id;//ID
    private String name;//学生姓名
    private Long tId;//老师ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getTId() {
        return tId;
    }

    public void setTId(Long tId) {
        this.tId = tId;
    }
}

