
package view;

import javax.swing.table.DefaultTableModel;
import model.bean.Exercicios;
import model.dao.ExerciciosDAO;

public class FrameExercicios extends javax.swing.JFrame {

    public FrameExercicios() {
        initComponents();
        readJTable();    
    }
    
    public void readJTable (){
        
        DefaultTableModel model = (DefaultTableModel) TableExercicios.getModel();
        
        model.setNumRows(0);
        
        ExerciciosDAO edao = new ExerciciosDAO();
        
        for(Exercicios e:edao.read()){
            
            model.addRow(new Object[]{
                    
                    e.getIdExercicios(),
                    e.getdescExercicio(),
                    e.getIdGruposMusculares()         
            });
        }
        
    }
    
    public void readPesquisa (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableExercicios.getModel();
        
        model.setNumRows(0);
        
        ExerciciosDAO edao = new ExerciciosDAO();
        
        for(Exercicios e:edao.readPesquisaExercicio(pesquisa)){
            
            model.addRow(new Object[]{
                    
                    e.getIdExercicios(),
                    e.getdescExercicio(),
                    e.getIdGruposMusculares()           
            });
        }   
    }
    
    public void readPesquisadescGrupo (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableExercicios.getModel();
        
        model.setNumRows(0);
        
        ExerciciosDAO edao = new ExerciciosDAO();
        
        for(Exercicios e:edao.readPesquisaDesc(pesquisa)){
            
            model.addRow(new Object[]{
                    
                    e.getIdExercicios(),
                    e.getdescExercicio(),
                    e.getIdGruposMusculares()
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbIncluir = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableExercicios = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercicios");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/alt.png")).getImage());
        setMaximumSize(new java.awt.Dimension(469, 250));
        setMinimumSize(new java.awt.Dimension(469, 250));
        setPreferredSize(new java.awt.Dimension(469, 250));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(469, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(469, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(469, 250));
        jPanel1.setLayout(null);

        jbIncluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jbIncluir.setBounds(10, 50, 100, 30);

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jbExcluir.setBounds(10, 130, 100, 30);

        jbAtu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jbAtu.setBounds(10, 90, 100, 30);
        jbAtu.getAccessibleContext().setAccessibleName("Atualizar ");
        jbAtu.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Opções");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 84, 32);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(350, 280));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(350, 280));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 280));

        TableExercicios.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TableExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercício", "Grp. Muscular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableExercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableExerciciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableExercicios);
        if (TableExercicios.getColumnModel().getColumnCount() > 0) {
            TableExercicios.getColumnModel().getColumn(0).setMinWidth(40);
            TableExercicios.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableExercicios.getColumnModel().getColumn(0).setMaxWidth(40);
            TableExercicios.getColumnModel().getColumn(2).setMinWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 10, 340, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(469, 250));
        jLabel5.setMinimumSize(new java.awt.Dimension(469, 250));
        jLabel5.setPreferredSize(new java.awt.Dimension(469, 250));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 469, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Exercicios");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtuActionPerformed
        
        FrameUpdateExercicios ue = new FrameUpdateExercicios();
        ue.setVisible(true);
    }//GEN-LAST:event_jbAtuActionPerformed

    private void TableExerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableExerciciosMouseClicked
        
        int linha = TableExercicios.getSelectedRow();
        /*
        txtID.setText(TableExercicios.getValueAt(linha,0).toString());
        txtExercicio.setText(TableExercicios.getValueAt(linha,1).toString());
        txtDecGrupoMuscular.setText(TableExercicios.getValueAt(linha,2).toString());
        txtDecGrupoMuscular.setEnabled(false);
        */
    }//GEN-LAST:event_TableExerciciosMouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        Exercicios e = new Exercicios();
        ExerciciosDAO edao = new ExerciciosDAO();
        
        e.setIdExercicios((String) TableExercicios.getValueAt(TableExercicios.getSelectedRow(), 0));
        
        edao.Delete(e);
        
        readJTable();
        /*
        txtID.setText("");
        txtExercicio.setText("");
        txtDecGrupoMuscular.setText("");
        */
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
        
        FrameCadastroExercicios ce = new FrameCadastroExercicios();
        ce.setVisible(true);
    }//GEN-LAST:event_jbIncluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrameExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameExercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableExercicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtu;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    // End of variables declaration//GEN-END:variables
}
