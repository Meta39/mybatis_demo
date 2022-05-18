package com.fu.mybatis_demo.controller;

import com.fu.mybatis_demo.entity.Teacher;
import com.fu.mybatis_demo.entity.vo.TeacherVO;
import com.fu.mybatis_demo.serviceimpl.TeacherServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Resource
    private TeacherServiceImpl teacherServiceImpl;

    /**
     * 根据ID查询
     *
     * @param id
     */
    @GetMapping("select")
    public Teacher select(@RequestParam Long id) {
        return teacherServiceImpl.select(id);
    }

    /**
     * 查询全部
     */
    @GetMapping("selectAll")
    public List<Teacher> selectAll() {
        return teacherServiceImpl.selectAll();
    }

    /**
     * 新增
     *
     * @param teacher
     */
    @PostMapping("insert")
    public Integer insert(@RequestBody Teacher teacher) {
        return teacherServiceImpl.insert(teacher);
    }

    /**
     * 修改
     *
     * @param teacher
     */
    @PostMapping("update")
    public Integer update(@RequestBody Teacher teacher) {
        return teacherServiceImpl.update(teacher);
    }

    /**
     * 删除
     *
     * @param id
     */
    @PostMapping("delete")
    public Integer delete(@RequestParam Long id) {
        return teacherServiceImpl.delete(id);
    }

    /**
     * 多对一、联表查询 映射简单 推荐
     * @param tid
     * @return
     */
    @GetMapping("getTeacher")
    public TeacherVO getTeacher(Long tid) {
        return teacherServiceImpl.getTeacher(tid);
    }

    /**
     * 多对一、子查询 映射复杂 不推荐
     * @param tid
     * @return
     */
    @GetMapping("getTeacher2")
    public TeacherVO getTeacher2(Long tid) {
        return teacherServiceImpl.getTeacher2(tid);
    }
}

