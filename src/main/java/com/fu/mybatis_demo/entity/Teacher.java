package com.fu.mybatis_demo.entity;


import java.io.Serializable;

public class Teacher implements Serializable {

    private Long id;//ID
    private String name;//老师姓名
    private String className;//班级名称

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

}

