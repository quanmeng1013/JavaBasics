package com.basic.designpattern.prototype;

import java.util.Date;

public class Sheep implements  Cloneable{

    private String sname;
    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Sheep() {}
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
