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
public class ModuloDao {
    private int id; //PK
    private String code;
    private String description;
    private int status; //FK

    public ModuloDao() {
        
    }

    public ModuloDao(int id, String code, String description, int status) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public Object[] toArray() {
        Object[] array = {this.id,this.code,this.description,this.status};
        return array;
    }
}