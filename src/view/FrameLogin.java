/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
import gym.JPassWordFieldHint;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.dao.CadastroDAO;

public class FrameLogin extends javax.swing.JFrame {

    public FrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCPF = new gym.JTextFieldHint(new JTextField(),"","CPF");  ;
        txtSenha = new JPassWordFieldHint (new JPasswordField(), "", "Senha");
 ;
        JLrecuperarSenha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/Icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(700, 480));

        jPanel1.setLayout(null);

        txtCPF.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        txtCPF.setBorder(null);
        txtCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCPFMouseEntered(evt);
            }
        });
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPF);
        txtCPF.setBounds(430, 158, 170, 22);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSenha.setBorder(null);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(430, 230, 170, 22);

        JLrecuperarSenha.setBackground(new java.awt.Color(10, 173, 255));
        JLrecuperarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLrecuperarSenha.setForeground(new java.awt.Color(10, 173, 255));
        JLrecuperarSenha.setText("Recuperar");
        JLrecuperarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLrecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLrecuperarSenhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLrecuperarSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLrecuperarSenhaMouseExited(evt);
            }
        });
        jPanel1.add(JLrecuperarSenha);
        JLrecuperarSenha.setBounds(530, 370, 61, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Esqueceu sua senha?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 370, 128, 20);

        jbLogin.setBackground(new java.awt.Color(157, 216, 219));
        jbLogin.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setText("Entrar");
        jbLogin.setBorder(null);
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLoginMouseExited(evt);
            }
        });
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbLogin);
        jbLogin.setBounds(390, 320, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/_Login 2.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFMouseEntered

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            CadastroDAO dao = new CadastroDAO();
            String senha = new String(txtSenha.getPassword()).trim();
        
            if(dao.validarLogin(txtCPF.getText(), senha)){
            
                try{
                    Connection con = ConnectionFactory.getConnection();
                    String query = "SELECT nome, idTipoUsuarios FROM cadastro WHERE cpf = '" +txtCPF.getText()+"';";
                    PreparedStatement stmt = con.prepareStatement(query);
                    ResultSet rs = stmt.executeQuery();

                    while (rs.next()){
                        
                        if (rs.getString("idTipoUsuarios").equalsIgnoreCase("1")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("2")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("3")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipalMedico frm = new FramePrincipalMedico();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("4")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("5")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }
                    }
                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(null, "Erro ao verificar Usuario " + ex);   
                    }                        
            }else{
            JOptionPane.showMessageDialog(rootPane, "Login e/ou senha invalidos!");
            }
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped

    }//GEN-LAST:event_txtSenhaKeyTyped

    private void JLrecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseClicked
        
        this.dispose();
        FrameRecSenha frm = new FrameRecSenha();
        frm.setVisible(true);
    }//GEN-LAST:event_JLrecuperarSenhaMouseClicked

    private void JLrecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseEntered
        JLrecuperarSenha.setForeground(Color.red);
    }//GEN-LAST:event_JLrecuperarSenhaMouseEntered

    private void JLrecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseExited
        JLrecuperarSenha.setForeground(new Color(10,173,255));
    }//GEN-LAST:event_JLrecuperarSenhaMouseExited

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        CadastroDAO dao = new CadastroDAO();
        String senha = new String(txtSenha.getPassword()).trim();

        if(dao.validarLogin(txtCPF.getText(), senha)){
            
            try{
                Connection con = ConnectionFactory.getConnection();
                String query = "SELECT nome, idTipoUsuarios FROM cadastro WHERE cpf = '" +txtCPF.getText()+"';";
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()){
                        
                    if (rs.getString("idTipoUsuarios").equalsIgnoreCase("1")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("2")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("3")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipalMedico frm = new FramePrincipalMedico();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("4")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }else if
                                
                            (rs.getString("idTipoUsuarios").equalsIgnoreCase("5")){
                            String[] Nome = rs.getString("nome").split(" ");
                            FramePrincipal frm = new FramePrincipal();
                            frm.userVerification(Nome[0]);
                            frm.setVisible(true);
                            dispose();   
                        }
                    }
                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(null, "Erro ao verificar Usuario " + ex);   
                    }                        
            }else{
            JOptionPane.showMessageDialog(rootPane, "CPF e/ou senha invalidos!");
            }
        
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseEntered
        jbLogin.setBackground(Color.white);
        jbLogin.setForeground(new Color(157,216,219));
        jbLogin.setBorderPainted(true);
    }//GEN-LAST:event_jbLoginMouseEntered

    private void jbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseExited
        jbLogin.setBackground(new Color(157,216,219));
        jbLogin.setForeground(Color.WHITE);
        jbLogin.setBorderPainted(false);
    }//GEN-LAST:event_jbLoginMouseExited

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLrecuperarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
