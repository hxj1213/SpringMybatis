package com.hxj;

import com.hxj.domain.StuClass;
import com.hxj.domain.Student;
import com.hxj.mapper.StuClassMapper;
import com.hxj.mapper.StudentMapper;
import com.hxj.service.StuClassService;
import com.hxj.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTestSM
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void test1() throws Exception
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);

        Object factory = applicationContext.getBean("sqlSessionFactory");
        System.out.println(factory);

        MapperScannerConfigurer mapperpackage = (MapperScannerConfigurer) applicationContext.getBean("mapperPackage");
        System.out.println(mapperpackage);
    }

    @Test
    public void testConn() throws Exception
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
//        System.out.println(studentService.getClass());
        studentService.addStu(new Student("小李","Java"));

    }


    @Test
    public void testConn1() throws Exception
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<Student> students = new ArrayList<>();
        students.add(new Student("小李","Java"));
        students.add(new Student("小张","前端"));
        students.add(new Student("小黄","C++"));
        studentService.addStus(students);

    }


    @Test
    public void testConn2() throws Exception
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        /*StuClassService stuClassService = (StuClassService)applicationContext.getBean("stuClassService");
        StuClass i = stuClassService.findClassById(1);
        System.out.println(i);*/
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = studentService.findStuById(61);
        System.out.println(student.getSname());
        System.out.println(student.getStuClass());
//        System.out.println(student);
        /*
        */
    }



}
