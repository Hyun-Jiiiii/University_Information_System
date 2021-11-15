/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.login;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oop2.professer.Professer_Main_Frame;
import static javax.swing.JOptionPane.showMessageDialog;
import oop2.lecture.Lecture_Main_Frame;
import oop2.school.School_Main_Frame;
import oop2.student.Student_Main_Frame;
/**
 *
 * @author PC
 */
public class Login_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Login_Frame
     */
    public Login_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID_Field = new javax.swing.JTextField();
        Login_Button = new javax.swing.JButton();
        PW_Field = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("대학 정보 시스템");

        jLabel2.setText("아이디");

        jLabel3.setText("비밀번호");

        ID_Field.setToolTipText("");
        ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_FieldActionPerformed(evt);
            }
        });

        Login_Button.setText("로그인");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ID_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(PW_Field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PW_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FieldActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here: 
        String id_Field = ID_Field.getText(); //ID 필드에서 값 받아오기
        String pw_Field = new String(PW_Field.getPassword());//PW 필드에서 값 받아오기
        char a = id_Field.charAt(0); //아이디를 입력하는 직군을 구분하기 위한 이니셜 저장
        BufferedReader reader = null;
        String str;
        String[] key;
        if(id_Field.length() == 0 || pw_Field.length() == 0)
            showMessageDialog(null,"아이디 또는 비밀번호를 잘못 입력하셨습니다.");
        else if(a =='p'){ //아이디 고유 문자가 p -> 교수
            try {
                reader = new BufferedReader(new FileReader("professer.txt"));//읽을 파일 열기
            } catch (FileNotFoundException ex) { //파일이 발견되지 않았을 때 예외처리
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while((str = reader.readLine()) != null){ //마지막 문장이 아닐동안 반복 
                    if(str.contains(id_Field)){ //입력받은 아이디가 문장안에 있을시
                        key = str.split("/"); // "/"를 이용해 배열에 저장
                        //table에 따라 [0] : id, [1] : name, [2] : pw, [3] : peopleNum, [4] : departMent
                        if(key[2].equals(pw_Field)){ //비밀번호가 같은지 검사
                            Professer_Main_Frame pro = new Professer_Main_Frame();
                            //맞으면 해당 메뉴 출력
                            pro.setVisible(true);
                            dispose();//현재창은 닫기
                        }
                        else { //비밀번호가 다를 경우
                            JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못 입력 되었습니다.\n" + "아이디와 비밀번호를 정확히 입력해 주세요..","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                }
            } catch (IOException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if(a == 's'){//아이디 고유 문자가 s -> 학생
            try {
                reader = new BufferedReader(new FileReader("student.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while((str = reader.readLine()) != null){
                    if(str.contains(id_Field)){
                        key = str.split("/");
                        if(key[2].equals(pw_Field)){
                            Student_Main_Frame stu = new Student_Main_Frame();
                            stu.setVisible(true);
                            dispose();
                        }
                         else if(!key[2].equals(pw_Field)){ //비밀번호가 다를 경우
                            JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못 입력 되었습니다.\n" + "아이디와 비밀번호를 정확히 입력해 주세요..","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                            dispose();
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if(a == 'h'){//아이디 고유 문자가 h -> 학사
            try {
                reader = new BufferedReader(new FileReader("school.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while((str = reader.readLine()) != null){
                    if(str.contains(id_Field)){
                        key = str.split("/");
                        if(key[2].equals(pw_Field)){
                            School_Main_Frame sch = new School_Main_Frame();
                            sch.setVisible(true);
                            dispose();
                        }
                        else { //비밀번호가 다를 경우
                            JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못 입력 되었습니다.\n" + "아이디와 비밀번호를 정확히 입력해 주세요..","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if(a == 'g'){//아이디 고유 문자가 g -> 수업
            try {
                reader = new BufferedReader(new FileReader("lecture.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while((str = reader.readLine()) != null){
                    if(str.contains(id_Field)){
                        key = str.split("/");
                        if(key[2].equals(pw_Field)){
                            Lecture_Main_Frame lec = new Lecture_Main_Frame();
                            lec.setVisible(true);
                            dispose();
                        }
                        else if(!key[2].equals(pw_Field)){ //비밀번호가 다를 경우
                            JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못 입력 되었습니다.\n" + "아이디와 비밀번호를 정확히 입력해 주세요..","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Login_Frame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else
            showMessageDialog(null,"아이디 또는 비밀번호를 잘못 입력하셨습니다.");
            
    }//GEN-LAST:event_Login_ButtonActionPerformed
  
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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_Field;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField PW_Field;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
