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
public class GroupDao {
    private int id; //PK
    private int capacity;
    private String type;
    private Date schedule;
    private Date startDate;
    private Date endDate;
    private int status; //FK
    private int modulo; //FK
    private int teacher; //FK

    public GroupDao() {
        
    }

    public GroupDao(int id, int capacity, String type, Date schedule, Date startDate, Date endDate, int status, int modulo, int teacher) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.modulo = modulo;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }       
}
