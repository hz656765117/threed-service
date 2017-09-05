package com.hz.business.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private String password;

    private String rnd;

    private String email;

    private Integer registertime;

    private Short groupid;

    private Integer userfen;

    private Integer userdate;

    private Float money;

    private Short zgroupid;

    private Boolean havemsg;

    private Boolean checked;

    private String salt;

    private String userkey;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRnd() {
        return rnd;
    }

    public void setRnd(String rnd) {
        this.rnd = rnd == null ? null : rnd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Integer registertime) {
        this.registertime = registertime;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Integer getUserfen() {
        return userfen;
    }

    public void setUserfen(Integer userfen) {
        this.userfen = userfen;
    }

    public Integer getUserdate() {
        return userdate;
    }

    public void setUserdate(Integer userdate) {
        this.userdate = userdate;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Short getZgroupid() {
        return zgroupid;
    }

    public void setZgroupid(Short zgroupid) {
        this.zgroupid = zgroupid;
    }

    public Boolean getHavemsg() {
        return havemsg;
    }

    public void setHavemsg(Boolean havemsg) {
        this.havemsg = havemsg;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }
}