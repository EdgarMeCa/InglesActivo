/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search.criteria;

import java.util.Date;

/**
 *
 * @author emedina
 */
public class StudentSearchCriteria {
    private String name;
    private String lastname1;
    private String lastname2;
    private Date initialDate;
    private Date endDate;
    private String schoolLevel;

    public StudentSearchCriteria(String name, String lastname1, String lastname2, Date initialDate, Date endDate, String schoolLevel) {
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.schoolLevel = schoolLevel;
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

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }
}
