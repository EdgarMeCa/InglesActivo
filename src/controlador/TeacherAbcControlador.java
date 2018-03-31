/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ia.util.ConvertDate;
import ia.util.FileChooser;
import ia.util.Picture;
import ia.util.ResultMessage;
import javax.swing.JPanel;
import modelo.dao.TeacherDao;
import vista.TeacherUI_ABC;
import modelo.dao.impl.TeacherDaoImpl;
import enums.helper.EntryPoint;
import ia.rules.preupdate.BeforeCommit;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.dao.LevelDao;
import modelo.dao.StatusDao;
import modelo.dao.impl.LevelDaoImpl;
import modelo.dao.impl.StatusDaoImpl;
import vista.PrincipalUI;
import javax.swing.JOptionPane;

/**
 *
 * @author emedina
 */
public class TeacherAbcControlador implements BeforeCommit{
    private TeacherUI_ABC teacherUI;
    private ViewValidate viewValidate;
    
    /**
     *
     * @param teacherUI
     * @param entry
     */
    public TeacherAbcControlador(TeacherUI_ABC teacherUI, EntryPoint entry) {
        this.teacherUI = teacherUI;
        this.fillLevelCombo();
        this.fillStatusCombo();
        this.viewValidate = new ViewValidate(teacherUI,entry);
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
        teacherUI.setPath(chooser.getPath());
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
        TeacherDao teacherDao = loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(teacherDao);
        isDataUpdate = impl.insert();
        if(isDataUpdate)
        {
            this.clear();
            ResultMessage.databaseInsertSuccessMessage();
        }
        else 
        {
            ResultMessage.databaseInsertFailMessage();
        }
    }
    
    /**
     * Return to the principal screen 
     */
    public void returnToPrincpal() {
        PrincipalUI principal = new PrincipalUI();
        principal.setVisible(true);
        this.teacherUI.setVisible(false);
    }
    
     /**
     *
     * @return boolean
     */
    @Override
    public boolean beforeCommitData() {
        boolean commit = true;
        if(!viewValidate.validateRequiredFiels()) {
            commit = false;
        }
        return commit;
    }
    
    private TeacherDao loadTeacherDao(){
        TeacherDao teacherDao = new TeacherDao();
        teacherDao.setAddress(teacherUI.getjTextAddress().getText());
        teacherDao.setCedula(teacherUI.getjTextCedula().getText());
        teacherDao.setCurp(teacherUI.getjTextCurp().getText());
        teacherDao.setEndDate(ConvertDate.toSqlDate(teacherUI.getjDateEnd().getDate()));
        teacherDao.setExperience(teacherUI.getjTextAreaExperience().getText());
        teacherDao.setFirstLastName(teacherUI.getjTextLastName1().getText());
        teacherDao.setHomePhone(teacherUI.getjTextPhoneHome().getText());
        teacherDao.setLevel(teacherUI.getjComboBoxLevel().getSelectedIndex());
        teacherDao.setName(teacherUI.getjTextName().getText());
        teacherDao.setPassword(teacherUI.getjTextPassword().getText());
        teacherDao.setPersonalEmail(teacherUI.getjTextEmailPersonal().getText());
        teacherDao.setPersonalPhone(teacherUI.getjTextPhonePersonal().getText());
        teacherDao.setPicture(teacherUI.getPath());
        teacherDao.setSecondLastName(teacherUI.getjTextLastName2().getText());
        teacherDao.setStartDate(ConvertDate.toSqlDate(teacherUI.getjDateStart().getDate()));
        teacherDao.setStatus(teacherUI.getjComboBoxStatus().getSelectedIndex());
        teacherDao.setWorkEmail(teacherUI.getjTextEmailWork().getText());
        return teacherDao;
    }
    
    private void fillStatusCombo() {
        List<StatusDao> resultList = new StatusDaoImpl().select();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (StatusDao dao : resultList) {
            model.addElement(dao);
        }
        teacherUI.getjComboBoxStatus().setModel(model);
    }
    
    private void fillLevelCombo() {
        List<LevelDao> resultList = new LevelDaoImpl().select();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (LevelDao dao : resultList) {
            model.addElement(dao);
        }
        teacherUI.getjComboBoxLevel().setModel(model);
    }

    
    private class ViewValidate {
        private TeacherUI_ABC teacherUI;
        private EntryPoint entryPoint;
        
        public ViewValidate(TeacherUI_ABC teacherUI,EntryPoint entry) {
            this.teacherUI = teacherUI;
            this.entryPoint = entry;
            disbleActionButton();
        }
        
        private void disbleActionButton() {
            if(entryPoint == EntryPoint.NEW) {
                this.teacherUI.getjButtonDelete().setEnabled(false);
                this.teacherUI.getjButtonUpdate().setEnabled(false);
            }
            if(entryPoint == EntryPoint.SEARCH) {
                this.teacherUI.getjButtonAdd().setEnabled(false);
            }
        }
        
        /**
        *
        */
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
                JOptionPane.showMessageDialog(null, message,"Campos faltantes", JOptionPane.ERROR_MESSAGE);
            }
            return isValid;
        }
    }
}