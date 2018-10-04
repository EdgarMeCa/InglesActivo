/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import modelo.dao.TeacherDao;
import modelo.generic.dao.QueryCreatable;

/**
 *
 * @author EMEDINA
 */
class TeacherDaoQueryImpl implements QueryCreatable{
    
    private TeacherDao teacherDao;
    
    protected TeacherDaoQueryImpl() {
        
    }
    
    protected TeacherDaoQueryImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public String createInsertQuery() {
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

    @Override
    public String createUpdateQuery() {
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

    @Override
    public String createDeleteQuery() {
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

    @Override
    public String createSelectQuery() {
        String query = "";
        query += "SELECT" + " ";
        query += "*"      + " ";
        query += "FROM"   + " ";
        query += "teacher";
        return query;
    }
}