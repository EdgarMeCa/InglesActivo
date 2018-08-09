/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ia.screen.components.util.ComboBoxEnhacement;
import ia.util.ConvertDate;
import ia.util.FileChooser;
import ia.util.Picture;
import ia.util.MessageUtil;
import javax.swing.JPanel;
import modelo.dao.TeacherDao;
import vista.TeacherUI_ABC;
import modelo.dao.impl.TeacherDaoImpl;
import enums.actions.ViewMode;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.dao.LevelDao;
import modelo.dao.StatusDao;
import modelo.dao.impl.LevelDaoImpl;
import modelo.dao.impl.StatusDaoImpl;
import vista.PrincipalUI;                                                                                                                                                                                                                                                                                                                                                                                                                                                       

/**
 *
 * @author emedina
 */
public class TeacherAbcControlador {
    private TeacherUI_ABC teacherUI;
    private TeacherDao dao;
    private ViewValidate viewValidate;
    
    /**
     *
     * @param teacherUI
     * @param dao
     * @param mode
     */
    public TeacherAbcControlador(TeacherUI_ABC teacherUI,TeacherDao dao ,ViewMode mode) {
        this.teacherUI = teacherUI;
        this.dao = dao;
        this.viewValidate = new ViewValidate(mode);
    }
    
    /**
     *
     */
    public void initValuesFromSearch() {
        this.teacherUI.getjTextName().setText(dao.getName());
        this.teacherUI.getjTextLastName1().setText(dao.getFirstLastName());
        this.teacherUI.getjTextLastName2().setText(dao.getSecondLastName());
        this.teacherUI.getjTextAddress().setText(dao.getAddress());
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
        erasePicture();
    }
    
    /**
     * Insert the information from the screen into the database
     */
    public void insertData() {
        boolean isDataUpdate;
        this.loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(dao);
        isDataUpdate = impl.insert();
        if(isDataUpdate)
        {
            this.clear();
            MessageUtil.databaseInsertSuccessMessage();
        }
        else 
        {
            MessageUtil.databaseInsertErrorMessage();
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
    
    private void fillStatusCombo() {
        List<StatusDao> resultList = new StatusDaoImpl().select();
        DefaultComboBoxModel model = new ComboBoxEnhacement().fillComboBox(resultList);
        teacherUI.getjComboBoxStatus().setModel(model);
    }
    
    private void fillLevelCombo() {
        List<LevelDao> resultList = new LevelDaoImpl().select();
        DefaultComboBoxModel model = new ComboBoxEnhacement().fillComboBox(resultList);
        teacherUI.getjComboBoxLevel().setModel(model);
    }

    
    private class ViewValidate {
       ViewMode mode;
        
        public ViewValidate(ViewMode mode) {
            this.mode = mode;
            disbleActionButton();
        }
        
        private void disbleActionButton() {
            if(mode == ViewMode.NEW) {
                teacherUI.getjButtonDelete().setEnabled(false);
                teacherUI.getjButtonUpdate().setEnabled(false);
            }
            if(mode == ViewMode.SEARCH) {
                teacherUI.getjButtonAdd().setEnabled(false);
            }
        }
        
        public boolean validateRequiredFiels() {
            String message = "";
            boolean isValid = true;
            if (teacherUI.getjTextName().getText().isEmpty()) {
                message += "Error: El campo Nombre no puede estar vacio \n";
            }
            if (teacherUI.getjTextLastName1().getText().isEmpty()) {
                message += "Error: El campo Apellido paterno no puede estar vacio \n";
            }
            if (teacherUI.getjTextLastName2().getText().isEmpty()) {
                message += "Error: El campo Apellido materno no puede estar vacio \n";
            }
            if (teacherUI.getjTextAddress().getText().isEmpty()) {
                message += "Error: El campo Direccion no puede estar vacio \n";
            }
            if (teacherUI.getjTextPhonePersonal().getText().isEmpty()) {
                message += "Error: El campo Telefono celular no puede estar vacio \n";
            }
            if (teacherUI.getjTextEmailWork().getText().isEmpty()) {
                message += "Error: El campo Email laboral no puede estar vacio \n";
            }
            if (teacherUI.getjTextPassword().getText().isEmpty()) {
                message += "Error: El campo Contraseña no puede estar vacio \n";
            }
            if (teacherUI.getjDateStart().getDate() == null) {
                message += "Error: El campo Fecha Ingreso no puede estar vacio \n";
            }
            if(!message.equals("")) {
                isValid = false;
                MessageUtil.customErrorMessage(message);
            }
            return isValid;
        }
    }
}