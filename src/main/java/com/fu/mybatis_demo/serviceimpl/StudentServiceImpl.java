package com.fu.mybatis_demo.serviceimpl;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.dao.StudentDao;
import com.fu.mybatis_demo.entity.vo.StudentVO;
import com.fu.mybatis_demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    //根据ID查询
    @Override
    public Student select(Long id) {
        return studentDao.select(id);
    }

    //查询全部
    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    //新增
    @Override
    public Integer insert(Student student) {
        return studentDao.insert(student);
    }

    //更新
    @Override
    public Integer update(Student student) {
        return studentDao.update(student);
    }

    //删除
    @Override
    public Integer delete(Long id) {
        return studentDao.delete(id);
    }

    @Override
    public List<StudentVO> getStudent() {
        return studentDao.getStudent();
    }

    @Override
    public List<StudentVO> getStudent2() {
        return studentDao.getStudent2();
    }
}

