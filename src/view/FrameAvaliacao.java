
package view;

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtbAlterar = new javax.swing.JToggleButton();
        jtbIncluir = new javax.swing.JToggleButton();
        jtbExcluir = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbInfoAvalicao = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(609, 331));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opções");

        jtbAlterar.setText("Alterar");
        jtbAlterar.setPreferredSize(new java.awt.Dimension(83, 25));
        jtbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbAlterarActionPerformed(evt);
            }
        });

        jtbIncluir.setText("Incluir");
        jtbIncluir.setPreferredSize(new java.awt.Dimension(83, 25));
        jtbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbIncluirActionPerformed(evt);
            }
        });

        jtbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtbExcluir.setText("Excluir");
        jtbExcluir.setPreferredSize(new java.awt.Dimension(83, 25));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtbAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jtbExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jtbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbIncluirActionPerformed
        new FrameCadAvaliacao(true, 0, 2).setVisible(true);
        AvalBD.PreencherTabela(jtbInfoAvalicao, true);
    }//GEN-LAST:event_jtbIncluirActionPerformed
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jtbAlterar;
    private javax.swing.JToggleButton jtbExcluir;
    private javax.swing.JToggleButton jtbIncluir;
    private static javax.swing.JTable jtbInfoAvalicao;
    // End of variables declaration//GEN-END:variables
}
