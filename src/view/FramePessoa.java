
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.dao.PessoaDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FramePessoa extends javax.swing.JFrame {

    //Creates new form JFProduto    
    public FramePessoa() {
        initComponents();
        PreencherTabela(jtbInfoPessoas, true);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbInfoPessoas = new javax.swing.JTable();
        jtbExcluir = new javax.swing.JToggleButton();
        jtbIncluir = new javax.swing.JToggleButton();
        jtbAlterar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lbBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 300));
        jPanel1.setLayout(null);

        jtbInfoPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Tipo", "Data Nasc.", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jtbInfoPessoas);
        if (jtbInfoPessoas.getColumnModel().getColumnCount() > 0) {
            jtbInfoPessoas.getColumnModel().getColumn(0).setMinWidth(90);
            jtbInfoPessoas.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtbInfoPessoas.getColumnModel().getColumn(0).setMaxWidth(90);
            jtbInfoPessoas.getColumnModel().getColumn(2).setMinWidth(52);
            jtbInfoPessoas.getColumnModel().getColumn(2).setPreferredWidth(52);
            jtbInfoPessoas.getColumnModel().getColumn(2).setMaxWidth(52);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 10, 420, 280);

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
        jPanel1.add(jtbExcluir);
        jtbExcluir.setBounds(10, 130, 100, 30);

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
        jPanel1.add(jtbIncluir);
        jtbIncluir.setBounds(10, 50, 100, 30);

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
        jPanel1.add(jtbAlterar);
        jtbAlterar.setBounds(10, 90, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Opções");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 78, 36);

        lbBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        lbBackGround.setMaximumSize(new java.awt.Dimension(550, 300));
        lbBackGround.setMinimumSize(new java.awt.Dimension(550, 300));
        lbBackGround.setPreferredSize(new java.awt.Dimension(550, 300));
        jPanel1.add(lbBackGround);
        lbBackGround.setBounds(0, 0, 550, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbIncluirActionPerformed
        new FrameCadastroPessoa( true, 0, 2).setVisible(true);
        PreencherTabela(jtbInfoPessoas, true);
    }//GEN-LAST:event_jtbIncluirActionPerformed
    
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        PessoaDAO pdao = new PessoaDAO();
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = pdao.Select(0,0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String CPF = rsTabela.getString(1);
                    String Nome = rsTabela.getString(2);
                    String CodTpPes = rsTabela.getString(3);
                    String DtNasc = rsTabela.getString(4);
                    String Tel = rsTabela.getString(5);
                    String Email = rsTabela.getString(6);

                    Val.addRow(new String[] {CPF, Nome, CodTpPes, DtNasc, Tel, Email});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }

    private void jtbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbAlterarActionPerformed
        if (jtbInfoPessoas.getSelectedRowCount() != 0 ){
            int linha = jtbInfoPessoas.getSelectedRow();
            Object ValorCampo = jtbInfoPessoas.getModel().getValueAt(linha, 0);
            int codPes = Integer.valueOf((String) ValorCampo);
            new FrameCadastroPessoa( true, codPes, 1).setVisible(true);
            PreencherTabela(jtbInfoPessoas,true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para alterar.");
        }
    }//GEN-LAST:event_jtbAlterarActionPerformed

    private void jtbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExcluirActionPerformed
        if (jtbInfoPessoas.getSelectedRowCount() != 0 ){
            int linha = jtbInfoPessoas.getSelectedRow();
            Object ValorCampo = jtbInfoPessoas.getModel().getValueAt(linha, 0);
            int codPes = Integer.valueOf((String) ValorCampo);
            new FrameCadastroPessoa( true, codPes, 3).setVisible(true);
            PreencherTabela(jtbInfoPessoas, true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FramePessoa().setVisible(true);
            }
        });
        
        //PreencherTabela(jtbInfoPessoas, true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jtbAlterar;
    private javax.swing.JToggleButton jtbExcluir;
    private javax.swing.JToggleButton jtbIncluir;
    private static javax.swing.JTable jtbInfoPessoas;
    private javax.swing.JLabel lbBackGround;
    // End of variables declaration//GEN-END:variables
}
