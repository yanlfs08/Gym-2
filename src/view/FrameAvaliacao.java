
package view;

import model.bean.Avaliacao;
import model.dao.AvaliacaoDAO;
import javax.swing.JOptionPane;

public class FrameAvaliacao extends javax.swing.JFrame {
    static AvaliacaoDAO AvalBD = new AvaliacaoDAO();
    //Creates new form JFProduto    
    public FrameAvaliacao() {
        initComponents();
        AvalBD.PreencherTabela(jtbInfoAvalicao, true);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtbAlterar = new javax.swing.JToggleButton();
        jtbIncluir = new javax.swing.JToggleButton();
        jtbExcluir = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbInfoAvalicao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Opções");

        jtbAlterar.setText("Alterar");
        jtbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbAlterarActionPerformed(evt);
            }
        });

        jtbIncluir.setText("Incluir");
        jtbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbIncluirActionPerformed(evt);
            }
        });

        jtbExcluir.setText("Excluir");
        jtbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExcluirActionPerformed(evt);
            }
        });

        jtbInfoAvalicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Avaliação", "Usuário", "Peso", "Altura", "Gordura(%)"
            }
        ));
        jScrollPane1.setViewportView(jtbInfoAvalicao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jtbIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jtbIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbIncluirActionPerformed
        new FrameCadAvaliacao(true, 0, 2).setVisible(true);
        AvalBD.PreencherTabela(jtbInfoAvalicao, true);
    }//GEN-LAST:event_jtbIncluirActionPerformed

    private void jtbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbAlterarActionPerformed
        if (jtbInfoAvalicao.getSelectedRowCount() != 0 ){
            int linha = jtbInfoAvalicao.getSelectedRow();
            Object ValorCampo = jtbInfoAvalicao.getModel().getValueAt(linha, 0);
            int codAval = Integer.valueOf((String) ValorCampo);
            new FrameCadAvaliacao( true, codAval, 1).setVisible(true);
            AvalBD.PreencherTabela(jtbInfoAvalicao,true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para alterar.");
        }
    }//GEN-LAST:event_jtbAlterarActionPerformed

    private void jtbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExcluirActionPerformed
        if (jtbInfoAvalicao.getSelectedRowCount() != 0 ){
            int linha = jtbInfoAvalicao.getSelectedRow();
            Object ValorCampo = jtbInfoAvalicao.getModel().getValueAt(linha, 0);
            int codAval = Integer.valueOf((String) ValorCampo);
            new FrameCadAvaliacao( true, codAval, 3).setVisible(true);
            AvalBD.PreencherTabela(jtbInfoAvalicao, true);
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
            java.util.logging.Logger.getLogger(FrameAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAvaliacao().setVisible(true);
            }
        });
        
        AvalBD.PreencherTabela(jtbInfoAvalicao, true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jtbAlterar;
    private javax.swing.JToggleButton jtbExcluir;
    private javax.swing.JToggleButton jtbIncluir;
    private static javax.swing.JTable jtbInfoAvalicao;
    // End of variables declaration//GEN-END:variables
}
