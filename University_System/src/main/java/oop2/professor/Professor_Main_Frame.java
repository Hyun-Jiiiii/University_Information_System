/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.professor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import oop2.login.Login_Frame;
import oop2.main.Exchange_Pw;
import oop2.main.User;

/**
 *
 * @author User
 */
public class Professor_Main_Frame extends javax.swing.JFrame {
    String nowId;
    String nowName;
    /**
     * Creates new form Professor_Main_Frame
     */
    public Professor_Main_Frame(String nowId) throws UnsupportedEncodingException, IOException {
        initComponents();
        User u = new User();
        this.nowId = nowId;
        nowName = u.searchName('P', nowId);
        user_name.setText(nowName);
        lec_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        getProList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void getProList() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String str;
        String[] key;
        DefaultTableModel table = (DefaultTableModel)lec_list.getModel();
        table.setNumRows(0);
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("lecturelist.txt"), "euc-kr"));
        while((str = read.readLine())!=null){
            key = str.split("/");
            if(key[4].equals(nowName)){
                String[] list = {key[0],key[1]};
                table.addRow(list);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lec_list = new javax.swing.JTable();
        manageCourse = new javax.swing.JButton();
        exchange_info = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        user_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("교수 메뉴 선택");

        lec_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "강의 번호", "강의 이름"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lec_list);

        manageCourse.setText("강의 관리");
        manageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCourseActionPerformed(evt);
            }
        });

        exchange_info.setText("회원정보 수정");
        exchange_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchange_infoActionPerformed(evt);
            }
        });

        goback.setText("뒤로가기");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        user_name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("님");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(exchange_info))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(goback)
                                        .addGap(30, 30, 30)
                                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(manageCourse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exchange_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goback)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exchange_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchange_infoActionPerformed
        // TODO add your handling code here:
        Exchange_Pw e = new Exchange_Pw(nowId);
        e.setVisible(true);
    }//GEN-LAST:event_exchange_infoActionPerformed

    private void manageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCourseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)lec_list.getModel();
        int row = lec_list.getSelectedRow();
        AttendanceBook b = new AttendanceBook(nowId,(String) table.getValueAt(row, 0),(String) table.getValueAt(row, 1));
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_manageCourseActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        Login_Frame l = new Login_Frame();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_gobackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exchange_info;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lec_list;
    private javax.swing.JButton manageCourse;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
