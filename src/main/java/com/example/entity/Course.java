package com.example.entity;


import javax.persistence.Column;
import javax.persistence.Id;

public class Course {

    @Id
    @Column
    private Integer cid;

    @Column
    private String cname;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
