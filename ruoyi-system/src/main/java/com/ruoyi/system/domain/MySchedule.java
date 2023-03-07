package com.ruoyi.system.domain;
import com.ruoyi.common.core.domain.BaseEntity;

public class MySchedule extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Integer scheduleId;

    private Long StaffId;

    private String weekDate;

    private String ismorning;

    private String isnoon;

    private String ismidnight;


    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getStaffId() {
        return StaffId;
    }

    public void setStaffId(Long staffId) {
        StaffId = staffId;
    }

    public String getWeekDate() {
        return weekDate;
    }

    public void setWeekDate(String weekDate) {
        this.weekDate = weekDate;
    }

    public String getIsmorning() {
        return ismorning;
    }

    public void setIsmorning(String ismorning) {
        this.ismorning = ismorning;
    }

    public String getIsnoon() {
        return isnoon;
    }

    public void setIsnoon(String isnoon) {
        this.isnoon = isnoon;
    }

    public String getIsmidnight() {
        return ismidnight;
    }

    public void setIsmidnight(String ismidnight) {
        this.ismidnight = ismidnight;
    }


    @Override
    public String toString() {
        return "MySchedule{" +
                "scheduleId=" + scheduleId +
                ", StaffId=" + StaffId +
                ", weekDate='" + weekDate + '\'' +
                ", ismorning='" + ismorning + '\'' +
                ", isnoon='" + isnoon + '\'' +
                ", ismidnight='" + ismidnight + '\'' +
                '}';
    }
}
