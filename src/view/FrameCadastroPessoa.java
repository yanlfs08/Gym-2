
package view;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.dao.PessoaDao;
import model.dao.TipoUsuarioDao;
import model.bean.Pessoa;
import model.dao.CadastroDAO;

public class FrameCadastroPessoa extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    Pessoa PesForm = new Pessoa();
    public FrameCadastroPessoa(boolean modal,int codProd,int Op) {
        initComponents();
        this.setModal(modal);
        CarregarCombos();
        setTpOp(Op);
        if(codProd!=0){
            PreencherFormulario(codProd);
        }
        MostrarOp(Op);        
    }

    FrameCadastroPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbCancelar = new javax.swing.JToggleButton();
        jtbConfirmar = new javax.swing.JToggleButton();
        JLTituloGereciamentoPes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jcbTipoPessoa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jtfCheckSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDTNasc = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(520, 400));
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

        JLTituloGereciamentoPes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        JLTituloGereciamentoPes.setText("Gerenciamento de pessoas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Telefone");

        jLabel9.setText("E-mail:");

        jtfCPF.setText("   .   .   -  ");
        jtfCPF.setToolTipText("");

        jLabel12.setText("CPF:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Cofrimação de senha:");

        jLabel17.setText("Senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(97, 97, 97)
                        .addComponent(jtfSenha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addComponent(jtfCheckSenha)))
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtfCheckSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Data Nascimento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDTNasc))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbTipoPessoa, 0, 116, Short.MAX_VALUE))
                            .addComponent(jtfNome)
                            .addComponent(jtfEmail))
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3)
                    .addComponent(jcbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtfDTNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtfNome.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbCancelar)
                    .addComponent(jtbConfirmar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setTpOp(int Op){
	this.TpOp = Op;
    }
    private int getTpOp(){
        return TpOp;
    } 
    private void MostrarOp(int Op){
        jcbTipoPessoa.enable();
        jtfCPF.enable();
        
        switch(Op){
            case 1:
                JLTituloGereciamentoPes.setText("Alterar Produto");
                jcbTipoPessoa.disable();
                jtfCPF.disable();
                break;
            case 2:
                JLTituloGereciamentoPes.setText("Incluir Produto");
                break;
            case 3:
                JLTituloGereciamentoPes.setText("Excluir Produto");
                break;
            default:
                JLTituloGereciamentoPes.setText("Gerenciar Produto");
        }       
    }
    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed
        
        String CPF = "";
        String CodTpPes = "";
        String Nome = "";
        String Telefone = "";
        String DTNasc = "";
        String Email = "";
        String Senha = "";
        int OP = getTpOp();
        
        CPF = jtfCPF.getText();
        
        //Atualizar-Inserir 
        if (( OP == 1 ) || (OP == 2)){
            
            if(jtfNome.getText().equalsIgnoreCase(PesForm.getNome()) == false){
                Nome = jtfNome.getText(); 
            }
            if (jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(PesForm.getTipoPessoa()) == false){
                CodTpPes = jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1);
            } 
            if (jtfTelefone.getText().equalsIgnoreCase(PesForm.getTelefone()) == false){
                Telefone = jtfTelefone.getText();
            }
            if (jtfEmail.getText().equalsIgnoreCase(PesForm.getEmail()) == false){
                Email = jtfEmail.getText();
            }
            if (jtfDTNasc.getText().equalsIgnoreCase(PesForm.getDTNasc()) == false){
                DTNasc = jtfDTNasc.getText();
            }            
            if (jtfCheckSenha.getText().equalsIgnoreCase(jtfSenha.getText()) == true){
                if (jtfSenha.getText().equalsIgnoreCase(PesForm.getSenha()) == false){
                    Senha = jtfSenha.getText();
                }
            
            }
            
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarProdutos(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o produto. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirProdutos(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o produto. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarProdutos(CPF);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o produto. \nContate o administrador.");
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

   private void CarregarCombos() {
        ResultSet Sql  = null;
        int TotalRegs = 0; 
        jcbTipoPessoa.removeAllItems();
        try{
            Sql = BuscarTpPessoa(0);
            Sql.last();
            TotalRegs = Sql.getRow();        
            Sql.first();
            for(int i = 1; i < TotalRegs; i++){
                String Cod = Sql.getString(1);
                String Desc = Sql.getString(2);
                jcbTipoPessoa.addItem(Cod +" - "+ Desc);
                Sql.next();
            }            
        }catch (SQLException ex) {
            System.out.println(ex);   
        }
        
    }//(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
    private static boolean IncluirProdutos(String CPF, String CodTpPes, String Nome,
                    String Telefone, String DTNasc, String Email, String Senha){        
        PessoaDao Tabela = new PessoaDao();     
        return Tabela.Insert(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
    }
    private static int AtualizarProdutos(String CPF, String CodTpPes, String Nome,
                    String Telefone, String DTNasc, String Email, String Senha){        
        PessoaDao Tabela = new PessoaDao();     
        return Tabela.Update(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
    }
    private static int DeletarProdutos(String CPF){        
        PessoaDao Tabela = new PessoaDao();     
        return Tabela.Delete(CPF);
    }
    private static ResultSet BuscarTpPessoa(int CPF){        
        TipoUsuarioDao Tabela = new TipoUsuarioDao();     
        return Tabela.select(CPF);
    }
    private void PreencherFormulario(int CodProd){    
        PessoaDao PesDB = new PessoaDao();     
        //ResultSet rsDadosForm = null; 
        
        PesForm = PesDB.CarregaDadosFormulario(CodProd);
        if (PesForm != null ){
            jtfCPF.setText(PesForm.getCPF());           
            jcbTipoPessoa.setSelectedIndex(IndexValorCombo(PesForm.getTipoPessoa(),1));
            jtfNome.setText(PesForm.getNome());            
            jtfTelefone.setText(PesForm.getTelefone());                
            jtfDTNasc.setText(PesForm.getDTNasc()); 
            jtfEmail.setText(PesForm.getEmail());
            jtfSenha.setText(PesForm.getSenha());
            jtfCheckSenha.setText(PesForm.getSenha());
        }
    }
    private int IndexValorCombo(String Valor,int combo ){
        int totVal = 0;
        int indexVal = 0;
        switch (combo){            
            case 1:
                totVal = jcbTipoPessoa.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbTipoPessoa.setSelectedIndex(i);
                    if(jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(Valor)==true){
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
            java.util.logging.Logger.getLogger(FrameCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrameCadastroPessoa(true,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloGereciamentoPes;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbTipoPessoa;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfCheckSenha;
    private javax.swing.JTextField jtfDTNasc;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
