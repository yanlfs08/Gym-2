
package view;

import gym.JPassWordFieldHint;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.dao.CadastroDAO;

/**
 *
 * @author yanlf
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCPF = new gym.JTextFieldHint(new JTextField(),"","  CPF");
        ;
        txtSenha = new JPassWordFieldHint (new JPasswordField(), "", "  Senha");
 ;
        JBLogin1 = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        JLrecuperarSenha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 49, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 480));

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

        JBLogin1.setBackground(new java.awt.Color(10, 173, 255));
        JBLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBLogin1.setForeground(new java.awt.Color(255, 255, 255));
        JBLogin1.setText("Login");
        JBLogin1.setBorderPainted(false);
        JBLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBLogin1.setFocusPainted(false);
        JBLogin1.setFocusable(false);
        JBLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBLogin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBLogin1MouseExited(evt);
            }
        });
        JBLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLogin1ActionPerformed(evt);
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

        JLrecuperarSenha.setBackground(new java.awt.Color(217, 81, 51));
        JLrecuperarSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLrecuperarSenha.setForeground(new java.awt.Color(217, 81, 51));
        JLrecuperarSenha.setText("Recuperar");
        JLrecuperarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Esqueceu sua senha?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLrecuperarSenha))
                    .addComponent(JBLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(JBLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLrecuperarSenha)
                    .addComponent(jLabel5))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPFMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFMouseEntered

    private void JLrecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseEntered
        JLrecuperarSenha.setForeground(Color.red);
    }//GEN-LAST:event_JLrecuperarSenhaMouseEntered

    private void JLrecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseExited
        JLrecuperarSenha.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_JLrecuperarSenhaMouseExited

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JBLogin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogin1MouseEntered
        JBLogin1.setBackground(new Color(46, 49, 49));
        JBLogin1.setForeground(new Color(10,173,255));
    }//GEN-LAST:event_JBLogin1MouseEntered

    private void JBSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseEntered
        JBSair.setBackground(new Color(46, 49, 49));
        JBSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_JBSairMouseEntered

    private void JBSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseExited
        JBSair.setBackground(new Color(217, 81, 51));
        JBSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_JBSairMouseExited

    private void JBLogin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogin1MouseExited
        JBLogin1.setBackground(new Color(10,173,255));
        JBLogin1.setForeground(Color.WHITE);
    }//GEN-LAST:event_JBLogin1MouseExited

    private void JBLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLogin1ActionPerformed
        CadastroDAO dao = new CadastroDAO();
        if(dao.validarLogin(txtCPF.getText(), txtSenha.getText())){
            
            new FrameMenu().setVisible(true);
            dispose();
            
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Login e/ou senha invalidos!");
        }
        
    }//GEN-LAST:event_JBLogin1ActionPerformed

    private void JLrecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseClicked
        
        new FrameRecuperarSenha().setVisible(true);
    }//GEN-LAST:event_JLrecuperarSenhaMouseClicked

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped

    }//GEN-LAST:event_txtSenhaKeyTyped

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
            CadastroDAO dao = new CadastroDAO();
            if(dao.validarLogin(txtCPF.getText(), txtSenha.getText())){
            new FrameMenu().setVisible(true);
            dispose();
            
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Login e/ou senha invalidos!");
            }
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLogin1;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel JLrecuperarSenha;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
