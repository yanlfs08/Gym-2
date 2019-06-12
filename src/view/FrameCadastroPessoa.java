
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.dao.PessoaDAO;
import model.dao.TipoUsuarioDAO;
import model.bean.Pessoa;
import javax.swing.JTextField;


public class FrameCadastroPessoa extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    Pessoa PesForm = new Pessoa();
    public FrameCadastroPessoa(boolean modal,long codPes,int Op) {
        initComponents();
        this.setModal(modal);
        CarregarCombos();
        setTpOp(Op);
        if(codPes!=0){
            PreencherFormulario(codPes);
        }
        MostrarOp(Op);        
    }

    FrameCadastroPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jtbConfirmar = new javax.swing.JToggleButton();
        jtbCancelar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jcbTipoPessoa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfCPF = new gym.JTextFieldHint(new JTextField(),"","    .    .   -   ");  ;
        jLabel12 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jtfDTNasc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();
        JLTituloGereciamentoPes = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(null);
        setResizable(false);

        jPanel3.setMaximumSize(new java.awt.Dimension(469, 300));
        jPanel3.setMinimumSize(new java.awt.Dimension(469, 300));
        jPanel3.setLayout(null);

        jtbConfirmar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
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
        jPanel3.add(jtbConfirmar);
        jtbConfirmar.setBounds(220, 260, 100, 30);

        jtbCancelar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
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
        jPanel3.add(jtbCancelar);
        jtbCancelar.setBounds(330, 260, 100, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Telefone");

        jLabel9.setText("E-mail:");

        jtfCPF.setToolTipText("");
        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });

        jLabel12.setText("CPF:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Confirmação de senha:");

        jLabel17.setText("Senha:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
                        .addGap(24, 24, 24))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfNome.getAccessibleContext().setAccessibleName("");

        jPanel3.add(jPanel1);
        jPanel1.setBounds(20, 40, 420, 210);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(150, 10, 190, 24);

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        lbBackground.setMaximumSize(new java.awt.Dimension(469, 300));
        lbBackground.setMinimumSize(new java.awt.Dimension(469, 300));
        lbBackground.setPreferredSize(new java.awt.Dimension(469, 300));
        jPanel3.add(lbBackground);
        lbBackground.setBounds(0, 0, 469, 300);

        JLTituloGereciamentoPes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        JLTituloGereciamentoPes.setText("Cadastro de Usuários");
        jPanel3.add(JLTituloGereciamentoPes);
        JLTituloGereciamentoPes.setBounds(150, 15, 190, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Usuários");

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
            
            String senha = new String(jPasswordField1.getPassword()).trim();
            String checksenha = new String(jPasswordField2.getPassword()).trim();
            
            if (senha.equalsIgnoreCase(checksenha) == true){
                if (checksenha.equalsIgnoreCase(PesForm.getSenha()) == false){
                    Senha = checksenha;
                }
            
            }
            
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarProdutos(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o cadastro. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirProdutos(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o cadastro. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarProdutos(CPF);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o cadastro. \nContate o administrador.");
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

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
        PessoaDAO Tabela = new PessoaDAO();     
        return Tabela.Insert(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
    }
    private static int AtualizarProdutos(String CPF, String CodTpPes, String Nome,
                    String Telefone, String DTNasc, String Email, String Senha){        
        PessoaDAO Tabela = new PessoaDAO();     
        return Tabela.Update(CPF, CodTpPes, Nome, Telefone,DTNasc,Email,Senha);
    }
    private static int DeletarProdutos(String CPF){        
        PessoaDAO Tabela = new PessoaDAO();     
        return Tabela.Delete(CPF);
    }
    private static ResultSet BuscarTpPessoa(int TpPes){        
        TipoUsuarioDAO Tabela = new TipoUsuarioDAO();     
        return Tabela.select(TpPes);
    }
    private void PreencherFormulario(long CodProd){    
        PessoaDAO PesDB = new PessoaDAO();     
        //ResultSet rsDadosForm = null; 
        
        PesForm = PesDB.CarregaDadosFormulario(CodProd);
        
        if (PesForm != null ){
            jtfCPF.setText(PesForm.getCPF());           
            jcbTipoPessoa.setSelectedIndex(IndexValorCombo(PesForm.getTipoPessoa(),1));
            jtfNome.setText(PesForm.getNome());            
            jtfTelefone.setText(PesForm.getTelefone());                
            jtfDTNasc.setText(PesForm.getDTNasc()); 
            jtfEmail.setText(PesForm.getEmail());
            jPasswordField1.setText(PesForm.getSenha());
            jPasswordField2.setText(PesForm.getSenha());
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JComboBox<String> jcbTipoPessoa;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfDTNasc;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JLabel lbBackground;
    // End of variables declaration//GEN-END:variables
}
