/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.*;


/**
 *
 * @author ASUS
 */
public class DatabaseUtil {
    
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
        return object;
    }
    
    private static GroupDao fillDao (ResultSet element, GroupDao dao) throws SQLException{
        GroupDao object = new GroupDao();
        return object;
    }
    
    private static LevelDao fillDao (ResultSet element, LevelDao dao) throws SQLException{
        LevelDao object = new LevelDao();
        return object;
    }
    
    private static StatusDao fillDao (ResultSet element, StatusDao dao) throws SQLException{
        StatusDao object = new StatusDao();
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
        return object;
    }  
}
