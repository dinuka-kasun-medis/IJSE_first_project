/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import controller.SubjectController;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Subject;

/**
 *
 * @author DinukaMedis
 */
public class SelectSubjectPanel_old extends javax.swing.JDialog {

    private DefaultTableModel model;
    private final String courseId;
    private final int year;
    private final int semester;
    ArrayList<String> selectedSubjects = new ArrayList<>();
    int noOfSubjects=0;
    private final String studentType;
    /**
     * Creates new form SelectSubjectPanel
     * @param parent
     * @param modal
     * @param courseId
     * @param year
     * @param semester
     * @param studentType
     */
    public SelectSubjectPanel_old(java.awt.Frame parent, boolean modal,String courseId,
            int year,int semester,String studentType) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.courseId=courseId;
        this.year=year;
        this.semester=semester;
        this.studentType=studentType;
        yearTxt.setText(Integer.toString(year));
        semesterTxt.setText(Integer.toString(semester));
        loadSubjectList();
        showFinishBtn(studentType);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        confirmBtn = new javax.swing.JButton();
        yearTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        semesterTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectedCount = new javax.swing.JTextField();
        unFinishBtn = new javax.swing.JButton();
        poFinishBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Name", "No of Credit", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(subjectTable);
        if (subjectTable.getColumnModel().getColumnCount() > 0) {
            subjectTable.getColumnModel().getColumn(0).setResizable(false);
            subjectTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 720, 340));

        confirmBtn.setBackground(new java.awt.Color(51, 255, 255));
        confirmBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        confirmBtn.setText("ADD");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 200, 40));

        yearTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(yearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Year :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Semester :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, 30));

        semesterTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(semesterTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 140, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Selected Count :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 130, 30));

        selectedCount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(selectedCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 140, -1));

        unFinishBtn.setBackground(new java.awt.Color(51, 255, 255));
        unFinishBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        unFinishBtn.setText("FINISH_Under");
        unFinishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unFinishBtnActionPerformed(evt);
            }
        });
        jPanel1.add(unFinishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 200, 40));

        poFinishBtn.setBackground(new java.awt.Color(51, 255, 255));
        poFinishBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        poFinishBtn.setText("FINISH_Post");
        poFinishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poFinishBtnActionPerformed(evt);
            }
        });
        jPanel1.add(poFinishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int selectedRow = subjectTable.getSelectedRow();
        String subjectCode = subjectTable.getValueAt(selectedRow, 0).toString();
        selectedSubjects.add(subjectCode);
        changeSelectedSubjectsRow();
        noOfSubjects++;
        selectedCount.setText(Integer.toString(noOfSubjects));
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void unFinishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unFinishBtnActionPerformed
        ManageStudentPanel.upadeBscSubjects(selectedSubjects,"noPayedYet");
        this.dispose();
    }//GEN-LAST:event_unFinishBtnActionPerformed

    private void poFinishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poFinishBtnActionPerformed
        ManageStudentPanel.upadeMscSubjects(selectedSubjects,"noPayedYet");
        this.dispose();
    }//GEN-LAST:event_poFinishBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JButton poFinishBtn;
    private javax.swing.JTextField selectedCount;
    private javax.swing.JTextField semesterTxt;
    private javax.swing.JTable subjectTable;
    private static javax.swing.JButton unFinishBtn;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables

    private void loadSubjectList(){
        try {
            model = (DefaultTableModel) subjectTable.getModel();
            ArrayList<Subject> subjectList = SubjectController.searchSubjectsForSemester
        (this.courseId, this.year, this.semester,"0" );
            for (Subject subject : subjectList) {
                Object[] rowData = {subject.getSubjectCode(),subject.getName(),
                    subject.getNoofCredites(),subject.getFee()};
                model.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SelectSubjectPanel_old.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void changeSelectedSubjectsRow() {
        subjectTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                String status = (String) table.getModel().getValueAt(row, 0);
                for (String selectedSubjects : selectedSubjects) {
                    if (selectedSubjects.equals(status)) {
                        setBackground(Color.GREEN);
                        setForeground(Color.BLACK);
                    } else {
                        setBackground(table.getBackground());
                        setForeground(table.getForeground());
                    }
                }
                return this;
            }
        });
    }
    
    private static void showFinishBtn(String studentType){
        if (studentType.equals("BSC")) {
            unFinishBtn.setVisible(true);
            poFinishBtn.setVisible(false);
        }else{
            unFinishBtn.setVisible(false);
            poFinishBtn.setVisible(true);
        }
    }
}
