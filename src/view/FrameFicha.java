
package view;

import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dao.FichaDAO;
import model.dao.PDF;
import static view.FrameAvaliacao.AvalBD;

public class FrameFicha extends javax.swing.JFrame {
    static FichaDAO FichaBD = new FichaDAO();
    static PDF PDFBD = new PDF();
    //Creates new form JFProduto  
    public FrameFicha() {
        initComponents();
        FichaBD.PreencherTabela(TableFicha, true);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbIncluir = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFicha = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/alt.png")).getImage());
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(395, 297));
        jPanel1.setLayout(null);

        jbIncluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.setToolTipText("Atualizar os dados da tabela");
        jbIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbIncluir.setMaximumSize(new java.awt.Dimension(100, 30));
        jbIncluir.setMinimumSize(new java.awt.Dimension(100, 30));
        jbIncluir.setPreferredSize(new java.awt.Dimension(100, 30));
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbIncluir);
        jbIncluir.setBounds(10, 60, 100, 30);

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Atualizar os dados da tabela");
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbExcluir.setMaximumSize(new java.awt.Dimension(100, 30));
        jbExcluir.setMinimumSize(new java.awt.Dimension(100, 30));
        jbExcluir.setPreferredSize(new java.awt.Dimension(100, 30));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluir);
        jbExcluir.setBounds(10, 140, 100, 30);

        jbAtu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtu.setText("Alterar");
        jbAtu.setToolTipText("Atualizar os dados da tabela");
        jbAtu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAtu.setMaximumSize(new java.awt.Dimension(100, 30));
        jbAtu.setMinimumSize(new java.awt.Dimension(100, 30));
        jbAtu.setPreferredSize(new java.awt.Dimension(100, 30));
        jbAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtuActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtu);
        jbAtu.setBounds(10, 100, 100, 30);
        jbAtu.getAccessibleContext().setAccessibleName("Atualizar ");
        jbAtu.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Opções");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 90, 32);

        jbPDF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbPDF.setText("Exportar");
        jbPDF.setToolTipText("Atualizar os dados da tabela");
        jbPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbPDF.setMaximumSize(new java.awt.Dimension(100, 30));
        jbPDF.setMinimumSize(new java.awt.Dimension(100, 30));
        jbPDF.setPreferredSize(new java.awt.Dimension(100, 30));
        jbPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPDFActionPerformed(evt);
            }
        });
        jPanel1.add(jbPDF);
        jbPDF.setBounds(10, 180, 100, 30);

        TableFicha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableFicha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ficha", "IdExec", "CPF", "Nome", "Exercício", "Repetição", "Série", "Carga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFichaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFicha);
        if (TableFicha.getColumnModel().getColumnCount() > 0) {
            TableFicha.getColumnModel().getColumn(0).setMinWidth(0);
            TableFicha.getColumnModel().getColumn(0).setPreferredWidth(0);
            TableFicha.getColumnModel().getColumn(0).setMaxWidth(0);
            TableFicha.getColumnModel().getColumn(1).setMinWidth(0);
            TableFicha.getColumnModel().getColumn(1).setPreferredWidth(0);
            TableFicha.getColumnModel().getColumn(1).setMaxWidth(0);
            TableFicha.getColumnModel().getColumn(2).setMinWidth(0);
            TableFicha.getColumnModel().getColumn(2).setPreferredWidth(0);
            TableFicha.getColumnModel().getColumn(2).setMaxWidth(0);
            TableFicha.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 10, 470, 280);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Exercicios");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jbAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtuActionPerformed
        if (TableFicha.getSelectedRowCount() != 0 ){
            int linha = TableFicha.getSelectedRow();
            Object ValorCampo = TableFicha.getModel().getValueAt(linha, 0);
            long codFicha = Long.valueOf((String) ValorCampo);
            ValorCampo = TableFicha.getModel().getValueAt(linha, 1);
            long codExec = Long.valueOf((String) ValorCampo);
            new FrameCadFicha( true, codFicha, codExec, 1).setVisible(true);
            FichaBD.PreencherTabela(TableFicha,true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para alterar.");
        }
    }//GEN-LAST:event_jbAtuActionPerformed

    
    private void TableFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFichaMouseClicked
        
        int linha = TableFicha.getSelectedRow();
        /*
        txtID.setText(TableFicha.getValueAt(linha,0).toString());
        txtExercicio.setText(TableFicha.getValueAt(linha,1).toString());
        txtDecGrupoMuscular.setText(TableFicha.getValueAt(linha,2).toString());
        txtDecGrupoMuscular.setEnabled(false);
        */
    }//GEN-LAST:event_TableFichaMouseClicked
    
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       if (TableFicha.getSelectedRowCount() != 0 ){
            int linha = TableFicha.getSelectedRow();
            Object ValorCampo = TableFicha.getModel().getValueAt(linha, 0);
            long codFicha = Long.valueOf((String) ValorCampo);
            ValorCampo = TableFicha.getModel().getValueAt(linha, 1);
            long codExec = Long.valueOf((String) ValorCampo);
            new FrameCadFicha( true, codFicha, codExec, 3).setVisible(true);
            FichaBD.PreencherTabela(TableFicha, true);
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para excluir.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
       
        new FrameCadFicha(true, 0, 0, 2).setVisible(true);
        FichaBD.PreencherTabela(TableFicha, true);
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPDFActionPerformed
        if (TableFicha.getSelectedRowCount() != 0 ){
            int linha = TableFicha.getSelectedRow();
            String CPF = (String) TableFicha.getModel().getValueAt(linha, 2);
            try {
                PDF.PDF(CPF);
            } catch (Exception ex) {
                Logger.getLogger(FrameFicha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "selecione um registro na tabela para exportar.");
        }
    }//GEN-LAST:event_jbPDFActionPerformed

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
            java.util.logging.Logger.getLogger(FrameFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFicha().setVisible(true);
            }
        });
        FichaBD.PreencherTabela(TableFicha, true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TableFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtu;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbPDF;
    // End of variables declaration//GEN-END:variables
}
