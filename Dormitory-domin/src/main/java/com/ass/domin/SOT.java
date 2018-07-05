package com.ass.domin;

import java.util.Date;

public class SOT {
    private String name;
    private String address;
    private String pNumber;
    private String birth;
    private String ID;
    private String password;
    private String sex;
    private  boolean type;
    public SOT(){}

    public SOT(String name, String address, String pNumber, String birth, String ID, String password, String sex, boolean type) {
        this.name = name;
        this.address = address;
        this.pNumber = pNumber;
        this.birth = birth;
        this.ID = ID;
        this.password = password;
        this.sex = sex;
        this.type = type;
    }
}
