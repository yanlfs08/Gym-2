
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cadastro;
import model.bean.Exercicios;
import model.bean.Ficha;
import model.bean.GrupoMuscular;
import model.dao.PessoaDAO;
import model.dao.ExerciciosDAO;
import model.dao.GrupoMuscularDAO;
import model.dao.FichaDAO;


public class FrameCadFicha extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    Cadastro CadForm = new Cadastro();
    Exercicios ExercForm = new Exercicios();
    Ficha FichaForm = new Ficha();
    GrupoMuscular GmForm = new GrupoMuscular();

    public FrameCadFicha(boolean modal,long codFicha,long codExec,int Op) {
        initComponents();
        this.setModal(modal);
        CarregarCombos();
        setTpOp(Op);
        if(Op!=2){
            PreencherFormulario(codFicha,codExec);
        //}else{
        //    PreencherCodigo();
        }
        MostrarOp(Op);  
    }
    
    FrameCadFicha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTituloFicha = new javax.swing.JLabel();
        jtbConfirmar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcbExercicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtfCarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfRepeticao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfSerie = new javax.swing.JTextField();
        jtfFicha = new javax.swing.JTextField();
        jtbCancelar = new javax.swing.JToggleButton();
        lbBackGround2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(350, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        JLTituloFicha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLTituloFicha.setText("Cadastro de Ficha");
        getContentPane().add(JLTituloFicha);
        JLTituloFicha.setBounds(20, 11, 320, 21);

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
        getContentPane().add(jtbConfirmar);
        jtbConfirmar.setBounds(233, 239, 100, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(320, 190));
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jcbUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbUsuario.setPreferredSize(new java.awt.Dimension(180, 20));
        jcbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Exercício");

        jcbExercicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcbExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbExercicio.setPreferredSize(new java.awt.Dimension(180, 20));
        jcbExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbExercicioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Carga");

        jtfCarga.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Repetição");

        jtfRepeticao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Serie");

        jtfSerie.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jtfFicha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jtfFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(jtfFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(15, 38, 323, 190);

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
        getContentPane().add(jtbCancelar);
        jtbCancelar.setBounds(120, 240, 100, 30);

        lbBackGround2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/FUndo.png"))); // NOI18N
        lbBackGround2.setMaximumSize(new java.awt.Dimension(450, 300));
        lbBackGround2.setMinimumSize(new java.awt.Dimension(450, 300));
        lbBackGround2.setPreferredSize(new java.awt.Dimension(350, 280));
        getContentPane().add(lbBackGround2);
        lbBackGround2.setBounds(0, 0, 350, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jtbCancelarActionPerformed

    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed

        long CodUsuario;
        String idExercicio = "";
        String CodFicha = "";
        String Exercicio = "";
        double Carga = 0;
        String Repeticao = "";
        String Serie = "";
        String GrupoM = "";
        String strAux = "";
        int OP = getTpOp();
        
        strAux = jcbUsuario.getModel().getSelectedItem().toString();
        String[] CPFVet = strAux.split(" ");
        strAux = CPFVet[0];
        CodUsuario = Long.parseLong(strAux);
        ResultSet Sql  = null;        

        try {
            Sql = BuscarUsuario(CodUsuario,2);
            Sql.first();
            CodFicha = Sql.getString(8);
        } catch (SQLException ex) {
            Logger.getLogger(FrameCadFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(CodFicha.equals("")){CodFicha = jtfFicha.getText();}
        //Atualizar-Inserir
        if (( OP == 1 ) || (OP == 2)){            
            
            if(CodFicha.equals("")){
                Random gerador = new Random();
                //gera id aleatorio
                for (int i = 0; i < 1; i++) {
                    CodFicha = String.valueOf(gerador.nextInt(5555));
                }
                RegAfct = IncluirFichaUsuario(CodUsuario, CodFicha);
                if(RegAfct <= 0){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o cadastro. \nContate o administrador.");
                }
            }
            
            strAux= jcbExercicio.getModel().getSelectedItem().toString();
            String[] ExecVet = strAux.split(" ");
            idExercicio = ExecVet[0];

            if (jtfCarga.getText().equalsIgnoreCase(String.valueOf(FichaForm.getCarga())) == false){
                Carga = Double.parseDouble(jtfCarga.getText());
            }
            if (jtfRepeticao.getText().equalsIgnoreCase(String.valueOf(FichaForm.getRepeticao())) == false){
                Repeticao = jtfRepeticao.getText();
            }
            if (jtfSerie.getText().equalsIgnoreCase(String.valueOf(FichaForm.getSerie())) == false){
                Serie = jtfSerie.getText();
            }
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarFicha(CodFicha, idExercicio, Carga, Repeticao, Serie);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar a Ficha. \nContate o administrador.");
                }
                break;
            case 2: {
            ExecSucess = IncluirFicha(CodFicha, idExercicio, Carga, Repeticao, Serie);
        }
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir a Ficha. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                try {
                    Sql.first();
                    CodFicha = Sql.getString(8);
                } catch (SQLException ex) {
                    Logger.getLogger(FrameCadFicha.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(CodFicha.equals("")){
                    Random gerador = new Random();
                    //gera id aleatorio
                    for (int i = 0; i < 1; i++) {
                        CodFicha = String.valueOf(gerador.nextInt(5555));
                    }
                    RegAfct = IncluirFichaUsuario(CodUsuario, null);
                    if(RegAfct <= 0){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o cadastro. \nContate o administrador.");
                        break;
                    }else{
                        RegAfct = DeletarFicha(CodFicha, idExercicio);
                    }
                }
                
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir a Ficha. \nContate o administrador.");
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

    private void jcbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUsuarioActionPerformed

    private void jcbExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbExercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbExercicioActionPerformed
    
    private void setTpOp(int Op){
	this.TpOp = Op;
    }
    private int getTpOp(){
        return TpOp;
    }
    
    private void MostrarOp(int Op){
        switch(Op){
            case 1:
                JLTituloFicha.setText("Alterar Ficha");
                break;
            case 2:
                JLTituloFicha.setText("Incluir Ficha");
                break;
            case 3:
                JLTituloFicha.setText("Excluir Ficha");
                break;
            default:
                JLTituloFicha.setText("Gerenciar Ficha");
        }
    }
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
        Sql  = null;
        TotalRegs = 0; 
        jcbExercicio.removeAllItems();
        try{
            Sql = BuscarExercicio(0);
            Sql.last();
            TotalRegs = Sql.getRow();        
            Sql.first();
            for(int i = 0; i < TotalRegs; i++){
                String Cod = Sql.getString(1);
                String Desc = Sql.getString(2);
                jcbExercicio.addItem(Cod +" - "+ Desc);
                Sql.next();
            }            
        }catch (SQLException ex) {
            System.out.println(ex);   
        }
    }
    //CodAval, Peso, Altura, GordCorp, CodUsuario
    private static boolean IncluirFicha(String CodFicha,String idExercicio,double Carga,String Repeticao,String Serie){
        FichaDAO Tabela = new FichaDAO();
        return Tabela.Insert(CodFicha, idExercicio, Carga, Repeticao, Serie);
    }
    private static int AtualizarFicha(String CodFicha, String IdExercicio, double Carga, String Repeticao, String Serie){
        FichaDAO Tabela = new FichaDAO();
        return Tabela.Update(CodFicha, IdExercicio, Carga, Repeticao, Serie);
    }
    private static int DeletarFicha(String CodFicha, String idExercicio){        
        FichaDAO Tabela = new FichaDAO();     
        return Tabela.Delete(CodFicha,idExercicio);
    }
    private static ResultSet BuscarUsuario(long CPF,int CodTpUsu){        
        PessoaDAO UsuTb = new PessoaDAO();     
        return UsuTb.Select(CPF,CodTpUsu);
    }
    private static int IncluirFichaUsuario(long CPF,String CodFicha){                      
        PessoaDAO Tabela = new PessoaDAO();     
        return Tabela.UpdateIdFicha(CPF, CodFicha);
    }
    private static ResultSet BuscarExercicio(int Exec){        
        ExerciciosDAO ExeTb = new ExerciciosDAO();     
        return ExeTb.Select(Exec);
    }
    private void PreencherFormulario(long CodFicha,long CodExec){    
        FichaDAO FichaDB = new FichaDAO();     
        //ResultSet rsDadosForm = null; 
        
        FichaForm = FichaDB.CarregaDadosFormulario(CodFicha,CodExec);
        if (FichaForm != null ){
            String cbExec = FichaForm.getIdExercicios()+" - "+ FichaForm.getExercicios();
            String cbUsu = FichaForm.getCPF() +" - "+ FichaForm.getNome();
            jcbExercicio.setSelectedIndex(IndexValorCombo(cbExec,2));
            jcbUsuario.setSelectedIndex(IndexValorCombo(cbUsu,1));
            jtfCarga.setText(String.valueOf(FichaForm.getCarga()));
            jtfRepeticao.setText(String.valueOf(FichaForm.getRepeticao()));
            jtfSerie.setText(String.valueOf(FichaForm.getSerie()));
            jtfFicha.setText(String.valueOf(FichaForm.getIdFicha()));
        }
    }
    private int IndexValorCombo(String Valor,int combo ){
        int totVal = 0;
        int indexVal = 0;
        switch (combo){            
            case 1:
                totVal = jcbUsuario.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbUsuario.setSelectedIndex(i);
                    if(jcbUsuario.getModel().getSelectedItem().toString().equalsIgnoreCase(Valor)==true){
                       indexVal = i; 
                    }
                }
                break;
             case 2:
                totVal = jcbExercicio.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbExercicio.setSelectedIndex(i);
                    if(jcbExercicio.getModel().getSelectedItem().toString().equalsIgnoreCase(Valor)==true){
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
                new FrameCadFicha(true,0,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbExercicio;
    private javax.swing.JComboBox<String> jcbUsuario;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfCarga;
    private javax.swing.JTextField jtfFicha;
    private javax.swing.JTextField jtfRepeticao;
    private javax.swing.JTextField jtfSerie;
    private javax.swing.JLabel lbBackGround2;
    // End of variables declaration//GEN-END:variables
}
