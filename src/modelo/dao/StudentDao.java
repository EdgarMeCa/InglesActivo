/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.Date;

/**
 *
 * @author emedina
 */
public class StudentDao {
    private int id; //PK
    private String name;
    private String lastname1;
    private String lastname2;
    private String homePhone;
    private String personalPhone;
    private String address;
    private String email;
    private String curp;
    private String picture;
    private String schoolLevel;
    private String provenence;
    private Date startDate;
    private Date endDate;
    private int level; //FK

    public StudentDao() {
        
    }

    public StudentDao(int id, String name, String lastname1, String lastname2, String homePhone, String personalPhone, String address, String email, String curp, String picture, String schoolLevel, String provenence, Date startDate, Date endDate, int level) {
        this.id = id;
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.homePhone = homePhone;
        this.personalPhone = personalPhone;
        this.address = address;
        this.email = email;
        this.curp = curp;
        this.picture = picture;
        this.schoolLevel = schoolLevel;
        this.provenence = provenence;
        this.startDate = startDate;
        this.endDate = endDate;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public String getProvenence() {
        return provenence;
    }

    public void setProvenence(String provenence) {
        this.provenence = provenence;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
}
