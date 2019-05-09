package view;

import javax.swing.JOptionPane;
public class FramePrincipal extends javax.swing.JFrame {  
    
    public FramePrincipal() { 
        initComponents();
        //VerificaConexao();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFluxo = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiFichaExec = new javax.swing.JMenuItem();
        jmiAvaliacao = new javax.swing.JMenuItem();
        jmProd = new javax.swing.JMenu();
        jmiExercicios = new javax.swing.JMenuItem();
        jmiGrupoMusc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysGym");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jmFluxo.setText("Cadastro");
        jmFluxo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmFluxo.setMaximumSize(new java.awt.Dimension(71, 40));
        jmFluxo.setName("JMFlux"); // NOI18N
        jmFluxo.setPreferredSize(new java.awt.Dimension(71, 20));

        jmiUsuario.setText("Usuário");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jmFluxo.add(jmiUsuario);

        jmiFichaExec.setText("Ficha Exercício");
        jmiFichaExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFichaExecActionPerformed(evt);
            }
        });
        jmFluxo.add(jmiFichaExec);

        jmiAvaliacao.setText("Avaliação");
        jmiAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAvaliacaoActionPerformed(evt);
            }
        });
        jmFluxo.add(jmiAvaliacao);

        jMenuBar1.add(jmFluxo);

        jmProd.setText("Consulta");
        jmProd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmProd.setMaximumSize(new java.awt.Dimension(71, 40));
        jmProd.setName("JMProd"); // NOI18N
        jmProd.setPreferredSize(new java.awt.Dimension(71, 20));
        jmProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProdMouseClicked(evt);
            }
        });
        jmProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdActionPerformed(evt);
            }
        });

        jmiExercicios.setText("Exercícios");
        jmiExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExerciciosActionPerformed(evt);
            }
        });
        jmProd.add(jmiExercicios);

        jmiGrupoMusc.setText("GrupoMuscular");
        jmiGrupoMusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGrupoMuscActionPerformed(evt);
            }
        });
        jmProd.add(jmiGrupoMusc);

        jMenuBar1.add(jmProd);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        new FramePessoa().setVisible(true);
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiFichaExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFichaExecActionPerformed
        JOptionPane.showMessageDialog(null, "Programa ainda não implementado.");
    }//GEN-LAST:event_jmiFichaExecActionPerformed

    private void jmProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdActionPerformed
  
    }//GEN-LAST:event_jmProdActionPerformed

    private void jmProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProdMouseClicked
        //new JFProduto().setVisible(true);
    }//GEN-LAST:event_jmProdMouseClicked

    private void jmiAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAvaliacaoActionPerformed
        JOptionPane.showMessageDialog(null, "Programa ainda não implementado.");
    }//GEN-LAST:event_jmiAvaliacaoActionPerformed

    private void jmiExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExerciciosActionPerformed
        new FrameExercicios().setVisible(true);
    }//GEN-LAST:event_jmiExerciciosActionPerformed

    private void jmiGrupoMuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGrupoMuscActionPerformed
        new FrameGrupoMuscular().setVisible(true);
    }//GEN-LAST:event_jmiGrupoMuscActionPerformed
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    /*public final void VerificaConexao(){
        if (ExecComand.TestarConexão() != true){
            JOptionPane.showMessageDialog(null, "Problema ao conectar ao banco de dados. \n"
                    + "Verifique se o servidor esta ativo.");
            System.exit(0);
        }
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmFluxo;
    private javax.swing.JMenu jmProd;
    private javax.swing.JMenuItem jmiAvaliacao;
    private javax.swing.JMenuItem jmiExercicios;
    private javax.swing.JMenuItem jmiFichaExec;
    private javax.swing.JMenuItem jmiGrupoMusc;
    private javax.swing.JMenuItem jmiUsuario;
    // End of variables declaration//GEN-END:variables
}
