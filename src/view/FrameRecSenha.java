
package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
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

public class FrameRecSenha extends javax.swing.JFrame {

    public FrameRecSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCPFrec = new gym.JTextFieldHint(new JTextField(),""," CPF");
        txtEmailrec = new gym.JTextFieldHint(new JTextField(),"","Email");  ;
        jbRecuperarSenha = new javax.swing.JButton();
        jbRecuperarSenha1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 480));

        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        txtCPFrec.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtCPFrec.setBorder(null);
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
        jPanel1.add(txtCPFrec);
        txtCPFrec.setBounds(437, 189, 170, 30);

        txtEmailrec.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtEmailrec.setBorder(null);
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
        txtEmailrec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailrecKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmailrec);
        txtEmailrec.setBounds(437, 253, 170, 30);

        jbRecuperarSenha.setBackground(new java.awt.Color(157, 216, 219));
        jbRecuperarSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbRecuperarSenha.setForeground(new java.awt.Color(240, 240, 240));
        jbRecuperarSenha.setText("RECUPERAR SENHA");
        jbRecuperarSenha.setBorder(null);
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
        jPanel1.add(jbRecuperarSenha);
        jbRecuperarSenha.setBounds(394, 310, 220, 42);

        jbRecuperarSenha1.setBackground(new java.awt.Color(157, 216, 219));
        jbRecuperarSenha1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbRecuperarSenha1.setForeground(new java.awt.Color(240, 240, 240));
        jbRecuperarSenha1.setText("VOLTAR");
        jbRecuperarSenha1.setBorder(null);
        jbRecuperarSenha1.setBorderPainted(false);
        jbRecuperarSenha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRecuperarSenha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRecuperarSenha1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRecuperarSenha1MouseExited(evt);
            }
        });
        jbRecuperarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecuperarSenha1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbRecuperarSenha1);
        jbRecuperarSenha1.setBounds(394, 360, 220, 42);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/RecSenha.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFrecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFrecFocusGained

    }//GEN-LAST:event_txtCPFrecFocusGained

    private void txtCPFrecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFrecMouseClicked

    }//GEN-LAST:event_txtCPFrecMouseClicked

    private void txtCPFrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFrecActionPerformed

    private void txtEmailrecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailrecFocusGained

    }//GEN-LAST:event_txtEmailrecFocusGained

    private void txtEmailrecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailrecMouseClicked

    }//GEN-LAST:event_txtEmailrecMouseClicked

    private void txtEmailrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailrecActionPerformed

    private void txtEmailrecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailrecKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", 465);
            props.put("mail.smtp.user", "systemgymfit@gmail.com");
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
                    message.setFrom(new InternetAddress("systemgymfit@gmail.com"));
                    message.addRecipient(RecipientType.TO, new InternetAddress(txtEmailrec.getText().trim()));
                    message.saveChanges();
                    javax.mail.Transport transport = session.getTransport("smtp");
                    transport.connect("smtp.gmail.com", "systemgymfit@gmail.com", "Projetopi@2019");
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

        }
    }//GEN-LAST:event_txtEmailrecKeyPressed

    private void jbRecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaMouseEntered
        jbRecuperarSenha.setBackground(new Color(255, 255, 255));
        jbRecuperarSenha.setForeground(new Color(157,216,219));
        jbRecuperarSenha.setBorderPainted(true);
    }//GEN-LAST:event_jbRecuperarSenhaMouseEntered

    private void jbRecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaMouseExited
        jbRecuperarSenha.setBackground(new Color(157,216,219));
        jbRecuperarSenha.setForeground(Color.WHITE);
        jbRecuperarSenha.setBorderPainted(false);
    }//GEN-LAST:event_jbRecuperarSenhaMouseExited

    private void jbRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecuperarSenhaActionPerformed

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 465);
        props.put("mail.smtp.user", "systemgymfit@gmail.com");
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
                message.setFrom(new InternetAddress("systemgymfit@gmail.com"));
                message.addRecipient(RecipientType.TO, new InternetAddress(txtEmailrec.getText().trim()));
                message.saveChanges();
                javax.mail.Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", "systemgymfit@gmail.com", "Projetopi@2019");
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

    private void jbRecuperarSenha1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenha1MouseEntered
        jbRecuperarSenha1.setBackground(new Color(255, 255, 255));
        jbRecuperarSenha1.setForeground(new Color(157,216,219));
        jbRecuperarSenha1.setBorderPainted(true);
    }//GEN-LAST:event_jbRecuperarSenha1MouseEntered

    private void jbRecuperarSenha1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarSenha1MouseExited
        jbRecuperarSenha1.setBackground(new Color(157,216,219));
        jbRecuperarSenha1.setForeground(Color.WHITE);
        jbRecuperarSenha1.setBorderPainted(false);
    }//GEN-LAST:event_jbRecuperarSenha1MouseExited

    private void jbRecuperarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecuperarSenha1ActionPerformed
        this.dispose();
        FrameLogin frm = new FrameLogin();
        frm.setVisible(true);
    }//GEN-LAST:event_jbRecuperarSenha1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRecSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRecSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbRecuperarSenha;
    private javax.swing.JButton jbRecuperarSenha1;
    private javax.swing.JTextField txtCPFrec;
    private javax.swing.JTextField txtEmailrec;
    // End of variables declaration//GEN-END:variables
}
