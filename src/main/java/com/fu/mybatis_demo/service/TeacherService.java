package com.fu.mybatis_demo.service;

import com.fu.mybatis_demo.entity.Teacher;
import com.fu.mybatis_demo.entity.vo.TeacherVO;
import com.fu.mybatis_demo.service.TeacherService;

import java.util.List;


public interface TeacherService {

    //根据ID查询
    Teacher select(Long id);

    //查询全部
    List<Teacher> selectAll();

    //新增
    Integer insert(Teacher teacher);

    //更新
    Integer update(Teacher teacher);

    //删除
    Integer delete(Long id);

    TeacherVO getTeacher(Long tid);
    TeacherVO getTeacher2(Long tid);
}
