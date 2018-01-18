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
import vista.TeacherABC;
import modelo.dao.impl.TeacherDaoImpl;

/**
 *
 * @author emedina
 */
public class TeacherAbcControlador {
    private TeacherABC teacherUI;
    private TeacherDao teacherDao;
    
    public TeacherAbcControlador(TeacherABC teacherUI) {
        this.teacherUI = teacherUI;
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
        erasePicture();
    }
    
    public void insertData() {
        loadTeacherDao();
        new TeacherDaoImpl().insert(teacherDao);
    }
    
    private void loadTeacherDao(){
        teacherDao = new TeacherDao();
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
    } 
}