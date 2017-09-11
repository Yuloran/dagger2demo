package com.yuloran.dagger2demo.mvp.model;

/**
 * Author & Date: Yuloran, 2017/9/11 23:12
 * Function:
 */

public class StudentBean {
    private String name;

    public StudentBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
