package com.fu.mybatis_demo.controller;

import com.fu.mybatis_demo.entity.Student;
import com.fu.mybatis_demo.entity.vo.StudentVO;
import com.fu.mybatis_demo.serviceimpl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource
    private StudentServiceImpl studentServiceImpl;

    /**
     * 根据ID查询
     *
     * @param id
     */
    @GetMapping("select")
    public Student select(@RequestParam Long id) {
        return studentServiceImpl.select(id);
    }

    /**
     * 查询全部
     */
    @GetMapping("selectAll")
    public List<Student> selectAll() {
        return studentServiceImpl.selectAll();
    }

    /**
     * 新增
     *
     * @param student
     */
    @PostMapping("insert")
    public Integer insert(@RequestBody Student student) {
        return studentServiceImpl.insert(student);
    }

    /**
     * 修改
     *
     * @param student
     */
    @PostMapping("update")
    public Integer update(@RequestBody Student student) {
        return studentServiceImpl.update(student);
    }

    /**
     * 删除
     *
     * @param id
     */
    @PostMapping("delete")
    public Integer delete(@RequestParam Long id) {
        return studentServiceImpl.delete(id);
    }

    /**
     * 一对多、联表查询 映射简单 推荐（sql复杂）
     * @return
     */
    @GetMapping("getStudent")
    public List<StudentVO> getStudent(){
        return studentServiceImpl.getStudent();
    }

    /**
     * 一对多、子查询 映射复杂 不推荐(sql简单)
     * @return
     */
    @GetMapping("getStudent2")
    public List<StudentVO> getStudent2(){
        return studentServiceImpl.getStudent2();
    }

}

