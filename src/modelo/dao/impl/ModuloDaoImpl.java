/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import modelo.dao.ModuloDao;
import modelo.generic.dao.Crud;

/**
 *
 * @author emedina
 */
public class ModuloDaoImpl implements Crud{

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
    public List<ModuloDao> select() {
        String query = createQuerySelect();
        List<ModuloDao> result =  (List<ModuloDao>)(Object)CrudOperation.select(query,new ModuloDao());
        return result;
    }
    
     private String createQuerySelect() {
        String query = "";
        query += "SELECT" + " ";
        query += "*"      + " ";
        query += "FROM"   + " ";
        query += "modulo";
        return query;
    }
}