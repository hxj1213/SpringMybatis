package com.hxj.mapper;

import com.hxj.domain.StuClass;
import org.apache.ibatis.annotations.Select;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
public interface StuClassMapper {


    @Select("select * from t_class where cid=#{cid}")
    public StuClass findClassById(int id);

}
