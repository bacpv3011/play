/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import play.Controller;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Admin
 */
public class CalPane extends javax.swing.JFrame {
    private Controller controller;
    private String name[] = new String[5];
    final DefaultComboBoxModel model ;
    final DefaultComboBoxModel model2 ;
    private int score[][] = new int[5][5];
    private int scoreBack[][] = new int[5][5];
    private int base = 2;
    /**
     * Creates new form cal
     */
    public CalPane(Controller controller,String[] name) {
        this.controller = controller;
        for(int i = 0; i < 5; i++){
            this.name[i] = name[i];
            for(int j = 0; j < 5; j++){
                score[i][j] = 0;
            }
        }
        model = new DefaultComboBoxModel(name);
        model2 = new DefaultComboBoxModel(name);
        initComponents();
        updateName();
        updateData();
        updateMulti();
    }

    public void setBase(int base) {
        this.base = base;
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
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(model);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mút cây 1", "Mút cây 2", "Mút chốt", "Ù", "Ù tròn", "Ù đền", "Ù tròn đền", "Hết ván" }));

        jComboBox3.setModel(model2);

        jButton1.setText("Tính điểm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel9");

        jLabel11.setText("jLabel9");

        jLabel12.setText("jLabel9");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nhất", "Nhì", "Ba", "Bét", "Cháy" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nhất", "Nhì", "Ba", "Bét", "Cháy" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nhất", "Nhì", "Ba", "Bét", "Cháy" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nhất", "Nhì", "Ba", "Bét", "Cháy" }));

        jLabel5.setText("multi x 2");

        jButton2.setText("Đổi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton1))
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel3)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p1 = "" ,p2 = "",select = "";
        if(jComboBox1.getSelectedItem() != null){
            p1 = (String) jComboBox1.getSelectedItem();
        }
        if(jComboBox2.getSelectedItem() != null){
            select = (String) jComboBox2.getSelectedItem();
        }
        if(jComboBox3.getSelectedItem() != null){
            p2 = (String) jComboBox3.getSelectedItem();
        }
        
        if(select.equals("Mút cây 1")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p2.equals(name[j])){
                            score[i][j] += base;
                            score[j][i] -= base;
                        }
                    }
                }
            }
        }
        if(select.equals("Mút cây 2")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p2.equals(name[j])){
                            score[i][j] += 2*base;
                            score[j][i] -= 2*base;
                        }
                    }
                }
            }
        }
        if(select.equals("Mút chốt")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p2.equals(name[j])){
                            score[i][j] += 4*base;
                            score[j][i] -= 4*base;
                        }
                    }
                }
            }
        }
        if(select.equals("Ù")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p1.equals(name[j])) continue;
                        score[i][j] += 5*base;
                        score[j][i] -= 5*base;
                    }
                }
            }
        }
        if(select.equals("Ù tròn")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p1.equals(name[j])) continue;
                        score[i][j] += 10*base;
                        score[j][i] -= 10*base;
                    }
                }
            }
        }
        if(select.equals("Ù đền")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p2.equals(name[j])){
                            score[i][j] += 15*base;
                            score[j][i] -= 15*base;
                        }
                    }
                }
            }
        }
        if(select.equals("Ù tròn đền")){
            for(int i = 1; i < 5; i++){
                if(p1.equals(name[i])){
                    for(int j = 1; j < 5; j++){
                        if(p2.equals(name[j])){
                            score[i][j] += 30*base;
                            score[j][i] -= 30*base;
                        }
                    }
                }
            }
        }
        if(select.equals("Hết ván")){
            int person1st = 0;
            for(int i = 1; i < 5; i++){
                if(((String) jComboBox9.getSelectedItem()).equals("Nhất")){
                    person1st = 1;
                    break;
                }else if(((String) jComboBox10.getSelectedItem()).equals("Nhất")){
                    person1st = 2;
                    break;
                }else if(((String) jComboBox11.getSelectedItem()).equals("Nhất")){
                    person1st = 3;
                    break;
                }else if(((String) jComboBox12.getSelectedItem()).equals("Nhất")){
                    person1st = 4;
                    break;
                }
            }
            switch((String) jComboBox9.getSelectedItem()){
                case "Nhì" : score[person1st][1] += base; score[1][person1st] -= base;  break;
                case "Ba" : score[person1st][1] += 2*base; score[1][person1st] -= 2*base;  break;
                case "Bét" : score[person1st][1] += 3*base; score[1][person1st] -= 3*base;  break;
                case "Cháy" : score[person1st][1] += 4*base; score[1][person1st] -= 4*base;  break;
            }
            switch((String) jComboBox10.getSelectedItem()){
                case "Nhì" : score[person1st][2] += base; score[2][person1st] -= base;  break;
                case "Ba" : score[person1st][2] += 2*base; score[2][person1st] -= 2*base;  break;
                case "Bét" : score[person1st][2] += 3*base; score[2][person1st] -= 3*base;  break;
                case "Cháy" : score[person1st][2] += 4*base; score[2][person1st] -= 4*base;  break;
            }
            switch((String) jComboBox11.getSelectedItem()){
                case "Nhì" : score[person1st][3] += base; score[3][person1st] -= base;  break;
                case "Ba" : score[person1st][3] += 2*base; score[3][person1st] -= 2*base;  break;
                case "Bét" : score[person1st][3] += 3*base; score[3][person1st] -= 3*base;  break;
                case "Cháy" : score[person1st][3] += 4*base; score[3][person1st] -= 4*base;  break;
            }
            switch((String) jComboBox12.getSelectedItem()){
                case "Nhì" : score[person1st][4] += base; score[4][person1st] -= base;  break;
                case "Ba" : score[person1st][4] += 2*base; score[4][person1st] -= 2*base;  break;
                case "Bét" : score[person1st][4] += 3*base; score[4][person1st] -= 3*base;  break;
                case "Cháy" : score[person1st][4] += 4*base; score[4][person1st] -= 4*base;  break;
            }
        }
        updateData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.showChangeDialog();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

    private void updateName() {
        jLabel1.setText(name[1]);
        jLabel2.setText(name[2]);
        jLabel3.setText(name[3]);
        jLabel4.setText(name[4]);
        
        jLabel9.setText(name[1]);
        jLabel10.setText(name[2]);
        jLabel11.setText(name[3]);
        jLabel12.setText(name[4]);
    }
    private void updateData() {
        //name1
        jTextArea1.setText("\n" +name[2] + " : " + score[1][2] + "\n" +
                name[3] + " : " + score[1][3] + "\n" +
                name[4] + " : " + score[1][4] + "\n");
        //name2
        jTextArea2.setText("\n" +name[1] + " : " + score[2][1] + "\n" +
                name[3] + " : " + score[2][3] + "\n" +
                name[4] + " : " + score[2][4] + "\n");
        //name3
        jTextArea3.setText("\n" +name[1] + " : " + score[3][1] + "\n" +
                name[2] + " : " + score[3][2] + "\n" +
                name[4] + " : " + score[3][4] + "\n");
        //name4
        jTextArea4.setText( "\n" +name[1] + " : " + score[4][1] + "\n" +
                name[2] + " : " + score[4][2] + "\n" +
                name[3] + " : " + score[4][3] + "\n");
    }

    void updateMulti() {
        jLabel5.setText("Đang x" + base);
    }
}
