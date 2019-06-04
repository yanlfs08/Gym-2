
package view;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import model.bean.Avaliacao;
import model.dao.Old_AvaliaçãoDAO;

/**
 *
 * @author yanlf
 */
public class Old_FrameAvaliação extends javax.swing.JFrame {
    
    public Old_FrameAvaliação() {
        initComponents();
        readJTable();
    }
    
    public void readJTable (){
        
        DefaultTableModel model = (DefaultTableModel) TableAvaliacao.getModel();
        
        model.setNumRows(0);
        
        Old_AvaliaçãoDAO adao = new Old_AvaliaçãoDAO();
        
        for(Avaliacao a:adao.read()){
            
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
        
        Old_AvaliaçãoDAO adao = new Old_AvaliaçãoDAO();
        
        for(Avaliacao a:adao.readPesquisa(pesquisa)){
            
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

        jPanel2 = new javax.swing.JPanel();
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
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliação Fisica");

        jPanel2.setLayout(null);

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtCliente);
        txtCliente.setBounds(199, 82, 253, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Avaliações");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(179, 11, 121, 32);

        TableAvaliacao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TableAvaliacao.setForeground(new java.awt.Color(51, 102, 255));
        TableAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Peso", "Altura", "GC", "IMC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
            TableAvaliacao.getColumnModel().getColumn(1).setMinWidth(170);
            TableAvaliacao.getColumnModel().getColumn(1).setPreferredWidth(170);
            TableAvaliacao.getColumnModel().getColumn(1).setMaxWidth(170);
            TableAvaliacao.getColumnModel().getColumn(2).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableAvaliacao.getColumnModel().getColumn(3).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableAvaliacao.getColumnModel().getColumn(4).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(4).setPreferredWidth(20);
            TableAvaliacao.getColumnModel().getColumn(5).setResizable(false);
            TableAvaliacao.getColumnModel().getColumn(5).setPreferredWidth(16);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(32, 252, 430, 185);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(143, 89, 46, 20);

        txtIMC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIMCActionPerformed(evt);
            }
        });
        jPanel2.add(txtIMC);
        txtIMC.setBounds(307, 132, 51, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(42, 89, 14, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Peso");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(32, 137, 32, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Altura");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(149, 137, 41, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("IMC");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(263, 137, 26, 20);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(74, 84, 51, 30);

        txtAltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        jPanel2.add(txtAltura);
        txtAltura.setBounds(200, 132, 51, 30);

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPeso);
        txtPeso.setBounds(74, 132, 51, 30);

        txtGorduraCorporal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGorduraCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGorduraCorporalActionPerformed(evt);
            }
        });
        jPanel2.add(txtGorduraCorporal);
        txtGorduraCorporal.setBounds(401, 132, 51, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("%");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(379, 137, 12, 20);

        jbCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setToolTipText("Atualizar os dados da tabela");
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbCadastrar);
        jbCadastrar.setBounds(32, 201, 83, 33);

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
        jPanel2.add(jbAtu);
        jbAtu.setBounds(143, 201, 83, 33);

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
        jPanel2.add(jbExcluir);
        jbExcluir.setBounds(263, 201, 81, 33);

        jbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setToolTipText("Pesquisar por exercicio ou grupo muscular");
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(jbPesquisar);
        jbPesquisar.setBounds(379, 201, 83, 33);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        jLabel8.setEnabled(false);
        jLabel8.setMaximumSize(new java.awt.Dimension(499, 465));
        jLabel8.setMinimumSize(new java.awt.Dimension(499, 465));
        jLabel8.setPreferredSize(new java.awt.Dimension(499, 465));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 499, 465);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        Old_FrameCadastroAvl frm = new Old_FrameCadastroAvl();
        frm.setVisible(true);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtuActionPerformed

        FrameUpdateExercicios ue = new FrameUpdateExercicios();
        ue.setVisible(true);
    }//GEN-LAST:event_jbAtuActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        Avaliacao a = new Avaliacao();
        Old_AvaliaçãoDAO adao = new Old_AvaliaçãoDAO();

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
            java.util.logging.Logger.getLogger(Old_FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Old_FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Old_FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Old_FrameAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Old_FrameAvaliação().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
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
