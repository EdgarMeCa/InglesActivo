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
public class PresenceDao {
    private int id;
    private boolean value;
    private String description;
    private int studentGroup; //FK

    public PresenceDao() {
        
    }

    public PresenceDao(int id, boolean value, String description, int studentGroup) {
        this.id = id;
        this.value = value;
        this.description = description;
        this.studentGroup = studentGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    }
}
