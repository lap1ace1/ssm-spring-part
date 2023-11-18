package com.lihanlin.service.impl;

import com.lihanlin.dao.StudentDao;
import com.lihanlin.pojo.Student;

import java.util.List;

public class StudentServiceImp implements com.lihanlin.service.StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentsList = studentDao.queryAll();
        System.out.println(studentsList);
        return null;
    }
}
