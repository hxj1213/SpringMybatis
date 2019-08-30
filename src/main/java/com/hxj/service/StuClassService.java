package com.hxj.service;

import com.hxj.domain.StuClass;
import com.hxj.domain.Student;
import com.hxj.mapper.StuClassMapper;
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
public class StuClassService {

    @Resource
    StuClassMapper stuClassMapper;


    public StuClass findClassById(int id){
        return stuClassMapper.findClassById(id);
    }

}
