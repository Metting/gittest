package com.example.service;


import com.example.dao.CourseDao;
import com.example.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {

    @Resource
    CourseDao courseDao;

    public List<Course> findAll(){
        return courseDao.findAll();
    }

    public int deleteById(Integer cid){
        return courseDao.deleteByPrimaryKey(cid);
    }
}
