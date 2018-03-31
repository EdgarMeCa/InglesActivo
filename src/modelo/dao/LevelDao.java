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
public class LevelDao {
    private int id;
    private String code;
    private String description;

    public LevelDao() {
        
    }

    public LevelDao(int id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
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
    
     @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelDao)) {
            return false;
        }
        LevelDao status = (LevelDao) obj;
        if (id != status.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = (hash * 97) + this.id + code.hashCode() + description.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return code;
    }
}
