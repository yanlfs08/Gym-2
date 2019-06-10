
package view;

public class FramePrincipalMedico extends javax.swing.JFrame {

    public FramePrincipalMedico() {
        initComponents();

    }
    

    public void userVerification(String user){
             
        lbUsuario1.setText(user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbUserIcon = new javax.swing.JLabel();
        lbAvaliação = new javax.swing.JLabel();
        lbExercicio = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbFicha = new javax.swing.JLabel();
        lbUsuario1 = new javax.swing.JLabel();
        lbMenu1 = new javax.swing.JLabel();
        lbMenu2 = new javax.swing.JLabel();
        lbMenu3 = new javax.swing.JLabel();
        lbMenu4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/Icon.png")).getImage());
        setMinimumSize(null);
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 480));
        jPanel1.setLayout(null);

        lbUserIcon.setToolTipText("Usuários");
        lbUserIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbUserIcon.setEnabled(false);
        lbUserIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbUserIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbUserIconMouseExited(evt);
            }
        });
        jPanel1.add(lbUserIcon);
        lbUserIcon.setBounds(250, 80, 139, 130);

        lbAvaliação.setToolTipText("Avaliações");
        lbAvaliação.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbAvaliação.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAvaliaçãoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAvaliaçãoMouseExited(evt);
            }
        });
        jPanel1.add(lbAvaliação);
        lbAvaliação.setBounds(430, 250, 140, 130);

        lbExercicio.setToolTipText("Exercícios");
        lbExercicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbExercicio.setEnabled(false);
        lbExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExercicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExercicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExercicioMouseExited(evt);
            }
        });
        jPanel1.add(lbExercicio);
        lbExercicio.setBounds(430, 80, 139, 130);

        lbLogout.setToolTipText("Ficha de exercícios");
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogoutMouseExited(evt);
            }
        });
        jPanel1.add(lbLogout);
        lbLogout.setBounds(630, 420, 40, 40);

        lbFicha.setToolTipText("Ficha de exercícios");
        lbFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFichaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFichaMouseExited(evt);
            }
        });
        jPanel1.add(lbFicha);
        lbFicha.setBounds(250, 250, 139, 130);

        lbUsuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUsuario1.setForeground(new java.awt.Color(102, 102, 102));
        lbUsuario1.setToolTipText("");
        jPanel1.add(lbUsuario1);
        lbUsuario1.setBounds(130, 30, 100, 20);

        lbMenu1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        lbMenu1.setForeground(new java.awt.Color(102, 102, 102));
        lbMenu1.setToolTipText("");
        jPanel1.add(lbMenu1);
        lbMenu1.setBounds(280, 210, 100, 40);

        lbMenu2.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        lbMenu2.setForeground(new java.awt.Color(102, 102, 102));
        lbMenu2.setToolTipText("");
        jPanel1.add(lbMenu2);
        lbMenu2.setBounds(460, 210, 100, 40);

        lbMenu3.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        lbMenu3.setForeground(new java.awt.Color(102, 102, 102));
        lbMenu3.setToolTipText("");
        jPanel1.add(lbMenu3);
        lbMenu3.setBounds(290, 380, 100, 40);

        lbMenu4.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        lbMenu4.setForeground(new java.awt.Color(102, 102, 102));
        lbMenu4.setToolTipText("");
        jPanel1.add(lbMenu4);
        lbMenu4.setBounds(460, 380, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Bem vind@");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 90, 20);

        lbBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Banner.png"))); // NOI18N
        lbBackGround.setMaximumSize(null);
        lbBackGround.setMinimumSize(null);
        lbBackGround.setPreferredSize(null);
        lbBackGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBackGroundMouseEntered(evt);
            }
        });
        jPanel1.add(lbBackGround);
        lbBackGround.setBounds(0, 0, 700, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExercicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExercicioMouseEntered
        lbExercicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(192, 57, 43), new java.awt.Color(192, 57, 43)));
        lbExercicio.setBounds(435, 80, 139, 130);
        lbMenu2.setText("Exercícios");
    }//GEN-LAST:event_lbExercicioMouseEntered

    private void lbExercicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExercicioMouseExited
         lbExercicio.setBorder(null);
         lbMenu2.setText(" ");
    }//GEN-LAST:event_lbExercicioMouseExited

    private void lbUserIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserIconMouseEntered
        lbUserIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(192, 57, 43), new java.awt.Color(192, 57, 43))); 
        lbUserIcon.setBounds(250, 85, 139, 130);
        lbMenu1.setText("Usuários");
    }//GEN-LAST:event_lbUserIconMouseEntered

    private void lbUserIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserIconMouseExited
        lbUserIcon.setBorder(null);
        lbMenu1.setText(" ");
    }//GEN-LAST:event_lbUserIconMouseExited

    private void lbFichaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFichaMouseEntered
        lbFicha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        lbFicha.setBounds(250, 255, 139, 130);
        lbMenu3.setText("Fichas");
    }//GEN-LAST:event_lbFichaMouseEntered

    private void lbFichaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFichaMouseExited
        lbFicha.setBorder(null);
        lbMenu3.setText(" ");
    }//GEN-LAST:event_lbFichaMouseExited

    private void lbAvaliaçãoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAvaliaçãoMouseEntered
        lbAvaliação.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        lbAvaliação.setBounds(432, 255, 140, 130);
        lbMenu4.setText("Avaliações");
    }//GEN-LAST:event_lbAvaliaçãoMouseEntered

    private void lbAvaliaçãoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAvaliaçãoMouseExited
        lbAvaliação.setBorder(null);
        lbMenu4.setText(" ");
    }//GEN-LAST:event_lbAvaliaçãoMouseExited

    private void lbLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseEntered
        lbLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        lbLogout.setBounds(633, 417, 40, 40);
    }//GEN-LAST:event_lbLogoutMouseEntered

    private void lbLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseExited
        lbLogout.setBorder(null);
    }//GEN-LAST:event_lbLogoutMouseExited

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        FrameLogoff frm = new FrameLogoff();
        frm.setVisible(true);
        
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbExercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExercicioMouseClicked

    }//GEN-LAST:event_lbExercicioMouseClicked

    private void lbBackGroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackGroundMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBackGroundMouseEntered

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
            java.util.logging.Logger.getLogger(FramePrincipalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAvaliação;
    private javax.swing.JLabel lbBackGround;
    private javax.swing.JLabel lbExercicio;
    private javax.swing.JLabel lbFicha;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMenu1;
    private javax.swing.JLabel lbMenu2;
    private javax.swing.JLabel lbMenu3;
    private javax.swing.JLabel lbMenu4;
    private javax.swing.JLabel lbUserIcon;
    private javax.swing.JLabel lbUsuario1;
    // End of variables declaration//GEN-END:variables
}
