/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import controller.CourseController;
import controller.LecturerController;
import controller.SubjectController;
import controller.SubjectController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Subject;
import model.Subject;
import other.ComboSearch;
import other.IDGenerator;

/**
 *
 * @author DinukaMedis
 */
public class ManageSubjectPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSubjectPanel
     */
    public ManageSubjectPanel() {
        initComponents();
        fillSubjectIdCombo();
        newSubjectBtn.setVisible(true);
        addBtn.setVisible(false);
        subjectCodeCombo.setVisible(true);
        subjectCodeTxt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        subjectCodeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        deeteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        courseNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lecturerTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InstructorTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labIdTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        noOfCreditesTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        feeTxt = new javax.swing.JTextField();
        subjectCodeCombo = new javax.swing.JComboBox<>();
        newSubjectBtn = new javax.swing.JButton();
        compulsoryTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        semesterTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Subject Code :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, 30));

        subjectCodeTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        subjectCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjectCodeTxtKeyReleased(evt);
            }
        });
        jPanel1.add(subjectCodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, 30));

        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtKeyReleased(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 370, -1));

        deeteBtn.setBackground(new java.awt.Color(51, 255, 255));
        deeteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deeteBtn.setText("DELETE");
        deeteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deeteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deeteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 200, 40));

        addBtn.setBackground(new java.awt.Color(51, 255, 255));
        addBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 200, 40));

        courseNameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        courseNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                courseNameTxtKeyReleased(evt);
            }
        });
        jPanel1.add(courseNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 270, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Course :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, 30));

        lecturerTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lecturerTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lecturerTxtKeyReleased(evt);
            }
        });
        jPanel1.add(lecturerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 370, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Lecturer :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, 30));

        InstructorTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InstructorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InstructorTxtKeyReleased(evt);
            }
        });
        jPanel1.add(InstructorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 370, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Instructors :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 30));

        labIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labIdTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labIdTxtKeyReleased(evt);
            }
        });
        jPanel1.add(labIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 120, -1));

        updateBtn.setBackground(new java.awt.Color(51, 255, 255));
        updateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE ");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 200, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Lab Id :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 130, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("No of Credites :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 130, 30));

        noOfCreditesTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        noOfCreditesTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noOfCreditesTxtKeyReleased(evt);
            }
        });
        jPanel1.add(noOfCreditesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 120, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Fee :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        feeTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        feeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                feeTxtKeyReleased(evt);
            }
        });
        jPanel1.add(feeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 170, -1));

        subjectCodeCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        subjectCodeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectCodeComboItemStateChanged(evt);
            }
        });
        jPanel1.add(subjectCodeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        newSubjectBtn.setBackground(new java.awt.Color(51, 255, 255));
        newSubjectBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        newSubjectBtn.setText("NEW COURSE");
        newSubjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSubjectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(newSubjectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 200, 40));

        compulsoryTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        compulsoryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                compulsoryTxtKeyReleased(evt);
            }
        });
        jPanel1.add(compulsoryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 170, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Is Compulsary :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 130, 30));

        yearTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yearTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yearTxtKeyReleased(evt);
            }
        });
        jPanel1.add(yearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Year :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 130, 30));

        semesterTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        semesterTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                semesterTxtKeyReleased(evt);
            }
        });
        jPanel1.add(semesterTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 170, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Semester :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subjectCodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectCodeTxtKeyReleased
        //        boolean isCorrect = Validation.validateTxt(nameTxt.getText());
        //        if (!isCorrect) {
            //            nameTxt.setForeground(Color.red);
            //        } else {
            //            nameTxt.setForeground(Color.black);
            //        }
    }//GEN-LAST:event_subjectCodeTxtKeyReleased

    private void nameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtKeyReleased

    private void deeteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deeteBtnActionPerformed
        try {
            String subjectCode = subjectCodeTxt.getText();
            
            int isDeleted=SubjectController.deleteSubject(subjectCode);
            if (isDeleted>0) {
                JOptionPane.showMessageDialog(this, "Deleted sucsess...");
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageSubjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deeteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            String subjectCode = subjectCodeTxt.getText();
            String name = nameTxt.getText();
            String courseId = CourseController.searchCourseName(courseNameTxt.getText()).getCourseId();
            String lecturerId = LecturerController.searchLecturerName(lecturerTxt.getText()).getLecturerId();
            String lab = labIdTxt.getText();
            int year=Integer.parseInt(yearTxt.getText());
            int semester=Integer.parseInt(semesterTxt.getText());
            boolean compulsory=Boolean.parseBoolean(compulsoryTxt.getText());
            int noOfCredites = Integer.parseInt(noOfCreditesTxt.getText());
            double fee=Double.parseDouble(feeTxt.getText());
            
            Subject subject=new Subject(subjectCode, name, courseId, lecturerId,
                    lab, year, semester, compulsory, noOfCredites, fee);
            int isAdded=SubjectController.addSubject(subject);
            if (isAdded>0) {
                JOptionPane.showMessageDialog(this, "Added sucsess...");
                newSubjectBtn.setVisible(true);
                addBtn.setVisible(false);
                subjectCodeCombo.setVisible(true);
                subjectCodeTxt.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong...");
                newSubjectBtn.setVisible(true);
                addBtn.setVisible(false);
                subjectCodeCombo.setVisible(true);
                subjectCodeTxt.setVisible(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageSubjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void courseNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseNameTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameTxtKeyReleased

    private void lecturerTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lecturerTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lecturerTxtKeyReleased

    private void InstructorTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InstructorTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_InstructorTxtKeyReleased

    private void labIdTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labIdTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_labIdTxtKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            String subjectCode = subjectCodeTxt.getText();
            String name = nameTxt.getText();
            String courseId = CourseController.searchCourseName(courseNameTxt.getText()).getCourseId();
            String lecturerId = LecturerController.searchLecturerName(lecturerTxt.getText()).getLecturerId();
            String lab = labIdTxt.getText();
            int year=Integer.parseInt(yearTxt.getText());
            int semester=Integer.parseInt(semesterTxt.getText());
            boolean compulsory=Boolean.parseBoolean(compulsoryTxt.getText());
            int noOfCredites = Integer.parseInt(noOfCreditesTxt.getText());
            double fee=Double.parseDouble(feeTxt.getText());
            
            Subject subject=new Subject(subjectCode, name, courseId, lecturerId,
                    lab, year, semester, compulsory, noOfCredites, fee);
            int isUpdated=SubjectController.updateSubject(subject);
            if (isUpdated>0) {
                JOptionPane.showMessageDialog(this, "Updated sucsess...");
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageSubjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void noOfCreditesTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfCreditesTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfCreditesTxtKeyReleased

    private void feeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feeTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_feeTxtKeyReleased

    private void subjectCodeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectCodeComboItemStateChanged
        try {
            if (subjectCodeCombo.getSelectedItem()!=null) {
                String subjectId = subjectCodeCombo.getSelectedItem().toString();
                Subject subject=SubjectController.searchSubjectId(subjectId);
                if (subject!=null) {
                    nameTxt.setText(subject.getName());
                    courseNameTxt.setText(CourseController.searchCourseId(subject.getCourseId()).getName());
                    lecturerTxt.setText(LecturerController.searchLecturerId(subject.getLectureId()).getName());
                    labIdTxt.setText(subject.getLabId());
                    yearTxt.setText(Integer.toString(subject.getYear()));
                    semesterTxt.setText(Integer.toString(subject.getSemester()));
                    compulsoryTxt.setText(Boolean.toString(subject.isCompulsary()));
                    noOfCreditesTxt.setText(Integer.toString(subject.getNoofCredites()));
                    feeTxt.setText(Double.toString(subject.getFee()));
                }else{
                    JOptionPane.showMessageDialog(this, "Somthing wrong...");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageSubjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subjectCodeComboItemStateChanged

    private void newSubjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSubjectBtnActionPerformed
        try {
            newSubjectBtn.setVisible(false);
            addBtn.setVisible(true);
            subjectCodeCombo.setVisible(false);
            subjectCodeTxt.setVisible(true);
            String newId = IDGenerator.getNewId("subject", "subjectCode", "s");
            subjectCodeTxt.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newSubjectBtnActionPerformed

    private void compulsoryTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compulsoryTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_compulsoryTxtKeyReleased

    private void yearTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTxtKeyReleased

    private void semesterTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semesterTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InstructorTxt;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField compulsoryTxt;
    private javax.swing.JTextField courseNameTxt;
    private javax.swing.JButton deeteBtn;
    private javax.swing.JTextField feeTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField labIdTxt;
    private javax.swing.JTextField lecturerTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton newSubjectBtn;
    private javax.swing.JTextField noOfCreditesTxt;
    private javax.swing.JTextField semesterTxt;
    private javax.swing.JComboBox<String> subjectCodeCombo;
    private javax.swing.JTextField subjectCodeTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables

    private void fillSubjectIdCombo(){
        try {
            ArrayList<Subject> subjects=SubjectController.getAllSubject();
            for (Subject subject : subjects) {
                subjectCodeCombo.addItem(subject.getSubjectCode());
            }
            new ComboSearch().setSearchableCombo(subjectCodeCombo, true, "No Subject found");
            //new ComboSearch().setSearchableCombo(student_idCOmbo, true, "No Student found");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
