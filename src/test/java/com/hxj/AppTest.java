package com.hxj;

import static org.junit.Assert.assertTrue;

import com.hxj.domain.Student;
import com.hxj.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConn() throws Exception
    {
       InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();

        System.out.println("--------"+sqlSession);
    }


    @Test
    public void testAdd() throws Exception
    {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        int insert = sqlSession.insert("StudentMapper.addStu", new Student("张三丰", "太极拳"));
        System.out.println("添加"+insert);
        sqlSession.commit();
    }


    @Test
    public void testAddMapper() throws Exception
    {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println(factory);
        SqlSession sqlSession = factory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int i = mapper.addStu(new Student("小丽","园林设计"));
        System.out.println("添加："+i);
//        sqlSession.commit();
    }
}
