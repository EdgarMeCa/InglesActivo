/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;
import java.util.Date;

/**
 *
 * @author emedina
 */
public class ConvertDate {
    
    private ConvertDate(){
        
    }
    
    public static java.sql.Date toSqlDate(Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    
}
