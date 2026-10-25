package com.ayush.SpringAopDemo.service;

import com.ayush.SpringAopDemo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

        @Override
        public void createStudent(Student student){
            System.out.println("Student saved in Repository.");
        }
}
