
package view;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import model.bean.Avaliação;
import model.dao.AvaliaçãoDAO;

/**
 *
 * @author yanlf
 */
public class FrameAvaliação extends javax.swing.JFrame {
    
    public FrameAvaliação() {
        initComponents();
        readJTable();
    }
    
    public void readJTable (){
        
        DefaultTableModel model = (DefaultTableModel) TableAvaliacao.getModel();
        
        model.setNumRows(0);
        
        AvaliaçãoDAO adao = new AvaliaçãoDAO();
        
        for(Avaliação a:adao.read()){
            
            model.addRow(new Object[]{
                    
                    a.getIdAvaliacao(),
                    a.getCpf(),
                    a.getPeso(),
                    a.getAltura(),
                    a.getGorduraCorporal()   
                    
            });
        }   
    }
    
    public void readPesquisa (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableAvaliacao.getModel();
        
        model.setNumRows(0);
        
        AvaliaçãoDAO adao = new AvaliaçãoDAO();
        
        for(Avaliação a:adao.readPesquisa(pesquisa)){
            
            model.addRow(new Object[]{
                    
                    a.getIdAvaliacao(),
                    a.getCpf(),
                    a.getPeso(),
                    a.getAltura(),
                    a.getGorduraCorporal() 
                    
                    
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAvaliacao = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtGorduraCorporal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbAtu = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliação Fisica");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Avaliações");

        TableAvaliacao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TableAvaliacao.setForeground(new java.awt.Color(51, 102, 255));
        TableAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Peso", "Altura", "GC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableAvaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAvaliacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableAvaliacao);
        if (TableAvaliacao.getColumnModel().getColumnCount() > 0) {
            TableAvaliacao.getColumnModel().getColumn(0).setMinWidth(35);
            TableAvaliacao.getColumnModel().getColumn(0).setPreferredWidth(35);
            TableAvaliacao.getColumnModel().getColumn(0).setMaxWidth(35);
            TableAvaliacao.getColumnModel().getColumn(1).setMinWidth(150);
            TableAvaliacao.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableAvaliacao.getColumnModel().getColumn(1).setMaxWidth(150);
            TableAvaliacao.getColumnModel().getColumn(2).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(2).setPreferredWidth(40);
            TableAvaliacao.getColumnModel().getColumn(3).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableAvaliacao.getColumnModel().getColumn(4).setMinWidth(40);
            TableAvaliacao.getColumnModel().getColumn(4).setPreferredWidth(40);
            TableAvaliacao.getColumnModel().getColumn(4).setMaxWidth(40);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        txtIMC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIMCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Peso");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Altura");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("IMC");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtAltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtGorduraCorporal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGorduraCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGorduraCorporalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("%");

        jbCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setToolTipText("Atualizar os dados da tabela");
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbAtu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtu.setText("Alterar");
        jbAtu.setToolTipText("Atualizar os dados da tabela");
        jbAtu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtu.setMaximumSize(new java.awt.Dimension(83, 25));
        jbAtu.setMinimumSize(new java.awt.Dimension(83, 25));
        jbAtu.setPreferredSize(new java.awt.Dimension(83, 25));
        jbAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtuActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Atualizar os dados da tabela");
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.setMaximumSize(new java.awt.Dimension(83, 25));
        jbExcluir.setMinimumSize(new java.awt.Dimension(83, 25));
        jbExcluir.setPreferredSize(new java.awt.Dimension(83, 25));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setToolTipText("Pesquisar por exercicio ou grupo muscular");
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(21, 21, 21)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtGorduraCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jbPesquisar)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbCadastrar)
                                    .addGap(28, 28, 28)
                                    .addComponent(jbAtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGorduraCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIMCActionPerformed
       
    }//GEN-LAST:event_txtIMCActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void TableAvaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAvaliacaoMouseClicked
        
        int linha = TableAvaliacao.getSelectedRow();
        
        txtID.setText(TableAvaliacao.getValueAt(linha,0).toString());
        txtCliente.setText(TableAvaliacao.getValueAt(linha,1).toString());
        txtPeso.setText(TableAvaliacao.getValueAt(linha,2).toString());
        txtAltura.setText(TableAvaliacao.getValueAt(linha,3).toString());
        txtGorduraCorporal.setText(TableAvaliacao.getValueAt(linha,4).toString());
        txtID.setEnabled(false);
        
        double p,a,result;
        p=Double.parseDouble(txtPeso.getText());
        a=Double.parseDouble(txtAltura.getText());
        
        result = p/(a*a);
        DecimalFormat df = new DecimalFormat("#.00");
        txtIMC.setText(df.format(result).toString());
    }//GEN-LAST:event_TableAvaliacaoMouseClicked

    private void txtGorduraCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGorduraCorporalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGorduraCorporalActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed

        FrameCadastroAvl frm = new FrameCadastroAvl();
        frm.setVisible(true);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtuActionPerformed

        FrameUpdateExercicios ue = new FrameUpdateExercicios();
        ue.setVisible(true);
    }//GEN-LAST:event_jbAtuActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        Avaliação a = new Avaliação();
        AvaliaçãoDAO adao = new AvaliaçãoDAO();

        a.setIdAvaliacao((String) TableAvaliacao.getValueAt(TableAvaliacao.getSelectedRow(), 0));

        adao.Delete(a);

        readJTable();
        txtID.setText("");
        txtCliente.setText("");
        txtAltura.setText("");
        txtGorduraCorporal.setText("");
        txtPeso.setText("");
        txtIMC.setText("");
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       
        if("".equals(txtCliente.getText())){
            
            readPesquisa(txtCliente.getText());

        }else{
            
            readPesquisa(txtCliente.getText());
            
        }
        
        
    }//GEN-LAST:event_jbPesquisarActionPerformed
        
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
            java.util.logging.Logger.getLogger(FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAvaliação().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAvaliacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtu;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtGorduraCorporal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
