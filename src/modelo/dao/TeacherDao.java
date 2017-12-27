/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class TeacherDao {
   
    private int id; //PK
    private String name;
    private String firstLastName;
    private String secondLastName;
    private String homePhone;
    private String personalPhone;
    private String address;
    private String personalEmail;
    private String workEmail;
    private String password;
    private String curp;
    private String cedula;
    private String experience;
    private String picture;
    private Date startDate;
    private Date endDate;
    private int level;  //FK
    private int status; //FK
    
    public TeacherDao() {
        
    }

    public TeacherDao(int id, String name, String firstLastName, String secondLastName, String homePhone, String personalPhone, String address, String personalEmail, String workEmail, String password, String curp, String cedula, String experience, String picture, Date startDate, Date endDate, int level, int status) {
        this.id = id;
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.homePhone = homePhone;
        this.personalPhone = personalPhone;
        this.address = address;
        this.personalEmail = personalEmail;
        this.workEmail = workEmail;
        this.password = password;
        this.curp = curp;
        this.cedula = cedula;
        this.experience = experience;
        this.picture = picture;
        this.startDate = startDate;
        this.endDate = endDate;
        this.level = level;
        this.status = status;
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

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
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

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
