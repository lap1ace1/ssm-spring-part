package com.lihanlin.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.lihanlin.controller.StudentController;
import com.lihanlin.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateTest {
    public void testForJava(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///studb");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(dataSource);
    }
    @Test
    public void testForIoC() {
//        1.创建IoC容器
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");
//          2.获取jdbcTemplate组件
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
//          3.进行数据库的curd操作
        String sql = "insert into students(id,name,gender,age,class) value(?,?,?,?,?);";
        //参数1 String sql 可以替代占位符
        //参数2 Object...param 传入占位符的值 顺序 从左开始对象
        //参数3 int 影响函数
        int row = jdbcTemplate.update(sql, 9, "李瀚林", "男", 22, "大四");
        System.out.println("row" + row);

        sql = "select * from students where id = ?;";

        Student stu = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {

                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getString("gender"));
                student.setClasses(rs.getString("class"));
                return student;

        }, 1);
        System.out.println("stu=" + stu);

        //查询所有学生数据
        sql = "select id,name,gender,age,class as classes from students;";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentList"+studentList);
    }
    @Test
    public void testQueryAll(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController sc = applicationContext.getBean("StudentController", StudentController.class);

        sc.findAll();
        applicationContext.close();

    }
}
