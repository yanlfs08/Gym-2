
package view;



import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Avaliacao;
import model.bean.Cadastro;
import model.dao.AvaliacaoDAO;
import model.dao.PessoaDAO;

public class FrameCadAvaliacao extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;   
    Avaliacao AvalForm = new Avaliacao();
    Cadastro UsuForm = new Cadastro();
    public FrameCadAvaliacao(boolean modal,int codAval,int Op) {
        initComponents();
        this.setModal(modal);
        CarregarCombos();
        setTpOp(Op);
        if(Op!=2){
            PreencherFormulario(codAval);
        //}else{
        //    PreencherCodigo();
        }
        MostrarOp(Op);        
    }

    FrameCadAvaliacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbCancelar = new javax.swing.JToggleButton();
        jtbConfirmar = new javax.swing.JToggleButton();
        JLTituloGereciamentoProd = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbUsuario = new javax.swing.JComboBox<>();
        jtfCodigoAval = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfAltura = new javax.swing.JTextField();
        jtfIMC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfGordCorp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setResizable(false);

        jtbCancelar.setText("Cancelar");
        jtbCancelar.setName("JTBCancelar"); // NOI18N
        jtbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCancelarActionPerformed(evt);
            }
        });

        jtbConfirmar.setText("Confirmar");
        jtbConfirmar.setName("JTBConfirmar"); // NOI18N
        jtbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbConfirmarActionPerformed(evt);
            }
        });

        JLTituloGereciamentoProd.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        JLTituloGereciamentoProd.setText("Cadastro de Avaliações");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jcbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUsuarioActionPerformed(evt);
            }
        });

        jtfCodigoAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoAvalActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente:");

        jLabel4.setText("Peso:");

        jLabel5.setText("Altura:");

        jLabel7.setText("IMC:");

        jLabel8.setText("Gordura:");

        jLabel9.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCodigoAval, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfGordCorp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(jcbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigoAval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfGordCorp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(108, 108, 108))
        );

        jtfCodigoAval.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLTituloGereciamentoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTituloGereciamentoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbCancelar)
                    .addComponent(jtbConfirmar))
                .addContainerGap())
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
                JLTituloGereciamentoProd.setText("Alterar Avaliação");
                break;
            case 2:
                JLTituloGereciamentoProd.setText("Incluir Avaliação");
                break;
            case 3:
                JLTituloGereciamentoProd.setText("Excluir Avaliação");
                break;
            default:
                JLTituloGereciamentoProd.setText("Gerenciar Avaliação");
        }       
    }
    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed
        
        int CodAval = Integer.parseInt(jtfCodigoAval.getText());
        int CodUsuario = 0;
        double Peso = 0;
        double Altura = 0;
        double GordCorp = 0;
        int OP = getTpOp();
        
        //Atualizar-Inserir 
        if (( OP == 1 ) || (OP == 2)){
            if (jcbUsuario.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(AvalForm.getIdAvaliacao()) == false){
                CodAval = Integer.parseInt(jcbUsuario.getModel().getSelectedItem().toString().substring(0, 1));
            } 
            if (jtfPeso.getText().equalsIgnoreCase(String.valueOf(AvalForm.getPeso())) == false){
                Peso = Double.parseDouble(jtfPeso.getText());
            }
            if (jtfAltura.getText().equalsIgnoreCase(String.valueOf(AvalForm.getAltura())) == false){
                Altura = Double.parseDouble(jtfAltura.getText());
            }
            if (jtfGordCorp.getText().equalsIgnoreCase(String.valueOf(AvalForm.getGorduraCorporal())) == false){
                GordCorp = Double.parseDouble(jtfGordCorp.getText());
            }
            if (jcbUsuario.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(UsuForm.getCPF()) == false){
                CodUsuario = Integer.parseInt(jcbUsuario.getModel().getSelectedItem().toString().substring(0, 1));
            } 
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarProdutos(CodAval, Peso, Altura, GordCorp);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar avaliação. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirProdutos(CodAval, Peso, Altura, GordCorp, CodUsuario);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir avaliação. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarProdutos(CodAval);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir avaliação. \nContate o administrador.");
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

    private void jcbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUsuarioActionPerformed

    private void jtfCodigoAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoAvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoAvalActionPerformed
    private void CarregarCombos() {
        ResultSet Sql  = null;
        int TotalRegs = 0; 
        jcbUsuario.removeAllItems();
        try{
            Sql = BuscarUsuario(0,2);
            Sql.last();
            TotalRegs = Sql.getRow();        
            Sql.first();
            for(int i = 0; i < TotalRegs; i++){
                String Cod = Sql.getString(1);
                String Desc = Sql.getString(2);
                jcbUsuario.addItem(Cod +" - "+ Desc);
                Sql.next();
            }            
        }catch (SQLException ex) {
            System.out.println(ex);   
        }
    }
    //CodAval, Peso, Altura, GordCorp, CodUsuario
    private static boolean IncluirProdutos(int CodAval,Double Peso,Double Altura,
        Double GordCorp,int CodUsuario){        
        AvaliacaoDAO Tabela = new AvaliacaoDAO();     
        return Tabela.Insert(CodAval, Peso, Altura, GordCorp, CodUsuario);
    }
    private static int AtualizarProdutos(int CodAval,Double Peso,Double Altura,
        Double GordCorp){        
        AvaliacaoDAO Tabela = new AvaliacaoDAO();     
        return Tabela.Update(CodAval, Peso, Altura, GordCorp);
    }
    private static int DeletarProdutos(int CodProd){        
        AvaliacaoDAO Tabela = new AvaliacaoDAO();     
        return Tabela.Delete(CodProd);
    }
    private static ResultSet BuscarUsuario(int CPF,int CodTpUsu){        
        PessoaDAO UsuTb = new PessoaDAO();     
        return UsuTb.Select(CPF,CodTpUsu);
    }
    private void PreencherFormulario(int CodProd){    
        AvaliacaoDAO AvalDB = new AvaliacaoDAO();     
        //ResultSet rsDadosForm = null; 
        
        AvalForm = AvalDB.CarregaDadosFormulario(CodProd);
        if (AvalForm != null ){
            jtfCodigoAval.setText(AvalForm.getIdAvaliacao());
            jtfPeso.setText(String.valueOf(AvalForm.getPeso()));                
            jtfAltura.setText(String.valueOf(AvalForm.getAltura()));
            jtfGordCorp.setText(String.valueOf(AvalForm.getGorduraCorporal()));            
            jcbUsuario.setSelectedIndex(IndexValorCombo(UsuForm.getCPF(),1));
        }
    }
    /*
    private void PreencherCodigo(){
        ComandDB Tabela = new ComandDB();     
        jtfCodigoAval.setText(Tabela.GerarCodigo("Produto")); 
        jtfCodigoAval.isDisplayable();
    }
    */
    private int IndexValorCombo(String Valor,int combo ){
        int totVal = 0;
        int indexVal = 0;
        switch (combo){            
            case 1:
                totVal = jcbUsuario.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbUsuario.setSelectedIndex(i);
                    if(jcbUsuario.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(Valor)==true){
                       indexVal = i; 
                    }
                }
                break;
            default:
                indexVal = 0;                
        }
        return indexVal;
    }
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
            java.util.logging.Logger.getLogger(FrameCadAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadAvaliacao(true,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloGereciamentoProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbUsuario;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfCodigoAval;
    private javax.swing.JTextField jtfGordCorp;
    private javax.swing.JTextField jtfIMC;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
