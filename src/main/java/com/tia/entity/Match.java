package com.tia.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Match {
    private Long matchId;
    private String matchName;
    private String matchDescription;
    private String matchRequirements;
    private String place;
    private Date time;
    private List<String> matchType = new ArrayList<String>();
    // 和Recruitment的联系集
    private Long recruitId;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchDescription() {
        return matchDescription;
    }

    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public String getMatchRequirements() {
        return matchRequirements;
    }

    public void setMatchRequirements(String matchRequirements) {
        this.matchRequirements = matchRequirements;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<String> getMatchType() {
        return matchType;
    }

    public void setMatchType(List<String> matchType) {
        this.matchType = matchType;
    }

    public Long getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Long recruitId) {
        this.recruitId = recruitId;
    }
}



