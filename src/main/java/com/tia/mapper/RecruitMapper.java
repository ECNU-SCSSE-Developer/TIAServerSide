package com.tia.mapper;

import com.tia.entity.Recruitment;
import org.apache.ibatis.annotations.*;

public interface RecruitMapper {

    // TODO: remained to complete
    int insertRecruit(Recruitment recruitment);

    @ResultMap("com.tia.mapper.UserMapper.RecruitmentResult")
    @Select("SELECT * FROM Recruitment NATURAL JOIN Match_Recruit\n" +
            "WHERE recruit_id = #{param1}")
    Recruitment selectRecruitment(int recruitId);

    @Update("UPDATE `Recruitment`,`Match_Recruit` SET\n" +
            "\trecruit_name = #{recruitName},\n" +
            "\trecruit_description = #{recruitDescription},\n" +
            "\trecruit_requirements = #{recruitRequirements},\n" +
            "\tregistered_number = #{registeredNumber},\n" +
            "\tmatch_id = #{matchId}\n" +
            "WHERE Recruitment.recruit_id = #{recruitId} or Match_Recruit.recruit_id = #{recruitId} ;")
    int updateRecruit(Recruitment recruitment);

    @Delete("DELETE `Recruitment`,`Recruit_Applicants`\n" +
            "FROM `Recruitment` NATURAL JOIN `Recruit_Applicants`\n" +
            "WHERE recruit_id = #{recruitId};")
    int deleteRecruit(Recruitment recruitment);




}
