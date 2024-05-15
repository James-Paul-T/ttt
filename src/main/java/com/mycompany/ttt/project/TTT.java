
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.mycompany.ttt.project;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author STUDENT
 */
public class TTT extends javax.swing.JPanel {
    
     private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form TTT
     */
    public TTT() {
        initComponents();
    }
     private void disableAllButtons(){
         
         txtbtn1.setEnabled(false);
         txtbtn2.setEnabled(false);
         txtbtn3.setEnabled(false);
         txtbtn4.setEnabled(false);
         txtbtn5.setEnabled(false);
         txtbtn6.setEnabled(false);
         txtbtn7.setEnabled(false);
         txtbtn8.setEnabled(false);
         txtbtn9.setEnabled(false);
        
         
     }
    private void enableAllButtons(){
         txtbtn1.setEnabled(true);
         txtbtn2.setEnabled(true);
         txtbtn3.setEnabled(true);
         txtbtn4.setEnabled(true);
         txtbtn5.setEnabled(true);
         txtbtn6.setEnabled(true);
         txtbtn7.setEnabled(true);
         txtbtn8.setEnabled(true);
         txtbtn9.setEnabled(true);
        
    }
     
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
            
        }
    }
    
    private void WinningGame()
    {
       String b1 = txtbtn1.getText();
       String b2 = txtbtn2.getText(); 
       String b3 = txtbtn3.getText();
       String b4 = txtbtn4.getText();
       String b5 = txtbtn5.getText();
       String b6 = txtbtn6.getText();
       String b7 = txtbtn7.getText();
       String b8 = txtbtn8.getText();
       String b9 = txtbtn9.getText();
       
       // PLAYER X CODING
       
       if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn2.setBackground(Color.ORANGE);
           txtbtn3.setBackground(Color.ORANGE);
           disableAllButtons();
       }
      else  if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn4.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn6.setBackground(Color.ORANGE);
           disableAllButtons();
       }
     else  if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn7.setBackground(Color.ORANGE);
           txtbtn8.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       else if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn4.setBackground(Color.ORANGE);
           txtbtn7.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       else if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn2.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn8.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       
       else if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn3.setBackground(Color.ORANGE);
           txtbtn6.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       else  if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       else if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
       {
           JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           xCount++;
           gameScore();
           
           txtbtn3.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn7.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       
       
       
       
       if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn2.setBackground(Color.ORANGE);
           txtbtn3.setBackground(Color.ORANGE);
           disableAllButtons();
       }
       else  if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn4.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn6.setBackground(Color.ORANGE);
           disableAllButtons();
       }
     else  if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn7.setBackground(Color.ORANGE);
           txtbtn8.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
     else if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn4.setBackground(Color.ORANGE);
           txtbtn7.setBackground(Color.ORANGE);
           disableAllButtons();
       }
      else if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn2.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn8.setBackground(Color.ORANGE);
           disableAllButtons();
       }
     else  if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn2.setBackground(Color.ORANGE);
           txtbtn3.setBackground(Color.ORANGE);
           disableAllButtons();
       }
     else  if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn3.setBackground(Color.ORANGE);
           txtbtn6.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
    else  if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn1.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn9.setBackground(Color.ORANGE);
           disableAllButtons();
       }
      else if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
       {
           JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe",
                   JOptionPane.INFORMATION_MESSAGE); 
           oCount++;
           gameScore();
           
           txtbtn3.setBackground(Color.ORANGE);
           txtbtn5.setBackground(Color.ORANGE);
           txtbtn7.setBackground(Color.ORANGE);
           disableAllButtons();
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

        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 102));
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerx.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        playerx.setText("Player X :");

        playero.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        playero.setText("Player O :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Player 1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Player 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tic tac toe game");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setEnabled(false);
        txtbtn6.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setEnabled(false);
        txtbtn8.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit", "Tic Tac Toe" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
            
        {
         System.exit(0);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setEnabled(false);
       txtbtn1.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setEnabled(false);
        txtbtn2.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setEnabled(false);
        txtbtn3.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setEnabled(false);
        txtbtn4.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setEnabled(false);
        txtbtn5.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setEnabled(false);
        txtbtn7.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setEnabled(false);
        txtbtn9.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        enableAllButtons();
        
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
