/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.student;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.*;
import oop2.main.User;
import oop2.login.Login_Frame;

/**
 *
 * @author PC
 */
//public class Student_Main_Frame extends javax.swing.JFrame implements oop2.main.User {
public class Student_Main_Frame extends javax.swing.JFrame{
    User user = new User();
    Login_Frame lf = new Login_Frame();
    String nowName;
        /**
     * Creates new form Student_Main_Frmae
     */
    
    
    public Student_Main_Frame(){
        initComponents();
    };
    
    public Student_Main_Frame(String nowName) {
        this.nowName = nowName;
        initComponents();
    }
    
//    public Student_Main_Frame(String stuName) {
//        stu_name = stuName;
//        initComponents();
//    }
    
//    public String getStuName(){
//        return this.stu_name;
//    }
    
   
 
    
    
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
        app_info_btn = new javax.swing.JButton();
        app_btn = new javax.swing.JButton();
        stu_ex_Info = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        goback = new javax.swing.JButton();
        StudentName = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("학생메뉴");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel3.setText("학생 메뉴 선택");

        app_info_btn.setText("수강 정보");
        app_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_info_btnActionPerformed(evt);
            }
        });

        app_btn.setText("수강 신청");
        app_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btnActionPerformed(evt);
            }
        });

        stu_ex_Info.setLabel("회원 정보 변경");
        stu_ex_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_ex_InfoActionPerformed(evt);
            }
        });

        jLabel1.setText("님");

        goback.setText("로그아웃");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        StudentName.setText("huuuh");
        StudentName.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goback)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(app_info_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(app_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(stu_ex_Info)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(app_info_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stu_ex_Info)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goback)
                    .addComponent(jLabel1)
                    .addComponent(StudentName))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void app_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btnActionPerformed
        // TODO add your handling code here:
        Application_Frame view = new Application_Frame();//수강신청 페이지로 이동
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_app_btnActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        Login_Frame login = new Login_Frame();//로그아웃, 로그인 화면으로 돌아가기
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_gobackActionPerformed

    private void app_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_info_btnActionPerformed
        // TODO add your handling code here:
        CourseInformation_Frame info = new CourseInformation_Frame();//수강정보 페이지로 이동
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_app_info_btnActionPerformed

    private void stu_ex_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_ex_InfoActionPerformed
        // TODO add your handling code here:
        UpateStudentInfo_Frame view = new UpateStudentInfo_Frame();//회원정보  수정 페이지
        view.StudentName.setText(nowName);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_stu_ex_InfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                Student_Main_Frame stu = new Student_Main_Frame();
//                stu.setVisible(true);
//                stu.StudentName.setText(stu.getName());
                new Student_Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel StudentName;
    private javax.swing.JButton app_btn;
    private javax.swing.JButton app_info_btn;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stu_ex_Info;
    // End of variables declaration//GEN-END:variables
//
//    private String User() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
