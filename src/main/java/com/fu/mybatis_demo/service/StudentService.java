package com.fu.mybatis_demo.service;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.entity.vo.StudentVO;
import com.fu.mybatis_demo.service.StudentService;

import java.util.List;


public interface StudentService {

    //根据ID查询
    Student select(Long id);

    //查询全部
    List<Student> selectAll();

    //新增
    Integer insert(Student student);

    //更新
    Integer update(Student student);

    //删除
    Integer delete(Long id);

    List<StudentVO> getStudent();
    List<StudentVO> getStudent2();
}
