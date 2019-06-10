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
        
        for (GrupoMuscular g: gdao.read()){
            
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableExercicios = new javax.swing.JTable();
        txtExercicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAtualizarExercicio = new javax.swing.JButton();
        labelGeradorID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercicios");
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(427, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(427, 350));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(427, 350));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

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
            TableExercicios.getColumnModel().getColumn(0).setMinWidth(30);
            TableExercicios.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableExercicios.getColumnModel().getColumn(0).setMaxWidth(30);
            TableExercicios.getColumnModel().getColumn(2).setMinWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableExercicios.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(28, 100, 368, 217);

        txtExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExercicioActionPerformed(evt);
            }
        });
        jPanel1.add(txtExercicio);
        txtExercicio.setBounds(98, 51, 209, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Atualizar Exercicios");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(98, 11, 223, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Exercicio");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(28, 54, 60, 20);

        jbAtualizarExercicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtualizarExercicio.setText("Atualizar");
        jbAtualizarExercicio.setToolTipText("Cadastrar Exercicio");
        jbAtualizarExercicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtualizarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarExercicioActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtualizarExercicio);
        jbAtualizarExercicio.setBounds(317, 49, 79, 33);
        jbAtualizarExercicio.getAccessibleContext().setAccessibleName("Atualizar ");
        jbAtualizarExercicio.getAccessibleContext().setAccessibleDescription("");

        labelGeradorID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelGeradorID);
        labelGeradorID.setBounds(356, 341, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(427, 350));
        jLabel5.setMinimumSize(new java.awt.Dimension(427, 350));
        jLabel5.setPreferredSize(new java.awt.Dimension(427, 350));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizarExercicio;
    private javax.swing.JLabel labelGeradorID;
    private javax.swing.JTextField txtExercicio;
    // End of variables declaration//GEN-END:variables
}
