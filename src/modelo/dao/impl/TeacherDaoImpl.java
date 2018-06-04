/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import modelo.generic.dao.Crud;
import modelo.dao.TeacherDao;

/**
 *
 * @author ASUS
 */
public class TeacherDaoImpl implements Crud {
    private TeacherDao teacherDao;

    /**
     *
     */
    public TeacherDaoImpl() {
        
    }

    /**
     *
     * @param teacherDao
     */
    public TeacherDaoImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
    
    @Override
    public boolean insert() {
        String query = createQueryInsert(); 
        boolean result = CrudOperation.insert(query);
        return result;
    }

    @Override
    public boolean delete() {
        String query = createQueryDelete();
        boolean result = CrudOperation.delete(query);
        return result;
    }

    @Override
    public boolean update() {
        String query = createQueryUpdate();
        boolean result = CrudOperation.update(query);
        return result;
    }

    @Override
    public List<TeacherDao> select() {
        String query = createQuerySelect();
        List<TeacherDao> list = (List<TeacherDao>)(Object)CrudOperation.select(query,new TeacherDao());
        return list;
    }
    
     private String createQueryInsert() {
        String query = "";
        query += "INSERT INTO" + " ";
        query += "teacher"     + " ";
        query += "VALUES"      + " ";
        query += "("           + " ";
        query += "null"                                     + ",";
        query += "'" + teacherDao.getName()           + "'" + ",";
        query += "'" + teacherDao.getFirstLastName()  + "'" + ",";
        query += "'" + teacherDao.getSecondLastName() + "'" + ",";
        query += "'" + teacherDao.getHomePhone()      + "'" + ",";
        query += "'" + teacherDao.getPersonalPhone()  + "'" + ",";
        query += "'" + teacherDao.getPersonalEmail()  + "'" + ",";
        query += "'" + teacherDao.getWorkEmail()      + "'" + ",";
        query += "'" + teacherDao.getPassword()       + "'" + ",";
        query += "'" + teacherDao.getCurp()           + "'" + ",";
        query += "'" + teacherDao.getCedula()         + "'" + ",";
        query += "'" + teacherDao.getExperience()     + "'" + ",";
        query += "'" + teacherDao.getPicture()        + "'" + ",";
        query += "'" + teacherDao.getStartDate()      + "'" + ",";
        if(teacherDao.getEndDate() != null)
        {
            query += "'" + teacherDao.getEndDate()        + "'" + ",";
        }
        else 
        {
            query += "null" + ",";
        }
        query += "'" + teacherDao.getAddress()        + "'" + ",";
        query += "'" + teacherDao.getLevel()          + "'" + ",";
        query += "'" + teacherDao.getStatus()         + "'";
        query += ")";
        return query;
    }
     
    private String createQueryUpdate() {
        String query = "";
        query += "UPDATE"  + " ";
        query += "teacher" + " ";
        query += "SET"     + " ";
        query += "Name"          + " = " + teacherDao.getName()           + ",";
        query += "LName1"        + " = " + teacherDao.getFirstLastName()  + ",";
        query += "LName2"        + " = " + teacherDao.getSecondLastName() + ",";
        query += "PhoneHome"     + " = " + teacherDao.getHomePhone()      + ",";
        query += "PhonePersonal" + " = " + teacherDao.getPersonalPhone()  + ",";
        query += "EmailPersonal" + " = " + teacherDao.getPersonalEmail()  + ",";
        query += "EmailWork"     + " = " + teacherDao.getWorkEmail()      + ",";
        query += "Password"      + " = " + teacherDao.getPassword()       + ",";
        query += "Curp"          + " = " + teacherDao.getCurp()           + ",";
        query += "Cedula"        + " = " + teacherDao.getCedula()         + ",";
        query += "Experience"    + " = " + teacherDao.getExperience()     + ",";
        query += "Picture"       + " = " + teacherDao.getPicture()        + ",";
        query += "StartDate"     + " = " + teacherDao.getStartDate()      + ",";
        query += "EndDate"       + " = " + teacherDao.getEndDate()        + ",";
        query += "Address"       + " = " + teacherDao.getAddress()        + ",";
        query += "Level"         + " = " + teacherDao.getLevel()          + ",";
        query += "Status"        + " = " + teacherDao.getStatus()         + " ";
        query += "WHERE"                                                  + " ";
        query += "idTeacher"     + " = " + teacherDao.getId();
        return query;
    }
    
    private String createQueryDelete() {
        String query = "";
        query += "DELETE"    + " ";
        query += "FROM"      + " ";
        query += "teacher"   + " ";
        query += "WHERE"     + " ";
        query += "idTeacher" + " ";
        query += "="         + " ";
        query += teacherDao.getId();
        return query;
    }
    
    private String createQuerySelect() {
        String query = "";
        query += "SELECT" + " ";
        query += "*"      + " ";
        query += "FROM"   + " ";
        query += "teacher";
        return query;
    }
}