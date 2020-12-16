package com.sinog2c.workbench.model;

import java.io.Serializable;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/25  20:48
 */
public class User implements Serializable {

    private String huid;
    private String hchargeman;
    private String htel;
    private String hname;

    public String getHuid() {
        return huid;
    }

    public void setHuid(String huid) {
        this.huid = huid;
    }

    public String getHchargeman() {
        return hchargeman;
    }

    public void setHchargeman(String hchargeman) {
        this.hchargeman = hchargeman;
    }

    public String getHtel() {
        return htel;
    }

    public void setHtel(String htel) {
        this.htel = htel;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }


}
