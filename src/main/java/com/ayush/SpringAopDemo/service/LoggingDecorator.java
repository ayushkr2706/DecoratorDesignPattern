package com.ayush.SpringAopDemo.service;

import com.ayush.SpringAopDemo.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LoggingDecorator implements StudentService{

    private StudentServiceImpl studentServiceImpl;

    public LoggingDecorator(StudentServiceImpl studentServiceImpl){
        this.studentServiceImpl = studentServiceImpl;
    }

    @Override
    public void createStudent(Student student) {
        //Logging logic

        LoggingServiceUtil.logStart("StudentServiceImpl", "createStudent");

        studentServiceImpl.createStudent(student);

        LoggingServiceUtil.logEnd("StudentServiceImpl", "createStudent");
    }
}
