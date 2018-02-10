/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ia.util.ConvertDate;
import ia.util.FileChooser;
import ia.util.Picture;
import javax.swing.JPanel;
import modelo.dao.TeacherDao;
import vista.TeacherUI_ABC;
import modelo.dao.impl.TeacherDaoImpl;
import enums.helper.EntryPoint;
import ia.rules.preupdate.BeforeCommit;
import modelo.dao.StatusDao;
import vista.PrincipalUI;

/**
 *
 * @author emedina
 */
public class TeacherAbcControlador implements BeforeCommit{
    private TeacherUI_ABC teacherUI;
    private ViewValidate viewValidate;
    
    public TeacherAbcControlador(TeacherUI_ABC teacherUI, EntryPoint entry) {
        this.teacherUI = teacherUI;
        this.viewValidate = new ViewValidate(teacherUI,entry);
        this.viewValidate.disbleActionButton();
    }
    
    public void loadPicture() {
        FileChooser chooser = new FileChooser();
        JPanel panelPicture = teacherUI.getjPanelPicture();
        Picture picture = new Picture(panelPicture.getWidth(),panelPicture.getHeight(),chooser.getPath());
        panelPicture.removeAll();
        panelPicture.add(picture);
        panelPicture.repaint();
    }
    
    public void erasePicture() {
        JPanel panelPicture = teacherUI.getjPanelPicture();
        panelPicture.removeAll();
        panelPicture.repaint();
    }
    
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
    
    public void insertData() {
        TeacherDao teacherDao = loadTeacherDao();
        TeacherDaoImpl impl = new TeacherDaoImpl(teacherDao);
        impl.insert();
    }
    
    public void returnToPrincpal() {
        PrincipalUI principal = new PrincipalUI();
        principal.setVisible(true);
        this.teacherUI.setVisible(false);
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
        
    }

    /**
     *
     * @return
     */
    @Override
    public boolean beforeCommitData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class ViewValidate {
        private TeacherUI_ABC teacherUI;
        private EntryPoint entryPoint;
        
        public ViewValidate(TeacherUI_ABC teacherUI,EntryPoint entry) {
            this.teacherUI = teacherUI;
            this.entryPoint = entry;
        }
        
        public void disbleActionButton() {
            if(entryPoint == EntryPoint.NEW) {
                this.teacherUI.getjButtonDelete().setEnabled(false);
                this.teacherUI.getjButtonUpdate().setEnabled(false);
            }
            if(entryPoint == EntryPoint.SEARCH) {
                this.teacherUI.getjButtonAdd().setEnabled(false);
            }
        }
        
        public void validateRequiredFiels() {
            String message = "";
            if (teacherUI.getjTextName().getText().isEmpty()) {
                message += "Error: El campo Nombre no puede estar vacio";
            }
            if (teacherUI.getjTextLastName1().getText().isEmpty()) {
                message += "Error: El campo Apellido paterno no puede estar vacio";
            }
            if (teacherUI.getjTextLastName2().getText().isEmpty()) {
                message += "Error: El campo Apellido materno no puede estar vacio";
            }
            if (teacherUI.getjTextAddress().getText().isEmpty()) {
                message += "Error: El campo Direccion no puede estar vacio";
            }
            if (teacherUI.getjTextPhonePersonal().getText().isEmpty()) {
                message += "Error: El campo Telefono celular no puede estar vacio";
            }
            if (teacherUI.getjTextEmailWork().getText().isEmpty()) {
                message += "Error: El campo Email laboral no puede estar vacio";
            }
            if (teacherUI.getjTextPassword().getText().isEmpty()) {
                message += "Error: El campo Contraseña no puede estar vacio";
            }
            if (teacherUI.getjDateStart().getDate() == null) {
                message += "Error: El campo Fecha Ingreso no puede estar vacio";
            }
            StatusDao x = (StatusDao)teacherUI.getjComboBoxStatus().getSelectedItem();
            if (x.getCode().equalsIgnoreCase("vacio")) {
                message += "Error: El campo Estatus no puede estar vacio";
            }
        }
    }
}