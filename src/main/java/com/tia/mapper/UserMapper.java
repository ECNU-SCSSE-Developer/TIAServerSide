package com.tia.mapper;

import org.apache.ibatis.annotations.*;
import com.tia.entity.Recruitment;
import com.tia.entity.User;
import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM User WHERE user.student_id = #{studentId}")
    User selectUserById(String studentId);

    @Update("UPDATE User SET\n" +
            "        student_name = #{studentName},\n" +
            "        grade = #{grade},\n" +
            "        major = #{major},\n" +
            "        contacts = #{contacts},\n" +
            "        specialty = #{specialty}\n" +
            "    WHERE student_id = #{studentId}")
    int updateUserBasicInfo(User user);


    @ResultMap("RecruitmentResult")
    @Select("SELECT * FROM Recruitment NATURAL JOIN Match_Recruit\n" +
            "WHERE recruit_id IN\n" +
            "(SELECT recruit_id FROM User_Focused WHERE student_id=#{studentId})")
    List<Recruitment> selectFocused(User user);
    @ResultMap("RecruitmentResult")
    @Select("SELECT * FROM Recruitment NATURAL JOIN Match_Recruit\n" +
            "WHERE recruit_id IN\n" +
            "(SELECT recruit_id FROM User_Registered WHERE student_id=#{studentId})")
    List<Recruitment> selectRegistered(User user);
    @ResultMap("RecruitmentResult")
    @Select("SELECT * FROM Recruitment NATURAL JOIN Match_Recruit\n" +
            "WHERE recruit_id IN\n" +
            "(SELECT recruit_id FROM User_Created WHERE student_id=#{studentId})")
    List<Recruitment> selectCreated(User user);




    @Insert("INSERT INTO `User_Focused` VALUES\n" +
            "(#{param1},#{param2})\n" +
            ";")
    int insertFocused(String studentId, String recruitId);
    @Insert("INSERT INTO `User_Registered` VALUES\n" +
            "(#{param1},#{param2})\n" +
            ";")
    int insertRegistered(String studentId, String recruitId);
    @Insert("INSERT INTO `User_Created` VALUES\n" +
            "(#{param1},#{param2})\n" +
            ";")
    int insertCreated(String studentId, String recruitId);

    @Delete("DELETE FROM `User_Focused` \n" +
            "WHERE student_id = #{param1} and recruit_id = #{param2}")
    int deleteFromFocused(String studentId, String recruitId);
    @Delete("DELETE FROM `User_Registered` \n" +
            "WHERE student_id = #{param1} and recruit_id = #{param2}")
    int deleteFromRegistered(String studentId, String recruitId);
    @Delete("DELETE FROM `User_Created` \n" +
            "WHERE student_id = #{param1} and recruit_id = #{param2}")
    int deleteFromCreated(String studentId, String recruitId);


    // Supported methods
    List<String> selectApplicantsForRecruit(String recruitId);
}
