
package view;

import javax.swing.table.DefaultTableModel;
import model.bean.Exercicios;
import model.dao.ExerciciosDAO;
import model.bean.Ficha;
import model.dao.FichaDAO;
import model.bean.Cadastro;
import model.dao.CadastroDAO;

import model.dao.GrupoMuscularDAO;


public class FrameFicha extends javax.swing.JFrame {

    public FrameFicha() {
        initComponents();
        readJTable();    
    }
    
    public void readJTable (){
        
        DefaultTableModel model = (DefaultTableModel) TableFicha.getModel();
        
        model.setNumRows(0);
        
        FichaDAO fdao = new FichaDAO();
        ExerciciosDAO edao = new ExerciciosDAO();
        CadastroDAO cdao = new CadastroDAO();
        GrupoMuscularDAO gmdao = new GrupoMuscularDAO();
        
        for(Ficha f:fdao.read()){
            for(Exercicios e:edao.read()){
                for(Cadastro c:cdao.read()){
            
                    model.addRow(new Object[]{

                        c.getNome(),
                        e.getdescExercicio(),
                        f.getCarga(),
                        f.getRepeticao(),
                        f.getSerie()
                    });
                    
                }
            }
        }
    }
    
    public void readPesquisa (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableFicha.getModel();
        
        model.setNumRows(0);
        
        FichaDAO fdao = new FichaDAO();
        ExerciciosDAO edao = new ExerciciosDAO();
        
        for(Ficha f:fdao.readPesquisaFicha(pesquisa)){
            for(Exercicios e:edao.readPesquisaExercicio(pesquisa))
            
            model.addRow(new Object[]{
                    
                    f.getIdExercicios(),
                    f.getIdFicha(),
                    e.getdescExercicio(),
                    f.getCarga(),
                    f.getRepeticao(),
                    f.getSerie()
            });
        }   
    }
    
    public void readPesquisadescGrupo (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableFicha.getModel();
        
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
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtualizarTabela = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        txtDecGrupoMuscular = new javax.swing.JTextField();
        jbAtu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtExercicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFicha = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exercicios");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icones/alt.png")).getImage());
        setResizable(false);

        jPanel1.setLayout(null);

        jbCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setToolTipText("Atualizar os dados da tabela");
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCadastrar);
        jbCadastrar.setBounds(60, 210, 83, 33);

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Atualizar os dados da tabela");
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbExcluir.setMaximumSize(new java.awt.Dimension(83, 25));
        jbExcluir.setMinimumSize(new java.awt.Dimension(83, 25));
        jbExcluir.setPreferredSize(new java.awt.Dimension(83, 25));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluir);
        jbExcluir.setBounds(60, 330, 81, 33);

        jbAtualizarTabela.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtualizarTabela.setText("Atualizar");
        jbAtualizarTabela.setToolTipText("Atualizar os dados da tabela");
        jbAtualizarTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarTabelaActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtualizarTabela);
        jbAtualizarTabela.setBounds(60, 390, 79, 33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Grupo Muscular");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 110, 106, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Exercício");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 70, 60, 20);

        jbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setToolTipText("Pesquisar por exercicio ou grupo muscular");
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jbPesquisar);
        jbPesquisar.setBounds(570, 150, 83, 33);

        txtDecGrupoMuscular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDecGrupoMuscularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDecGrupoMuscularMouseEntered(evt);
            }
        });
        txtDecGrupoMuscular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecGrupoMuscularActionPerformed(evt);
            }
        });
        jPanel1.add(txtDecGrupoMuscular);
        txtDecGrupoMuscular.setBounds(370, 110, 285, 30);

        jbAtu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbAtu.setText("Alterar");
        jbAtu.setToolTipText("Atualizar os dados da tabela");
        jbAtu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAtu.setMaximumSize(new java.awt.Dimension(83, 25));
        jbAtu.setMinimumSize(new java.awt.Dimension(83, 25));
        jbAtu.setPreferredSize(new java.awt.Dimension(83, 25));
        jbAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtuActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtu);
        jbAtu.setBounds(60, 270, 83, 33);
        jbAtu.getAccessibleContext().setAccessibleName("Atualizar ");
        jbAtu.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 70, 14, 20);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ficha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 10, 58, 32);

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID);
        txtID.setBounds(240, 70, 43, 30);

        txtExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExercicioMouseClicked(evt);
            }
        });
        jPanel1.add(txtExercicio);
        txtExercicio.setBounds(370, 70, 285, 30);

        TableFicha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableFicha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carga", "Repetição", "Serie", "Título 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 210, 470, 217);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Banner.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 670, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Exercicios");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtuActionPerformed
        
        FrameUpdateExercicios ue = new FrameUpdateExercicios();
        ue.setVisible(true);
    }//GEN-LAST:event_jbAtuActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       
        if("".equals(txtExercicio.getText())){
        
            readPesquisadescGrupo(txtDecGrupoMuscular.getText());
            
        }else{
            readPesquisa(txtExercicio.getText());
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void TableFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFichaMouseClicked
        
        int linha = TableFicha.getSelectedRow();
        
        txtID.setText(TableFicha.getValueAt(linha,0).toString());
        txtExercicio.setText(TableFicha.getValueAt(linha,1).toString());
        txtDecGrupoMuscular.setText(TableFicha.getValueAt(linha,2).toString());
        txtDecGrupoMuscular.setEnabled(false);
    }//GEN-LAST:event_TableFichaMouseClicked

    private void jbAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarTabelaActionPerformed
        readJTable();
        txtID.setText("");
        txtExercicio.setText("");
        txtDecGrupoMuscular.setText("");
    }//GEN-LAST:event_jbAtualizarTabelaActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        Exercicios e = new Exercicios();
        ExerciciosDAO edao = new ExerciciosDAO();
        
        e.setIdExercicios((String) TableFicha.getValueAt(TableFicha.getSelectedRow(), 0));
        
        edao.Delete(e);
        
        readJTable();
        txtID.setText("");
        txtExercicio.setText("");
        txtDecGrupoMuscular.setText("");
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        
        FrameCadastroExercicios ce = new FrameCadastroExercicios();
        ce.setVisible(true);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDecGrupoMuscularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecGrupoMuscularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecGrupoMuscularActionPerformed

    private void txtDecGrupoMuscularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDecGrupoMuscularMouseEntered
        txtDecGrupoMuscular.setEnabled(true);
    }//GEN-LAST:event_txtDecGrupoMuscularMouseEntered

    private void txtExercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExercicioMouseClicked
        txtDecGrupoMuscular.setText("");
    }//GEN-LAST:event_txtExercicioMouseClicked

    private void txtDecGrupoMuscularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDecGrupoMuscularMouseClicked
        txtExercicio.setText("");
    }//GEN-LAST:event_txtDecGrupoMuscularMouseClicked

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtu;
    private javax.swing.JButton jbAtualizarTabela;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTextField txtDecGrupoMuscular;
    private javax.swing.JTextField txtExercicio;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}