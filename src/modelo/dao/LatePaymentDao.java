/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Date;

/**
 *
 * @author emedina
 */
public class LatePaymentDao {
    private String name;
    private String lastname1;
    private String lastname2;
    private String schedule;
    private Date createTime;

    public LatePaymentDao() {
        
    }

    public LatePaymentDao(String name, String lastname1, String lastname2, String schedule, java.sql.Date createTime) {
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.schedule = schedule;
        this.createTime = createTime;
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    } 

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Date createTime) {
        this.createTime = createTime;
    }
}
