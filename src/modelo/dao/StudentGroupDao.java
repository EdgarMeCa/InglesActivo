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
public class StudentGroupDao {
    private int id;
    private int score;
    private int student; //FK
    private int group;   //FK

    public StudentGroupDao() {
        
    }

    public StudentGroupDao(int id, int score, int student, int group) {
        this.id = id;
        this.score = score;
        this.student = student;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
