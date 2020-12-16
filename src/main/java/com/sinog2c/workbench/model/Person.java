package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/26  9:22
 */
public class Person implements Serializable {
    private String uid;
    private String chargeman;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getChargeman() {
        return chargeman;
    }

    public void setChargeman(String chargeman) {
        this.chargeman = chargeman;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String tel;
    private String name;


    public List<User> getChildren() {
        return children;
    }

    public void setChildren(List<User> children) {
        this.children = children;
    }

    private List<User> children;
}
