package com.fu.mybatis_demo.dao;

import com.fu.mybatis_demo.entity.Teacher;
import com.fu.mybatis_demo.entity.vo.TeacherVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {

    //根据ID查询
    Teacher select(@Param("id") Long id);

    //查询全部
    List<Teacher> selectAll();

    //新增
    int insert(Teacher teacher);

    //更新
    int update(Teacher teacher);

    //删除
    int delete(@Param("id") Long id);

    //多对一、获取指定老师下的所有学生
    //联表查询
    TeacherVO getTeacher(@Param("tid") Long tid);

    //子查询
    TeacherVO getTeacher2(@Param("tid") Long tid);

}

