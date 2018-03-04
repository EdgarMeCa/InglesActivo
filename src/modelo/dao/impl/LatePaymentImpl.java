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
import modelo.dao.LatePaymentDao;
import modelo.generic.dao.Crud;

/**
 *
 * @author emedina
 */
public class LatePaymentImpl implements Crud {
    
    @Override
    public boolean insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LatePaymentDao> select() {
        String query = createQuerySelect();
        ResultSet result = CrudOperation.select(query);
        List<LatePaymentDao> list = resultSetToList(result);
        return list;
    }
    
    private String createQuerySelect() {
        String query = "";
        query += "SELECT"                   + " ";
        query += "s.Name,"                  + " ";
        query += "s.LName1,"                + " ";
        query += "s.LName2,"                + " ";
        query += "g.Schedule,"              + " ";
        query += "g.StartDate"              + " ";
        query += "FROM"                     + " ";
        query += "student s"                + " ";
        query += "INNER JOIN"               + " ";
        query += "studentgroup sg"          + " ";
        query += "ON"                       + " ";
        query += "s.idStudent = sg.Student" + " ";
        query += "INNER JOIN"               + " ";
        query += "groupset g"               + " ";
        query += "ON"                       + " ";
        query += "g.IdGroup = sg.GroupSet"  + " ";
        query += "INNER JOIN"               + " ";
        query += "Status e"                 + " ";
        query += "ON"                       + " ";
        query += "e.IdStatus = g.Status"    + " ";
        query += "WHERE"                    + " ";
        query += "sg.PaymentDetail IS NULL" + " ";
        query += "AND"                      + " ";
        query += "e.Code = 'ACTIVO'";
        return query;
    }
    
    private List<LatePaymentDao> resultSetToList(ResultSet result){
        List<LatePaymentDao> list = new ArrayList<>();
        try {
            while(result.next()) {
                list.add(fillDao(result));
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    private LatePaymentDao fillDao (ResultSet element) throws SQLException{
        LatePaymentDao object = new LatePaymentDao();
        object.setName(element.getString(1));
        object.setLastname1(element.getString(2));
        object.setLastname2(element.getString(3));
        object.setSchedule(element.getTime(4).toString());
        object.setCreateTime(element.getDate(5));
        return object;
    }
}