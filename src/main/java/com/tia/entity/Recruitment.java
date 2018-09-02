package com.tia.entity;

import java.util.ArrayList;
import java.util.List;

public class Recruitment {
    private Long recruitId;
    private String recruitName;
    private String recruitDescription;
    private String recruitRequirements;
    private Integer registeredNumber;
//    private List<String> recruitType = new ArrayList<String>();
    //
    // 联系集
    private List<String> applicantId = new ArrayList<String>();
    private Long matchId;



    public Long getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Long recruitId) {
        this.recruitId = recruitId;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public String getRecruitDescription() {
        return recruitDescription;
    }

    public void setRecruitDescription(String recruitDescription) {
        this.recruitDescription = recruitDescription;
    }

    public String getRecruitRequirements() {
        return recruitRequirements;
    }

    public void setRecruitRequirements(String recruitRequirements) {
        this.recruitRequirements = recruitRequirements;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(Integer registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public List<String> getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(List<String> applicantId) {
        this.applicantId = applicantId;
    }
}
