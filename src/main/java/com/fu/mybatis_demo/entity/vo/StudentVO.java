package com.fu.mybatis_demo.entity.vo;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.entity.Teacher;

/**
 * 多对一
 * 多个学生对应一个老师
 * 1、连表查询（简单推荐）
 * 2、子查询（复杂不推荐）
 */
public class StudentVO  extends Student {
    private Teacher teacher;//老师对象

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
