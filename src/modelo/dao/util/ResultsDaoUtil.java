/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.util;

import java.util.List;
import modelo.dao.*;

/**
 *
 * @author EMEDINA
 */
public class ResultsDaoUtil{
    
    /**
     *
     * @param list
     * @param id
     * @return
     */
    public static StatusDao getStatusById(List<StatusDao> list, int id) {
        StatusDao dao = null;
        for (StatusDao element : list) {
            if (element.getId() == id) {
                dao = element;
                break;
            }
        }
        return dao;
    }
    
    /**
     *
     * @param list
     * @param id
     * @return
     */
    public static LevelDao getLevelById(List<LevelDao> list, int id) {
        LevelDao dao = null;
        for (LevelDao element : list) {
            if (element.getId() == id) {
                dao = element;
                break;
            }
        }
        return dao;
    }
    
    
}
