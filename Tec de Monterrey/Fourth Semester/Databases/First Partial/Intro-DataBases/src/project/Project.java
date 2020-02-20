package project;

import stages.AnalysisStage;
import stages.DesignStage;
import stages.ImplemStage;

import java.util.Calendar;

public class Project {
    String name;
    Calendar startDate;
    Integer durationDays;
    AnalysisStage analysisStage;
    DesignStage designStage;
    ImplemStage implemStage;

    public Project(String name, Calendar startDate, Integer durationDays) {
        this.name = name;
        this.startDate = startDate;
        this.durationDays = durationDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public void setDurationDays(Integer durationDays) {
        this.durationDays = durationDays;
    }

    public String getName() {
        return name;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public Integer getDurationDays() {
        return durationDays;
    }
}
