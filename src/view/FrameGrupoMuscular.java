
package view;

import javax.swing.JOptionPane;
import model.dao.GrupoMuscularDAO;

public class FrameGrupoMuscular extends javax.swing.JFrame {
    static GrupoMuscularDAO tbGrupoMusc = new GrupoMuscularDAO();
    //Creates new form JFProduto    
    public FrameGrupoMuscular() {
        initComponents();
        tbGrupoMusc.PreencherTabela(jtbInfoTpPgto, true);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtbAlterar = new javax.swing.JToggleButton();
        jtbIncluir = new javax.swing.JToggleButton();
        jtbExcluir = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbInfoTpPgto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Opções");

        jtbAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbAlterar.setText("Alterar");
        jtbAlterar.setMaximumSize(new java.awt.Dimension(100, 30));
        jtbAlterar.setMinimumSize(new java.awt.Dimension(100, 30));
        jtbAlterar.setPreferredSize(new java.awt.Dimension(100, 30));
        jtbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbAlterarActionPerformed(evt);
            }
        });

        jtbIncluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbIncluir.setText("Incluir");
        jtbIncluir.setMaximumSize(new java.awt.Dimension(100, 30));
        jtbIncluir.setMinimumSize(new java.awt.Dimension(100, 30));
        jtbIncluir.setPreferredSize(new java.awt.Dimension(100, 30));
        jtbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbIncluirActionPerformed(evt);
            }
        });

        jtbExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbExcluir.setText("Excluir");
        jtbExcluir.setMaximumSize(new java.awt.Dimension(100, 30));
        jtbExcluir.setMinimumSize(new java.awt.Dimension(100, 30));
        jtbExcluir.setPreferredSize(new java.awt.Dimension(100, 30));
        jtbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExcluirActionPerformed(evt);
            }
        });

        jtbInfoTpPgto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtbInfoTpPgto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jtbInfoTpPgto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbIncluirActionPerformed
        new FrameGerenciarGrupoMuscular(true, 0, 2).setVisible(true);
        tbGrupoMusc.PreencherTabela(jtbInfoTpPgto, true);
    }//GEN-LAST:event_jtbIncluirActionPerformed

    private void jtbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbAlterarActionPerformed
        if (jtbInfoTpPgto.getSelectedRowCount() != 0 ){
            int linha = jtbInfoTpPgto.getSelectedRow();
            Object ValorCampo = jtbInfoTpPgto.getModel().getValueAt(linha, 0);
            int codTPPes = Integer.valueOf((String) ValorCampo);
            new FrameGerenciarGrupoMuscular( true, codTPPes, 1).setVisible(true);
            tbGrupoMusc.PreencherTabela(jtbInfoTpPgto,true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para alterar.");
        }
    }//GEN-LAST:event_jtbAlterarActionPerformed

    private void jtbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExcluirActionPerformed
        if (jtbInfoTpPgto.getSelectedRowCount() != 0 ){
            int linha = jtbInfoTpPgto.getSelectedRow();
            Object ValorCampo = jtbInfoTpPgto.getModel().getValueAt(linha, 0);
            int codPes = Integer.valueOf((String) ValorCampo);
            new FrameGerenciarGrupoMuscular( true, codPes, 3).setVisible(true);
            tbGrupoMusc.PreencherTabela(jtbInfoTpPgto, true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para excluir.");
        }
    }//GEN-LAST:event_jtbExcluirActionPerformed
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
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGrupoMuscular().setVisible(true);
            }
        });
        
        tbGrupoMusc.PreencherTabela(jtbInfoTpPgto, true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jtbAlterar;
    private javax.swing.JToggleButton jtbExcluir;
    private javax.swing.JToggleButton jtbIncluir;
    private static javax.swing.JTable jtbInfoTpPgto;
    // End of variables declaration//GEN-END:variables
}
