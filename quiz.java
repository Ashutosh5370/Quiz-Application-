/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizashutodh;





import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;

public class quiz extends javax.swing.JFrame {
    
    Connection con  = null;
    PreparedStatement pst  = null;
    ResultSet rs = null;

   public int marks;
   public boolean flag;
    
    public quiz() {
        initComponents();
      
        
        timer();
        connection(); // connection to database 
        
        nextquetion(); //next quetion 
    }
    
    
    
    public void connection(){
    
         try{
       String url = "jdbc:mysql://localhost:3306/user";
              String user = "root";               
                String password ="";
       con  = DriverManager.getConnection(url, user, password);
       
        }
        catch(Exception e){System.out.print(e);}
    
    
    }
    
    login ob ;
    
    //timer
    
    int min=19;
   int sec= 59;
    public void timer(){
    
   Timer t = new Timer(1000, new ActionListener()
    {
    public void actionPerformed(ActionEvent e){
    
    sec--;
    
        if(min==0 && sec==0){
            
             login lg = new login();
           lg.setmarks(marks);
   
       JOptionPane.showMessageDialog(null, "Your Total Score   "+marks);
        }

        
    jLabel1.setText(""+min+" : "+sec);
    if(sec==0){
    sec=60;
    min--;
   jLabel1.setText(""+min+" : "+sec);
     }
    }
    
}
           
 );

t.start();
     }
    
    
    
    

  
    
   
    
   random ran  = new random(); // obj created
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        next = new javax.swing.JButton();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        next.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        next.setForeground(new java.awt.Color(255, 0, 255));
        next.setText("Skip");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        buttonGroup1.add(option1);
        option1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option1.setText("jRadioButton1");
        option1.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        option1.setPreferredSize(new java.awt.Dimension(160, 50));

        buttonGroup1.add(option2);
        option2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option2.setText("jRadioButton2");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option3);
        option3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option3.setText("jRadioButton3");
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option4);
        option4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option4.setText("jRadioButton4");
        option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option4ActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 0, 255));
        Submit.setText("Confirm");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(option2)
                    .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int temprandom;
    
    int quenum =0; // to have number of quetions attemptes
    public void nextquetion(){
    quenum++;
    
    if(quenum==50){
    
          login lg = new login();
           lg.setmarks(marks);
   
       JOptionPane.showMessageDialog(null, "Your Total Score   "+marks);
     
    }
        
        //this funtion will give next quetion to be flashed 
         //  Random rand = new  Random();
           int rn = ran.randomnum();
         temprandom =rn;    // temprandom variable this is used in function checkans 
         
         
    try{
        
        System.out.println("Random number genrated => "+rn);
        //String sql = "select * from round1 where id=? ";
                String sql = "select * from table2 where id=? ";

        pst = con.prepareStatement(sql);
        pst.setInt(1,rn);
        rs = pst.executeQuery();
        
        while(rs.next()){
                //setting new que and option
                
                String str = rs.getString("quetion");
                jLabel2.setText("Question=> "+quenum);
            jTextArea1.setText(str);
            String op1 =rs.getString("option1");
            String op2 = rs.getString("option2");
            String op3 =rs.getString("option3");
            String op4 =rs.getString("option4");
            
            option1.setText(" "+op1);
           option2.setText(" "+op2);
            option3.setText(" "+op3);
            option4.setText(" "+op4);
            
            
            
        }
        
        }
        catch(Exception e){System.out.println(e);}
    
    
    }
    
    
    
    public boolean cheackans(int num ,String str){
            //this function is to cheack if ans matches with selected option
        System.out.println("ans to be cheacke"+str);
        boolean ans=false;
        
        
              
    try{
        
        System.out.println("Random number genrated => "+num);
    //String sql = "select * from round1 where id=? ";
        String sql = "select * from table2 where id=? ";

        pst = con.prepareStatement(sql);
        pst.setInt(1,num);
    
        rs = pst.executeQuery();
        
        String getans="";
       
        while(rs.next()){
            
           getans = rs.getString("answer");
            
            System.out.println("Asw in database  ==>"+getans);
           
            
        }
        if(getans.equals(str)){
        
        ans =true;
        }
        else{return ans=false;}
       
        }
        catch(Exception e){System.out.println(e);}
        
    return ans;
    }
    
   
    
    
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
 
         buttonGroup1.clearSelection();
        nextquetion();
 //Submit.setVisible(true);
    
        
    }//GEN-LAST:event_nextActionPerformed

    login obj = new login();
    
    
    
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        try{
        option1.setActionCommand("A");
        option2.setActionCommand("B");
        option3.setActionCommand("C");
        option4.setActionCommand("D");
      
       // System.out.println("Selected button==> "+buttonGroup1.getSelection().getActionCommand());
        String  stringchk =buttonGroup1.getSelection().getActionCommand();
        boolean chk = cheackans(temprandom , stringchk);
       if(chk){
          marks = marks+4;
           }
       else{
           
           marks=marks-2;
       }
        
       
       
buttonGroup1.clearSelection();
        nextquetion();
        }
        catch(Exception e){
                   JOptionPane.showMessageDialog(null, "You cant confirm without selecting any option");

        
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option4ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option3ActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2ActionPerformed

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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }
    
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    // End of variables declaration//GEN-END:variables
}
