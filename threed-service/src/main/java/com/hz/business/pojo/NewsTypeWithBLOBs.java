package com.hz.business.pojo;

import java.io.Serializable;

public class NewsTypeWithBLOBs extends NewsType implements Serializable {
    private String sonclass;

    private String featherclass;

    private String classpath;

    private String intro;

    private String qaddgroupid;

    private String cgroupid;

    private static final long serialVersionUID = 1L;

    public String getSonclass() {
        return sonclass;
    }

    public void setSonclass(String sonclass) {
        this.sonclass = sonclass == null ? null : sonclass.trim();
    }

    public String getFeatherclass() {
        return featherclass;
    }

    public void setFeatherclass(String featherclass) {
        this.featherclass = featherclass == null ? null : featherclass.trim();
    }

    public String getClasspath() {
        return classpath;
    }

    public void setClasspath(String classpath) {
        this.classpath = classpath == null ? null : classpath.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getQaddgroupid() {
        return qaddgroupid;
    }

    public void setQaddgroupid(String qaddgroupid) {
        this.qaddgroupid = qaddgroupid == null ? null : qaddgroupid.trim();
    }

    public String getCgroupid() {
        return cgroupid;
    }

    public void setCgroupid(String cgroupid) {
        this.cgroupid = cgroupid == null ? null : cgroupid.trim();
    }
}