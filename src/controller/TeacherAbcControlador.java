/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ia.util.ConvertDate;
import ia.util.FileChooser;
import ia.util.Picture;
import ia.util.MessageUtil;
import javax.swing.JPanel;;
import vista.TeacherUI_ABC;
import modelo.dao.impl.TeacherDaoImpl;
import enums.actions.ViewMode;
import modelo.dao.TeacherDao;
import vista.PrincipalUI;
import controller.view.TeacherAbcViewController;

/**
 *
 * @author emedina
 */
public class TeacherAbcControlador extends TeacherAbcViewController {
    private TeacherUI_ABC teacherUI;
    private TeacherDao dao;
    
    /**
     * This construct is to create a new Teacher record in the database
     * @param teacherUI
     * @param mode
     */
    public TeacherAbcControlador(TeacherUI_ABC teacherUI,ViewMode mode) {
        super(teacherUI,mode);
        this.teacherUI = teacherUI;
        this.dao = new TeacherDao();
    }
    
    /**
     * This construct is to update or delete a Teacher record for the database
     * @param teacherUI
     * @param dao
     * @param mode
     */
    public TeacherAbcControlador(TeacherUI_ABC teacherUI,TeacherDao dao ,ViewMode mode) {
        super(teacherUI,mode,dao);
        this.teacherUI = teacherUI;
        this.dao = dao;
    }
    
    /**
     * Load the picture into the form panel
     */
    public void loadPicture() {
        FileChooser chooser = new FileChooser();
        if(chooser.getPath() != null)
        {
        JPanel panelPicture = teacherUI.getjPanelPicture();
        Picture picture = new Picture(panelPicture.getWidth(),panelPicture.getHeight(),chooser.getPath());
        dao.setPicture(chooser.getPath());
        panelPicture.removeAll();
        panelPicture.add(picture);
        panelPicture.repaint();
        }
    }
    
    /**
     * Delete the picture in the form panel
     */
    public void erasePicture() {
        JPanel panelPicture = teacherUI.getjPanelPicture();
        panelPicture.removeAll();
        panelPicture.repaint();
    }
    
    /**
     * Clear all the information in the components from the screen
     */
    public void clear() {
        teacherUI.getjTextName().setText(null);
        teacherUI.getjTextLastName1().setText(null);
        teacherUI.getjTextLastName2().setText(null);
        teacherUI.getjTextAddress().setText(null);
        teacherUI.getjTextAreaExperience().setText(null);
        teacherUI.getjTextCedula().setText(null);
        teacherUI.getjTextCurp().setText(null);
        teacherUI.getjTextEmailPersonal().setText(null);
        teacherUI.getjTextEmailWork().setText(null);
        teacherUI.getjTextPhoneHome().setText(null);
        teacherUI.getjTextPhonePersonal().setText(null);
        teacherUI.getjComboBoxLevel().setSelectedIndex(0);
        teacherUI.getjComboBoxStatus().setSelectedIndex(0);
        teacherUI.getjDateStart().setDate(null);
        teacherUI.getjDateEnd().setDate(null);
        teacherUI.getjTextPassword().setText(null);
    }
    
    /**
     * Insert the information from the screen into the database
     */
    public void insertData() {
        boolean isUpdate;
        this.loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(dao);
        isUpdate = impl.insert();
        if(isUpdate)
        {
            this.clear();
            MessageUtil.databaseInsertSuccessMessage();
        }
        else 
        {
            MessageUtil.databaseInsertErrorMessage();
        }
    }
    
    public void updateData() {
        boolean isUpdate;
        this.loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(dao);
        isUpdate = impl.update();
        if(isUpdate)
        {
            this.clear();
            MessageUtil.databaseUpdateSuccessMessage();
        }
        else 
        {
            MessageUtil.databaseUpdateErrorMessage();
        }
    }
    
    public void deleteData() {
        boolean isUpdate;
        this.loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(dao);
        isUpdate = impl.delete();
        if(isUpdate)
        {
            this.clear();
            MessageUtil.databaseDeleteSuccessMessage();
        }
        else 
        {
            MessageUtil.databaseDeleteErrorMessage();
        }
    }
    
    /**
     * Return to the principal screen 
     */
    public void returnPrincpal() {
        PrincipalUI principal = new PrincipalUI();
        principal.setVisible(true);
        this.teacherUI.setVisible(false);
    }
    
    private void loadTeacherDao(){
        dao.setAddress(teacherUI.getjTextAddress().getText());
        dao.setCedula(teacherUI.getjTextCedula().getText());
        dao.setCurp(teacherUI.getjTextCurp().getText());
        dao.setEndDate(ConvertDate.toSqlDate(teacherUI.getjDateEnd().getDate()));
        dao.setExperience(teacherUI.getjTextAreaExperience().getText());
        dao.setFirstLastName(teacherUI.getjTextLastName1().getText());
        dao.setHomePhone(teacherUI.getjTextPhoneHome().getText());
        dao.setLevel(teacherUI.getjComboBoxLevel().getSelectedIndex());
        dao.setName(teacherUI.getjTextName().getText());
        dao.setPassword(teacherUI.getjTextPassword().getText());
        dao.setPersonalEmail(teacherUI.getjTextEmailPersonal().getText());
        dao.setPersonalPhone(teacherUI.getjTextPhonePersonal().getText());
        //
        dao.setSecondLastName(teacherUI.getjTextLastName2().getText());
        dao.setStartDate(ConvertDate.toSqlDate(teacherUI.getjDateStart().getDate()));
        dao.setStatus(teacherUI.getjComboBoxStatus().getSelectedIndex());
        dao.setWorkEmail(teacherUI.getjTextEmailWork().getText());
    }
}