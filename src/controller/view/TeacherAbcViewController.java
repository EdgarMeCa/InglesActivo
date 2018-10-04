/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.view;

import enums.actions.ViewMode;
import ia.screen.components.enhacement.ComboBoxEnhacement;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.dao.LevelDao;
import modelo.dao.StatusDao;
import modelo.dao.TeacherDao;
import modelo.dao.impl.LevelDaoImpl;
import modelo.dao.impl.StatusDaoImpl;
import modelo.dao.util.ResultsDaoUtil;
import vista.TeacherUI_ABC;

/**
 *
 * @author EMEDINA
 */
public class TeacherAbcViewController {
    private TeacherUI_ABC teacherUI;
    private ViewMode mode;
    private TeacherDao dao;
    
    public TeacherAbcViewController (TeacherUI_ABC teacherUI, ViewMode mode){
        this.teacherUI = teacherUI;
        this.mode = mode;
    }
    
     public TeacherAbcViewController (TeacherUI_ABC teacherUI, ViewMode mode, TeacherDao dao){
        this.teacherUI = teacherUI;
        this.mode = mode;
        this.dao = dao;
    }
    
    
    private void fillStatusCombo() {
        List<StatusDao> resultList = new StatusDaoImpl().select();
        DefaultComboBoxModel model = new ComboBoxEnhacement().fillComboBox(resultList);
        teacherUI.getjComboBoxStatus().setModel(model);
        if (mode == ViewMode.SEARCH) {
            StatusDao selected = ResultsDaoUtil.getStatusById(resultList, dao.getStatus());
            teacherUI.getjComboBoxStatus().setSelectedItem(selected);
        }
    }
    
    private void fillLevelCombo() {
        List<LevelDao> resultList = new LevelDaoImpl().select();
        DefaultComboBoxModel model = new ComboBoxEnhacement().fillComboBox(resultList);
        teacherUI.getjComboBoxLevel().setModel(model); 
        if (mode == ViewMode.SEARCH) {
            LevelDao selected = ResultsDaoUtil.getLevelById(resultList, dao.getLevel());
            teacherUI.getjComboBoxLevel().setSelectedItem(selected);
        }
    }
}