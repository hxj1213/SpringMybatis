package com.hxj.service;

import com.hxj.domain.Student;
import com.hxj.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
@Service
public class StudentService {

    @Resource
    StudentMapper studentMapper;

    @Transactional
    public void addStu(Student student){
        int i = studentMapper.addStu(student);
        System.out.println("添加："+i);
    }

    @Transactional(readOnly = false,rollbackFor = NullPointerException.class)
    public void addStus(List<Student> students) throws IOException {
        for(Student student:students){
            int i = studentMapper.addStu(student);
            System.out.println("添加："+i);
            /*String[] names = {};
            System.out.println(names[0]);*/
            throw new ArithmeticException("");
        }
    }

    public Student findStuById(int id){
        return studentMapper.findStuById(id);
    }

}
