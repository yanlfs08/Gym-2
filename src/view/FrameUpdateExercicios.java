/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.bean.Exercicios;
import model.dao.ExerciciosDAO;



/**
 *
 * @author yanlf
 */
public class FrameUpdateExercicios extends javax.swing.JFrame {

    /**
     * Creates new form FrameExercicios
     */
    public FrameUpdateExercicios() {
        initComponents();
        readJTable();
        
    }
    
    /*
    public void ViewComboBox (){
        
        GruposMuscularesDAO gdao = new GruposMuscularesDAO();
        
        for (GruposMusculares g: gdao.read()){
            
            ComboGrupoMuscular.addItem(g);
        }
    }  
    */
    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TableExercicios = new javax.swing.JTable();
        txtExercicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAtualizarExercicio = new javax.swing.JButton();
        labelGeradorID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercicios");
        setResizable(false);

        TableExercicios.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TableExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exercicio", "Grp. Muscular"
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
            TableExercicios.getColumnModel().getColumn(0).setMinWidth(30);
            TableExercicios.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableExercicios.getColumnModel().getColumn(0).setMaxWidth(30);
            TableExercicios.getColumnModel().getColumn(2).setMinWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        txtExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExercicioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Atualizar Exercicios");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Exercicio");

        jbAtualizarExercicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtualizarExercicio.setText("Atualizar");
        jbAtualizarExercicio.setToolTipText("Cadastrar Exercicio");
        jbAtualizarExercicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtualizarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarExercicioActionPerformed(evt);
            }
        });

        labelGeradorID.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelGeradorID)
                                        .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(txtExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jbAtualizarExercicio)))
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGeradorID))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jbAtualizarExercicio.getAccessibleContext().setAccessibleName("Atualizar ");
        jbAtualizarExercicio.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("Exercicios");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtualizarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarExercicioActionPerformed
        
        Exercicios e = new Exercicios();
        ExerciciosDAO edao = new ExerciciosDAO();
        
        
        e.setIdExercicios(labelGeradorID.getText());
        e.setdescExercicio(txtExercicio.getText());

        
        edao.Update(e);
     
        
        readJTable();
        txtExercicio.setText("");
    }//GEN-LAST:event_jbAtualizarExercicioActionPerformed

    private void txtExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExercicioActionPerformed

    private void TableExerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableExerciciosMouseClicked
         
        int linha = TableExercicios.getSelectedRow();
        
        labelGeradorID.setText(TableExercicios.getValueAt(linha,0).toString());
        txtExercicio.setText(TableExercicios.getValueAt(linha,1).toString());  
        
    }//GEN-LAST:event_TableExerciciosMouseClicked

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
            java.util.logging.Logger.getLogger(FrameUpdateExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUpdateExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUpdateExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUpdateExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUpdateExercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableExercicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizarExercicio;
    private javax.swing.JLabel labelGeradorID;
    private javax.swing.JTextField txtExercicio;
    // End of variables declaration//GEN-END:variables
}
