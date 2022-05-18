package com.fu.mybatis_demo.entity.vo;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.entity.Teacher;

import java.util.List;

/**
 * 一对多
 * 一个老师对应多个学生
 * 联表查询 简单 推荐
 * 子查询 复杂 不推荐
 */
public class TeacherVO extends Teacher {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
