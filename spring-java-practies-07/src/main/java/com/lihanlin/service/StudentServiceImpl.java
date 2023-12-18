package com.lihanlin.service;

import com.lihanlin.dao.StudentDao;
import com.lihanlin.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
