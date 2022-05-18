package com.fu.mybatis_demo.dao;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.entity.vo.StudentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    //根据ID查询
    Student select(@Param("id") Long id);

    //查询全部
    List<Student> selectAll();

    //新增
    int insert(Student student);

    //更新
    int update(Student student);

    //删除
    int delete(@Param("id") Long id);

    //查询所有学生的信息，以及对应老师的信息
    List<StudentVO> getStudent();
    List<StudentVO> getStudent2();

}

