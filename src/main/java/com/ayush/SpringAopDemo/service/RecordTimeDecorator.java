package com.ayush.SpringAopDemo.service;

import com.ayush.SpringAopDemo.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RecordTimeDecorator implements StudentService{

    private LoggingDecorator loggingDecorator;

    public RecordTimeDecorator(LoggingDecorator loggingDecorator){
        this.loggingDecorator = loggingDecorator;
    }
    @Override
    public void createStudent(Student student) {

        long start = System.currentTimeMillis();
        loggingDecorator.createStudent(student);
        long end = System.currentTimeMillis();

        System.out.println((end-start)/1000 + " seconds");
    }
}
