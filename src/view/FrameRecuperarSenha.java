/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrameRecuperarSenha extends javax.swing.JFrame {

 
    public FrameRecuperarSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCPFrec = new gym.JTextFieldHint(new JTextField(),"","CPF");
        ;
        txtEmailrec = new gym.JTextFieldHint(new JTextField(),"","Email");
        ;
        jbRecuperarSenha = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Recuperar Senha"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Recuperação de senha ");

        txtCPFrec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPFrecFocusGained(evt);
            }
        });
        txtCPFrec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCPFrecMouseClicked(evt);
            }
        });
        txtCPFrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFrecActionPerformed(evt);
            }
        });

        txtEmailrec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailrecFocusGained(evt);
            }
        });
        txtEmailrec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailrecMouseClicked(evt);
            }
        });
        txtEmailrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailrecActionPerformed(evt);
            }
        });

        jbRecuperarSenha.setBackground(new java.awt.Color(10, 173, 225));
        jbRecuperarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbRecuperarSenha.setForeground(new java.awt.Color(240, 240, 240));
        jbRecuperarSenha.setText("Recuperar Senha");
        jbRecuperarSenha.setBorderPainted(false);
        jbRecuperarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRecuperarSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRecuperarSenhaMouseExited(evt);
            }
        });
        jbRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecuperarSenhaActionPerformed(evt);
            }
        });

        JBSair.setBackground(new java.awt.Color(217, 81, 51));
        JBSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 255));
        JBSair.setText("Sair");
        JBSair.setBorderPainted(false);
        JBSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSair.setFocusPainted(false);
        JBSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBSairMouseExited(evt);
            }
        });
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmailrec, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFrec, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(txtCPFrec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmailrec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Recuperar senha por e-mail");
        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFrecActionPerformed

    private void jbRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaActionPerformed
        
        
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 465);
        props.put("mail.smtp.user", "yan.lfs8@gmail.com");
        props.put("mail.smtp.auth", "false");
        props.put("mail.smtp.starttls.enable", "false");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false"); 
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://projetopi2019.mysql.uhserver.com:3306/projetopi2019",
                    "projetopi","Projetopi@2019");
            //Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","");
            //String query = "select Password from users where EmailAddress LIKE '"+txtEmail.getText().trim()+"'";
            String query = "SELECT senha FROM cadastro WHERE email LIKE '"+txtEmailrec.getText().trim()+"' AND cpf = '"+txtCPFrec.getText().trim()+"'";
            PreparedStatement statmnt = con.prepareStatement(query);
            ResultSet result = statmnt.executeQuery();               
            if (result.next()){   

                String fetchedPassword = result.getString("senha");               
                Session session = Session.getDefaultInstance(props, null);
                session.setDebug(true);
                MimeMessage message = new MimeMessage(session);
                message.setText("Sua senha é: " + fetchedPassword);
                message.setSubject("Recuperação de Senha");
                message.setFrom(new InternetAddress("yan.lfs8@gmail.com"));
                message.addRecipient(RecipientType.TO, new InternetAddress(txtEmailrec.getText().trim()));
                message.saveChanges();
                javax.mail.Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", "yan.lfs8@gmail.com", "Yan@081296");
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                JOptionPane.showMessageDialog(rootPane, "A senha foi enviada para o email cadastrado");
                         
            }else{
               JOptionPane.showMessageDialog(rootPane, "CPF ou E-mail incorretos");
            }
        } catch (Exception e) {
            e.printStackTrace();  
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jbRecuperarSenhaActionPerformed

    private void jbRecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaMouseEntered
        jbRecuperarSenha.setBackground(new Color(255, 255, 255));
        jbRecuperarSenha.setForeground(new Color(10,173,225));
    }//GEN-LAST:event_jbRecuperarSenhaMouseEntered
                           
    private void jbRecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaMouseExited
        jbRecuperarSenha.setBackground(new Color(10,173,225));
        jbRecuperarSenha.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbRecuperarSenhaMouseExited

    private void JBSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseEntered
        JBSair.setBackground(new Color(255, 255, 255));
        JBSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_JBSairMouseEntered

    private void JBSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseExited
        JBSair.setBackground(new Color(217, 81, 51));
        JBSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_JBSairMouseExited

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        dispose();
    }//GEN-LAST:event_JBSairActionPerformed

    
    private void txtCPFrecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFrecFocusGained
       
    }//GEN-LAST:event_txtCPFrecFocusGained

    private void txtCPFrecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFrecMouseClicked
       
    }//GEN-LAST:event_txtCPFrecMouseClicked

    private void txtEmailrecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailrecFocusGained
      

    }//GEN-LAST:event_txtEmailrecFocusGained

    private void txtEmailrecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailrecMouseClicked
      
    }//GEN-LAST:event_txtEmailrecMouseClicked
   
    private void txtEmailrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailrecActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRecuperarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbRecuperarSenha;
    private javax.swing.JTextField txtCPFrec;
    private javax.swing.JTextField txtEmailrec;
    // End of variables declaration//GEN-END:variables
}
