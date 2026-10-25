package com.ayush.SpringAopDemo.service;

import com.ayush.SpringAopDemo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

        @Override
        public void createStudent(Student student) {
            try {
                Thread.sleep(5000);
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Student saved in Repository.");
        }
}
