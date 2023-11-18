package com.lihanlin.controller;

import com.lihanlin.pojo.Student;
import com.lihanlin.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("学院"+all);
    }
}
