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
public class PaymentDetailDao {
    private int id;
    private int hours;
    private double pay;
    private String payType;
    private Date date;
    private int payment; //FK
    private int studentGroup; //FK

    public PaymentDetailDao() {
        
    }

    public PaymentDetailDao(int id, int hours, double pay, String payType, Date date, int payment, int studentGroup) {
        this.id = id;
        this.hours = hours;
        this.pay = pay;
        this.payType = payType;
        this.date = date;
        this.payment = payment;
        this.studentGroup = studentGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    } 
}
