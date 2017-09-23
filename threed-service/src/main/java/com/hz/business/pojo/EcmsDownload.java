package com.hz.business.pojo;

import java.io.Serializable;

public class EcmsDownload implements Serializable {
    private Integer id;

    private Short classid;

    private Short ttid;

    private Integer onclick;

    private Integer plnum;

    private Integer totaldown;

    private String newspath;

    private String filename;

    private Integer userid;

    private String username;

    private Boolean firsttitle;

    private Boolean isgood;

    private Boolean ispic;

    private Boolean istop;

    private Boolean isqf;

    private Boolean ismember;

    private Boolean isurl;

    private Integer truetime;

    private Integer lastdotime;

    private Boolean havehtml;

    private Short groupid;

    private Short userfen;

    private String titlefont;

    private String titleurl;

    private Byte stb;

    private Byte fstb;

    private Byte restb;

    private String keyboard;

    private String title;

    private Integer newstime;

    private String titlepic;

    private String softfj;

    private String language;

    private String softtype;

    private String softsq;

    private Boolean star;

    private String filetype;

    private String filesize;

    private String version;

    private String style;

    private Integer sort;

    private Integer sonsort;

    private String jifen;

    private String label;
    
    private String downpath;

    private String picdown;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getClassid() {
        return classid;
    }

    public void setClassid(Short classid) {
        this.classid = classid;
    }

    public Short getTtid() {
        return ttid;
    }

    public void setTtid(Short ttid) {
        this.ttid = ttid;
    }

    public Integer getOnclick() {
        return onclick;
    }

    public void setOnclick(Integer onclick) {
        this.onclick = onclick;
    }

    public Integer getPlnum() {
        return plnum;
    }

    public void setPlnum(Integer plnum) {
        this.plnum = plnum;
    }

    public Integer getTotaldown() {
        return totaldown;
    }

    public void setTotaldown(Integer totaldown) {
        this.totaldown = totaldown;
    }

    public String getNewspath() {
        return newspath;
    }

    public void setNewspath(String newspath) {
        this.newspath = newspath == null ? null : newspath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

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

    public Boolean getFirsttitle() {
        return firsttitle;
    }

    public void setFirsttitle(Boolean firsttitle) {
        this.firsttitle = firsttitle;
    }

    public Boolean getIsgood() {
        return isgood;
    }

    public void setIsgood(Boolean isgood) {
        this.isgood = isgood;
    }

    public Boolean getIspic() {
        return ispic;
    }

    public void setIspic(Boolean ispic) {
        this.ispic = ispic;
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    public Boolean getIsqf() {
        return isqf;
    }

    public void setIsqf(Boolean isqf) {
        this.isqf = isqf;
    }

    public Boolean getIsmember() {
        return ismember;
    }

    public void setIsmember(Boolean ismember) {
        this.ismember = ismember;
    }

    public Boolean getIsurl() {
        return isurl;
    }

    public void setIsurl(Boolean isurl) {
        this.isurl = isurl;
    }

    public Integer getTruetime() {
        return truetime;
    }

    public void setTruetime(Integer truetime) {
        this.truetime = truetime;
    }

    public Integer getLastdotime() {
        return lastdotime;
    }

    public void setLastdotime(Integer lastdotime) {
        this.lastdotime = lastdotime;
    }

    public Boolean getHavehtml() {
        return havehtml;
    }

    public void setHavehtml(Boolean havehtml) {
        this.havehtml = havehtml;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getUserfen() {
        return userfen;
    }

    public void setUserfen(Short userfen) {
        this.userfen = userfen;
    }

    public String getTitlefont() {
        return titlefont;
    }

    public void setTitlefont(String titlefont) {
        this.titlefont = titlefont == null ? null : titlefont.trim();
    }

    public String getTitleurl() {
        return titleurl;
    }

    public void setTitleurl(String titleurl) {
        this.titleurl = titleurl == null ? null : titleurl.trim();
    }

    public Byte getStb() {
        return stb;
    }

    public void setStb(Byte stb) {
        this.stb = stb;
    }

    public Byte getFstb() {
        return fstb;
    }

    public void setFstb(Byte fstb) {
        this.fstb = fstb;
    }

    public Byte getRestb() {
        return restb;
    }

    public void setRestb(Byte restb) {
        this.restb = restb;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard == null ? null : keyboard.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getNewstime() {
        return newstime;
    }

    public void setNewstime(Integer newstime) {
        this.newstime = newstime;
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic == null ? null : titlepic.trim();
    }

    public String getSoftfj() {
        return softfj;
    }

    public void setSoftfj(String softfj) {
        this.softfj = softfj == null ? null : softfj.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSofttype() {
        return softtype;
    }

    public void setSofttype(String softtype) {
        this.softtype = softtype == null ? null : softtype.trim();
    }

    public String getSoftsq() {
        return softsq;
    }

    public void setSoftsq(String softsq) {
        this.softsq = softsq == null ? null : softsq.trim();
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSonsort() {
        return sonsort;
    }

    public void setSonsort(Integer sonsort) {
        this.sonsort = sonsort;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen == null ? null : jifen.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

	public String getDownpath() {
		return downpath;
	}

	public void setDownpath(String downpath) {
		this.downpath = downpath;
	}

	public String getPicdown() {
		return picdown;
	}

	public void setPicdown(String picdown) {
		this.picdown = picdown;
	}
    
    
    
    
}