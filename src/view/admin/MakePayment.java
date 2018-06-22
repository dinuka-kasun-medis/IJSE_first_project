/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import controller.PaymentController;
import controller.SubjectController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BscSubject;
import model.MscSubjects;
import model.Payment;
import model.Subject;
import other.IDGenerator;

/**
 *
 * @author DinukaMedis
 */
public class MakePayment extends javax.swing.JFrame {

    private ArrayList<String> subjectCodes=new ArrayList<>();
    private DefaultTableModel model;
    private final ArrayList<Subject> subjectList=new ArrayList<>();
    private int i=0;
    private double total=0;
    private final String studentType;
    /**
     * Creates new form Payment
     * @param studentType
     * @param admissionNo
     * @param name
     * @param email
     * @param phoneNo
     * @param subjectCodes
     */
    public MakePayment(String studentType,String admissionNo,String name,String email,int phoneNo,ArrayList<String> subjectCodes) {
        initComponents();
        this.studentType=studentType;
        this.subjectCodes=subjectCodes;
        admissionNotxt.setText(admissionNo);
        nameTxt.setText(name);
        emailTxt.setText(email);
        phoneTxt.setText(Integer.toString(phoneNo));
        loadSubjectList();
        loadNewId();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        admissionNotxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        paymentIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        makePaymentBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Admission No :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Name :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("E mail :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 130, 30));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 310, -1));

        admissionNotxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        admissionNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionNotxtActionPerformed(evt);
            }
        });
        jPanel3.add(admissionNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, -1));

        phoneTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 190, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Phone No :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 130, 30));

        paymentIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(paymentIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Payment ID :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1050, 160));

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Name", "Compulsory", "Price"
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
            subjectTable.getColumnModel().getColumn(2).setResizable(false);
            subjectTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1050, 210));

        makePaymentBtn.setBackground(new java.awt.Color(51, 255, 255));
        makePaymentBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        makePaymentBtn.setText("Make Payment");
        makePaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePaymentBtnActionPerformed(evt);
            }
        });
        jPanel2.add(makePaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 280, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Total :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 90, 30));

        totalTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(totalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 190, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Amount :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 90, 30));

        amountTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        amountTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTxtKeyReleased(evt);
            }
        });
        jPanel2.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 190, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Remain :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 90, 30));

        balanceTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(balanceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makePaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePaymentBtnActionPerformed
        if (studentType.equals("BSC")) {
            try {
                for (String subjectCode : subjectCodes) {
                    Subject subject=SubjectController.searchSubjectId(subjectCode);
                    Payment payment=new Payment(paymentIdTxt.getText(), admissionNotxt.getText(), total, "2018-02-02");
                    BscSubject bscSubject = new BscSubject(subjectCode, admissionNotxt.getText(), paymentIdTxt.getText(), subject.getFee(), "2018-02-02");
                    boolean isPayed=PaymentController.makeBscPayment(payment, bscSubject);
                    if (isPayed) {
                        JOptionPane.showMessageDialog(this, "Pament sucssed...");
                    }else{
                        JOptionPane.showMessageDialog(this, "Somthing wrong...");
                    }
                }
                } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MakePayment.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else{
            try {
                for (String subjectCode : subjectCodes) {
                    Subject subject=SubjectController.searchSubjectId(subjectCode);
                    Payment payment=new Payment(paymentIdTxt.getText(), admissionNotxt.getText(), total, "2018-02-02");
                    MscSubjects mscSubject = new MscSubjects(subjectCode, admissionNotxt.getText(), paymentIdTxt.getText(), subject.getFee(), "2018-02-02");
                    boolean isPayed=PaymentController.makeMscPayment(payment, mscSubject);
                    if (isPayed) {
                        JOptionPane.showMessageDialog(this, "Pament sucssed...");
                    }else{
                        JOptionPane.showMessageDialog(this, "Somthing wrong...");
                    }
                }
                } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MakePayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_makePaymentBtnActionPerformed

    private void admissionNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionNotxtActionPerformed

    private void amountTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTxtKeyReleased
        double totAmount=Double.parseDouble(totalTxt.getText());
        double amount=Double.parseDouble(amountTxt.getText());
        if (amount>totAmount) {
            balanceTxt.setText(Double.toString(amount-totAmount));
        }else{
            balanceTxt.setText("0.00");
        }
        
    }//GEN-LAST:event_amountTxtKeyReleased

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MakePayment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admissionNotxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makePaymentBtn;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField paymentIdTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTable subjectTable;
    private javax.swing.JTextField totalTxt;
    // End of variables declaration//GEN-END:variables

    private void loadSubjectList(){
        model = (DefaultTableModel) subjectTable.getModel();
        for (String subjectCode : subjectCodes) {
            try {
                subjectList.add(SubjectController.searchSubjectId(subjectCode));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MakePayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (Subject subject : subjectList) {
            Object[] rowData = {subject.getSubjectCode(),subject.getName(),subject.isCompulsary(),subject.getFee()};
            model.addRow(rowData);
            total+=(Double) subjectTable.getValueAt(i, 3);
            i++;
            totalTxt.setText(Double.toString(total));
        }
    }
    
    private void loadNewId(){
        try {
            String newId = IDGenerator.getNewId("Payment", "paymentId", "p");
            paymentIdTxt.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
