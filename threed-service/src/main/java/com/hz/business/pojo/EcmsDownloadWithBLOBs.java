package com.hz.business.pojo;

import java.io.Serializable;

public class EcmsDownloadWithBLOBs extends EcmsDownload implements Serializable {
    private String softsay;

    private String morepic;

    private static final long serialVersionUID = 1L;

    public String getSoftsay() {
        return softsay;
    }

    public void setSoftsay(String softsay) {
        this.softsay = softsay == null ? null : softsay.trim();
    }

    public String getMorepic() {
        return morepic;
    }

    public void setMorepic(String morepic) {
        this.morepic = morepic == null ? null : morepic.trim();
    }
}