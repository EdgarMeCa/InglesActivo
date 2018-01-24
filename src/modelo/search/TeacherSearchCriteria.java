/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

/**
 *
 * @author EMEDINA
 */
public class TeacherSearchCriteria {
    private String name;
    private String lastname1;
    private String lastname2;

    public TeacherSearchCriteria(String name, String lastname1, String lastname2) {
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
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
}
