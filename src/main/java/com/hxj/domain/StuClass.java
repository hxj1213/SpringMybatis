package com.hxj.domain;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
public class StuClass {

    private int cid;
    private String cname;

    public StuClass() {
    }

    public StuClass(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "StuClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
