package com.example.dao;

import com.example.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseDao extends tk.mybatis.mapper.common.Mapper<Course>{

    @Select("select cid,cname from course")
    List<Course> findAll();


}
