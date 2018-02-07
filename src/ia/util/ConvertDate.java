/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

/**
 *
 * @author emedina
 */
public class ConvertDate {
    
    private ConvertDate(){
        
    }
    
    public static java.sql.Date toSqlDate(java.util.Date date) {
        java.sql.Date sqlDate = null;
        if (date != null) {
            sqlDate = new java.sql.Date(date.getTime());
        }
        return sqlDate;
    }
}
