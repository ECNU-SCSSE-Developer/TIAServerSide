package com.tia.test.mapperTest;


import com.tia.entity.User;
import com.tia.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class UserMapperTest {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("com/tia/mapper/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
            String userId = "10165101000";
            UserMapper mapper = session.getMapper(UserMapper.class);
            //
            //
            // testOne
            User user = mapper.selectUserById(userId);
            System.out.println(user.getStudentName());
            user.setStudentName("New Rick");
            mapper.updateUserBasicInfo(user);
            System.out.println(user.getStudentName());
            // testTwo
            mapper.insertFocused(user.getStudentId(),"123");
            // testThree
            mapper.deleteFromFocused(user.getStudentId(),"123");
            // testFour
            System.out.println(mapper.selectFocused(user).get(1).getApplicantId());
            System.out.println(mapper.selectCreated(user).get(0).getApplicantId());
            System.out.println(mapper.selectRegistered(user).get(0).getApplicantId());

        } finally {
            session.close();
        }
    }
}
