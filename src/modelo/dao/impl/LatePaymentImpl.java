/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

/**
 *
 * @author emedina
 */
public class LatePaymentImpl {
    
    private String createQuery4LatePayments() {
        String query = "";
        query += "SELECT"      + " ";
        query += "a.Nombre,"   + " ";
        query += "a.Apaterno," + " ";
        query += "a.Amaterno," + " ";
        query += "g.Horario"   + " ";
        query += "FROM"        + " ";
        query += "Alumno a"    + " ";
        query += "INNER JOIN"  + " ";
        query += "" + "";
        return query;
    }
    
}
