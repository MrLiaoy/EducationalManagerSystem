package com.ems.vo;

/**
 * @author czb
 * @date 2019/9/3 - 10:13
 */
public class StudentChoseCourse {
    //课程名称
    private String cName;
    //选课表id
    private Integer sCId;
    //学生学号
    private String sId;
    //课程表id
    private Integer cId;
    //课程成绩
    private Integer sScore;
    //评教成绩
    private Integer tScore;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getsCId() {
        return sCId;
    }

    public void setsCId(Integer sCId) {
        this.sCId = sCId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }

    public Integer gettScore() {
        return tScore;
    }

    public void settScore(Integer tScore) {
        this.tScore = tScore;
    }

    @Override
    public String toString() {
        return "StudentChoseCourse{" +
                "cName='" + cName + '\'' +
                ", sCId=" + sCId +
                ", sId='" + sId + '\'' +
                ", cId=" + cId +
                ", sScore=" + sScore +
                ", tScore=" + tScore +
                '}';

    }
}
