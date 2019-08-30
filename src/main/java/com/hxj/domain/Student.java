package com.hxj.domain;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
public class Student {

    private int sid;
    private String sname;
    private String major;
    private StuClass stuClass;

    public Student() {
    }

    public Student(String sname, String major) {
        this.sname = sname;
        this.major = major;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public StuClass getStuClass() {
        return stuClass;
    }

    public void setStuClass(StuClass stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", major='" + major + '\'' +
                ", stuClass=" + stuClass +
                '}';
    }
}
