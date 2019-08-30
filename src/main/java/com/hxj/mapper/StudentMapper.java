package com.hxj.mapper;

import com.hxj.domain.Student;
import org.apache.ibatis.annotations.*;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
public interface StudentMapper {

    @Insert("insert into student(sname,major) values(#{sname},#{major})")
    public int addStu(Student student);

    @Select("select sid,sname,major,cid from student where sid=#{sid}")
    @Results(value = {
            @Result(id = true,property = "sid",column = "sid"),
            @Result(property = "sname",column = "sname"),
            @Result(property = "major",column = "major"),
            @Result(property = "stuClass",one = @One(select = "com.hxj.mapper.StuClassMapper.findClassById"),column = "cid")
    })
    public Student findStuById(int id);
}
