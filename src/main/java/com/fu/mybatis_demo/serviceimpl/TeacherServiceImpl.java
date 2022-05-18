package com.fu.mybatis_demo.serviceimpl;

import com.fu.mybatis_demo.entity.Teacher;
import com.fu.mybatis_demo.dao.TeacherDao;
import com.fu.mybatis_demo.entity.vo.TeacherVO;
import com.fu.mybatis_demo.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    //根据ID查询
    @Override
    public Teacher select(Long id) {
        return teacherDao.select(id);
    }

    //查询全部
    @Override
    public List<Teacher> selectAll() {
        return teacherDao.selectAll();
    }

    //新增
    @Override
    public Integer insert(Teacher teacher) {
        return teacherDao.insert(teacher);
    }

    //更新
    @Override
    public Integer update(Teacher teacher) {
        return teacherDao.update(teacher);
    }

    //删除
    @Override
    public Integer delete(Long id) {
        return teacherDao.delete(id);
    }

    @Override
    public TeacherVO getTeacher(Long tid) {
        return teacherDao.getTeacher(tid);
    }

    @Override
    public TeacherVO getTeacher2(Long tid) {
        return teacherDao.getTeacher2(tid);
    }
}

