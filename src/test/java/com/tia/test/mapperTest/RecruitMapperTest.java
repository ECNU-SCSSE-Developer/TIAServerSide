package com.tia.test.mapperTest;

import com.tia.entity.Recruitment;
import com.tia.mapper.RecruitMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class RecruitMapperTest {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("com/tia/mapper/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try{
            RecruitMapper mapper = session.getMapper(RecruitMapper.class);
            // testOne
            Recruitment recruit = mapper.selectRecruitment(2);
            System.out.println(recruit.getApplicantId());
            // testTwo
            System.out.println(recruit.getRecruitDescription());
            recruit.setRecruitDescription("这是新招聘启事");
            mapper.updateRecruit(recruit);
            System.out.println(recruit.getRecruitDescription());
            // test
            System.out.println();
            mapper.deleteRecruit(recruit);
            // test
            System.out.println();
        } finally {
            session.close();
        }
    }
}
