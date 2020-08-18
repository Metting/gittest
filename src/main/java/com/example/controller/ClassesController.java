package com.example.controller;


import com.example.dao.CourseDao;
import com.example.entity.Course;
import com.example.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("classes")
public class ClassesController {
    @Resource
    CourseService courseService;
    @Resource
    CourseDao courseDao;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Course> findAll(){
        System.out.println("findAll");
        return courseService.findAll();
    }


    @RequestMapping("add")
    @ResponseBody
    public int add(@RequestBody Course course){

        System.out.println(course);
        return courseDao.insert(course);
    }


    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(Integer cid){
        System.out.println("cid"+cid);
        return courseService.deleteById(cid);
    }


    @RequestMapping("update1")
    @ResponseBody
    public int update1(@RequestBody Course course){
        System.out.println(course);
        return courseDao.updateByPrimaryKey(course);
    }


    @RequestMapping("test2")
    @ResponseBody
    public int test1(@RequestBody Map<String,Object> map){
        System.out.println(map);
        return 1;
    }
}
