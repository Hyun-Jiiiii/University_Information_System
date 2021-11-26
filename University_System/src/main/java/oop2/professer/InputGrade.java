/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.professer;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import oop2.professer.Professer;
import oop2.professer.AttendanceBook;
import oop2.professer.Lecture_manage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputGrade.java -학생 성적 입력하는 클래스
 *
 * @author 정수연
 */


// try/catch -> 성공메시지 / 오류 메시지 출력 
// 오류 메시지 (1) 성적 입력 실패 or 값 입력 실패
// 오류 메시지 (2) 해당되는 테이블(값)이 없습니다. 
// 오류 메시지 (3) 이미 성적 부여 완료되었습니다. 수정하시겠습니까? -> 확인 or 취소 버튼 생성
// 오류 메시지 (4) 값 불일치(강좌번호와 강좌명 불일치/학번과 이름 불일치)
// 자바 파일에서 문자열 찾기 -> 저장된 값 찾기

import javax.swing.DefaultComboBoxModel;

public class InputGrade extends javax.swing.JFrame {

    String gradeNum;  // 학점 점수

    /**
     * Creates new form InputGrade
     */
    public InputGrade() {
        initComponents();
        init();
    }

    public void init() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        String fileName = ("Gradeview.txt");
        File file = new File(fileName);
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String line;
                line = in.nextLine();  // ctrl + alt + f
                model.addElement(line);
                grade.setModel(model);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File can not found");  // 파일을 찾을 수 없음 오류 문구 표시

        }
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
        jLabel4 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        grade = new javax.swing.JComboBox<>();
        OK_Btn = new javax.swing.JButton();
        Cancel_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        causeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        causeNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        studentNum = new javax.swing.JTextField();

        jDialog1.setTitle("성적 입력 성공");
        jDialog1.setSize(new java.awt.Dimension(200, 200));

        jLabel4.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jDialog2.setTitle("성적 입력 실패");
        jDialog2.setSize(new java.awt.Dimension(200, 200));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("성적 입력");

        grade.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "입력", "A", "B", "C", "D", "F" }));
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        OK_Btn.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        OK_Btn.setText("확인");
        OK_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_BtnActionPerformed(evt);
            }
        });

        Cancel_Btn.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        Cancel_Btn.setText("취소");
        Cancel_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("성적 입력");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel2.setText("학점");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel3.setText("이름");

        studentName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel5.setText("강좌명");

        causeName.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        causeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                causeNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel6.setText("강좌번호");

        causeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                causeNumActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel7.setText("학번");

        studentNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancel_Btn)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OK_Btn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studentName, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(grade, 0, 84, Short.MAX_VALUE)
                                        .addComponent(causeNum)
                                        .addComponent(causeName, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addComponent(studentNum, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)))
                .addGap(52, 104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(causeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(causeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studentNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_Btn)
                    .addComponent(Cancel_Btn))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CreateFile() {  // 성적 입력 파일 생성 및 저장
        try {
            BufferedWriter gradeList = new BufferedWriter(new java.io.FileWriter("Gradeview.txt", true));

            gradeList.write("");  // 버퍼에 데이터 입력
            gradeList.newLine();  // 버퍼에 개행 삽입
            gradeList.flush();  // 버퍼의 내용을 파일에 강제 전송
            gradeList.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Cancel_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_BtnActionPerformed
        // TODO add your handling code here:
        // 취소 버튼
        Professer_Main_Frame pro = new Professer_Main_Frame();
        pro.setVisible(true);
        dispose();
    }//GEN-LAST:event_Cancel_BtnActionPerformed

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
        // 성적 체크박스
        grade.addItem("입력");
        grade.addItem("A");
        grade.addItem("B");
        grade.addItem("C");
        grade.addItem("D");
        grade.addItem("F");
    }//GEN-LAST:event_gradeActionPerformed

    private void OK_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_BtnActionPerformed
        // 확인 버튼 기능

        boolean check = false;
        String str;
        try {

            if (causeNum.getText().isEmpty() || causeName.getText().isEmpty() || studentNum.getText().isEmpty()
                    || studentName.getText().isEmpty() || grade.getSelectedItem() == ("입력")) {   // 값이 하나라도 입력되지 않았을 경우
                JOptionPane.showMessageDialog(null, "정보를 모두 입력해 주세요.", "성적 입력 실패", JOptionPane.WARNING_MESSAGE);
            } else if (check) {
                JOptionPane.showMessageDialog(null, "이미 성적 부여가 완료된 값입니다.", "성적 입력 실패", JOptionPane.WARNING_MESSAGE);
            } else {
                FileOutputStream file = new FileOutputStream("Gradeview.txt", true);   // 임시 성적 입력 파일 열기
                OutputStreamWriter output = new OutputStreamWriter(file, "UTF-8");
                BufferedWriter writer = new BufferedWriter(output);
               
                // 학점별 학점수 초기화
                    if(grade.getSelectedItem()=="A") 
                        gradeNum = "4.0";                            // A 학점
                    else if(grade.getSelectedItem()=="B") 
                        gradeNum = "3.0";                            // B 학점
                    else if(grade.getSelectedItem()=="C") 
                        gradeNum = "2.0";                            // C 학점
                    else if(grade.getSelectedItem()=="D") 
                        gradeNum = "1.0";                            // D 학점
                    else if(grade.getSelectedItem()=="F") 
                        gradeNum = "0.0";                            // F 학점
                 
                str = String.format("%s/%s/%s/%s/%s/%s%n", causeNum.getText(), causeName.getText(), studentNum.getText(), studentName.getText(), grade.getSelectedItem(), gradeNum);
                //강좌 번호, 강좌명, 학번, 이름, 학점
                writer.write(str);
                writer.close();
                JOptionPane.showMessageDialog(null, "성적 입력이 완료되었습니다.", "성적 입력 성공", JOptionPane.PLAIN_MESSAGE);  // 성적 입력 성공
                InputGrade pro = new InputGrade();  // 성적 입력 완료 후 기존 성적 입력 창으로 이동
                pro.setVisible(true);
                dispose();
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(InputGrade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "성적 입력을 실패하셨습니다.", "성적 입력 실패", JOptionPane.WARNING_MESSAGE); // 성적 입력 실패
        } catch (IOException ex) {
            Logger.getLogger(InputGrade.class.getName()).log(Level.SEVERE, null, ex);
        }

        String filePath = "GradeView.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String firstLines = br.readLine().trim();
            String[] columnsName = firstLines.split("/");

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");   // 문자열 구분
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_OK_BtnActionPerformed

    private void causeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_causeNameActionPerformed
        // 강좌명 입력
        this.causeName = causeNum;
    }//GEN-LAST:event_causeNameActionPerformed

    private void causeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_causeNumActionPerformed

        // 강좌번호 입력
        this.causeNum = causeNum;
    }//GEN-LAST:event_causeNumActionPerformed

    private void studentNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumActionPerformed
        // 학번 입력
        this.studentNum = studentNum;
    }//GEN-LAST:event_studentNumActionPerformed

    private void studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameActionPerformed
        // 학생 이름 입력
        this.studentName = studentName;
    }//GEN-LAST:event_studentNameActionPerformed

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
            java.util.logging.Logger.getLogger(InputGrade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputGrade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputGrade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputGrade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Btn;
    private javax.swing.JButton OK_Btn;
    private javax.swing.JTextField causeName;
    private javax.swing.JTextField causeNum;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JTextField studentName;
    private javax.swing.JTextField studentNum;
    // End of variables declaration//GEN-END:variables
}
