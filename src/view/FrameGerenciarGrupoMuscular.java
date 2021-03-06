
package view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.bean.GrupoMuscular;
import model.dao.GrupoMuscularDAO;

public class FrameGerenciarGrupoMuscular extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    GrupoMuscular GrupoMusc = new GrupoMuscular();
    public FrameGerenciarGrupoMuscular(boolean modal,int codGrupoMusc,int Op) {
        initComponents();
        this.setModal(modal);
        setTpOp(Op);
        if(Op != 2){
            PreencherFormulario(codGrupoMusc);
        //}else{
        //    PreencherCodigo();
        }
        MostrarOp(Op);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbCancelar = new javax.swing.JToggleButton();
        jtbConfirmar = new javax.swing.JToggleButton();
        JLTituloGereciamentoPes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoGrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(520, 400));
        setPreferredSize(new java.awt.Dimension(469, 300));
        setResizable(false);

        jtbCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbCancelar.setText("Cancelar");
        jtbCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        jtbCancelar.setMinimumSize(new java.awt.Dimension(100, 30));
        jtbCancelar.setName("JTBCancelar"); // NOI18N
        jtbCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        jtbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCancelarActionPerformed(evt);
            }
        });

        jtbConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbConfirmar.setText("Confirmar");
        jtbConfirmar.setMaximumSize(new java.awt.Dimension(100, 30));
        jtbConfirmar.setMinimumSize(new java.awt.Dimension(100, 30));
        jtbConfirmar.setName("JTBConfirmar"); // NOI18N
        jtbConfirmar.setPreferredSize(new java.awt.Dimension(100, 30));
        jtbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbConfirmarActionPerformed(evt);
            }
        });

        JLTituloGereciamentoPes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLTituloGereciamentoPes.setText("Gerenciamento de Grupo Muscular");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        jtfCodigoGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtfCodigoGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoGrupoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        jtfDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigoGrupo))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );

        jtfCodigoGrupo.getAccessibleContext().setAccessibleName("");
        jtfDescricao.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void setTpOp(int Op){
	this.TpOp = Op;
    }
    private int getTpOp(){
        return TpOp;
    } 
    private void MostrarOp(int Op){  
        switch(Op){
            case 1:
                JLTituloGereciamentoPes.setText("Alterar Grupo Muscular");
                 break;
            case 2:
                JLTituloGereciamentoPes.setText("Incluir Grupo Muscular");
                break;
            case 3:
                JLTituloGereciamentoPes.setText("Excluir Grupo Muscular");
                break;
            default:
                JLTituloGereciamentoPes.setText("Gerenciar Grupo Muscular");
        }       
    }
    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed
        
        int CodTpPgto = Integer.parseInt(jtfCodigoGrupo.getText());
        String Desc = "";
        int OP = getTpOp();
        
        //Atualizar-Inserir 
        if (( OP == 1 ) || (OP == 2)){
            if(jtfDescricao.getText().equalsIgnoreCase(GrupoMusc.getId()) == false){
                Desc = jtfDescricao.getText(); 
            }
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarTpPgto(CodTpPgto,Desc);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o Grupo Muscular. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirTpPgto(CodTpPgto,Desc);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o Grupo Muscular. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarTpPgto(CodTpPgto);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o Grupo Muscular. \nContate o administrador.");
                }
                break;
            case 0: 
                break;
            default:
                JOptionPane.showMessageDialog(null, "teste");
                break;
        }
        dispose();
    }//GEN-LAST:event_jtbConfirmarActionPerformed
    private void jtbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_jtbCancelarActionPerformed

    private void jtfCodigoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoGrupoActionPerformed
    private static boolean IncluirTpPgto(int CodTpPgto,String Desc){        
        GrupoMuscularDAO Tabela = new GrupoMuscularDAO();     
        return Tabela.Insert(CodTpPgto, Desc);
    }
    private static int AtualizarTpPgto(int CodTpPgto,String Desc){        
        GrupoMuscularDAO Tabela = new GrupoMuscularDAO();     
        return Tabela.Update(CodTpPgto,Desc);
    }
    private static int DeletarTpPgto(int CodProd){        
        GrupoMuscularDAO Tabela = new GrupoMuscularDAO();     
        return Tabela.Delete(CodProd);
    }
    private static ResultSet BuscarTpPgto(int CodTPPgto){        
        GrupoMuscularDAO Tabela = new GrupoMuscularDAO();     
        return Tabela.Select(CodTPPgto);
    }
    private void PreencherFormulario(int CodTPPgto){    
        GrupoMuscularDAO GropuMuscDB = new GrupoMuscularDAO();     
        //ResultSet rsDadosForm = null; 
        
        GrupoMusc = GropuMuscDB.CarregaDadosFormulario(CodTPPgto);
        if (GrupoMusc != null ){
            jtfCodigoGrupo.setText(GrupoMusc.getId());
            jtfDescricao.setText(GrupoMusc.getDesc());
        }
    }
    /*private void PreencherCodigo(){
        GrupoMuscularDAO Tabela = new GrupoMuscularDAO();     
        jtfCodigoGrupo.setText(Tabela.GerarCodigo("TipoPagamento")); 
        jtfCodigoGrupo.isDisplayable();
    }*/
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
            java.util.logging.Logger.getLogger(FrameGerenciarGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciarGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciarGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciarGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGerenciarGrupoMuscular(true,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloGereciamentoPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfCodigoGrupo;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables
}
