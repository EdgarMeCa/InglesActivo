/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

/**
 *
 * @author emedina
 */
public class PaymentDao {
    private int id; //PK
    private String code;
    private String description;
    private double promotionalCost;
    private double generalCost;

    public PaymentDao() {
        
    }

    public PaymentDao(int id, String code, String description, double promotionalCost, double generalCost) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.promotionalCost = promotionalCost;
        this.generalCost = generalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPromotionalCost() {
        return promotionalCost;
    }

    public void setPromotionalCost(double promotionalCost) {
        this.promotionalCost = promotionalCost;
    }

    public double getGeneralCost() {
        return generalCost;
    }

    public void setGeneralCost(double generalCost) {
        this.generalCost = generalCost;
    } 
}
