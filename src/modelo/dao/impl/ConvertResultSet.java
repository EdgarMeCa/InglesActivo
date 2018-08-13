/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.*;


/**
 *
 * @author ASUS
 */
public class ConvertResultSet {
    
    /**
     *
     * @param result
     * @param daoType
     * @return
     */
    public static List<Object> resultSetToList(ResultSet result, Object daoType){
        List<Object> list = new ArrayList<>();
        try {
            while(result.next()) {
                list.add(convertToDao(result,daoType));
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    private static Object convertToDao(ResultSet result, Object dao) throws SQLException{
        if(dao instanceof LatePaymentDao) {
            return fillDao(result,(LatePaymentDao)dao);
        }
        if(dao instanceof StatusDao) {
            return fillDao(result,(StatusDao)dao);
        }
        if(dao instanceof LevelDao) {
            return fillDao(result,(LevelDao)dao);
        }
        if(dao instanceof TeacherDao) {
            return fillDao(result,(TeacherDao)dao);
        }
        if(dao instanceof StudentDao) {
            return fillDao(result,(StudentDao)dao);
        }
        return null;
    }
    
    private static LatePaymentDao fillDao (ResultSet element,LatePaymentDao dao) throws SQLException{
        LatePaymentDao object = new LatePaymentDao();
        object.setName(element.getString(1));
        object.setLastname1(element.getString(2));
        object.setLastname2(element.getString(3));
        object.setSchedule(element.getTime(4).toString());
        object.setCreateTime(element.getDate(5));
        return object;
    }
    
    private static TeacherDao fillDao (ResultSet element, TeacherDao dao) throws SQLException{
        TeacherDao object = new TeacherDao();
        object.setId(element.getInt(null));
        object.setName(element.getString(null));
        object.setFirstLastName(element.getString(null));
        object.setSecondLastName(element.getString(null));
        object.setAddress(element.getString(null));
        object.setCedula(element.getString(null));
        object.setCurp(element.getString(null));
        object.setEndDate(element.getDate(null));
        object.setExperience(element.getString(null));
        object.setHomePhone(element.getString(null));
        object.setLevel(element.getInt(null));
        object.setPassword(element.getString(null));
        object.setPersonalEmail(element.getString(null));
        object.setPersonalPhone(element.getString(null));
        object.setPicture(element.getString(null));
        object.setStartDate(element.getDate(null));
        object.setStatus(element.getInt(null));
        object.setWorkEmail(element.getString(null));
        return object;
    }
    
    private static GroupDao fillDao (ResultSet element, GroupDao dao) throws SQLException{
        GroupDao object = new GroupDao();
        return object;
    }
    
    private static LevelDao fillDao (ResultSet element, LevelDao dao) throws SQLException{
        LevelDao object = new LevelDao();
        object.setId(element.getInt(1));
        object.setCode(element.getString(2));
        object.setDescription(element.getString(3));
        return object;
    }
    
    private static StatusDao fillDao (ResultSet element, StatusDao dao) throws SQLException{
        StatusDao object = new StatusDao();
        object.setId(element.getInt(1));
        object.setCode(element.getString(2));
        object.setDescription(element.getString(3));
        return object;
    }
    
    private static ModuloDao fillDao (ResultSet element, ModuloDao dao) throws SQLException{
        ModuloDao object = new ModuloDao();
        return object;
    }
    
    private static PaymentDao fillDao (ResultSet element, PaymentDao dao) throws SQLException{
        PaymentDao object = new PaymentDao();
        return object;
    }
    
    private static StudentDao fillDao (ResultSet element, StudentDao dao) throws SQLException{
        StudentDao object = new StudentDao();
        object.setId(element.getInt(1));
        object.setName(element.getString(2));
        object.setLastname1(element.getString(3));
        return object;
    }  
}