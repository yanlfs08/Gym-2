
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Pessoa;
import connection.ConnectionFactory;
import java.sql.Connection;

public class PessoaDao {
    //private final ConnectDB Conexao = new ConnectDB();
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodigoPessoa,int TipoPessoa) {
        sql = "SELECT Pessoa.CodPessoa, Pessoa.Nome," +
              " TipoPessoa.DescTP AS TipoPessoa, " +
              " Pessoa.PesJuridicaSN, Pessoa.CNPJ_CPF," +
              " Pessoa.Email, Pessoa.DTNasc,"+
              " Pessoa.Senha, Pessoa.Telefone,"+
              " Pessoa.Municipio, Pessoa.UF, Pessoa.CEP"+
              " FROM Pessoa" +
              " INNER JOIN TipoPessoa" +
              " ON Pessoa.CodTpPes = TipoPessoa.CodTpPes" +
              " WHERE";
      
        if (CodigoPessoa != 0 ) {
            sql = sql + " CodPessoa = " + CodigoPessoa ;
        }
        if (TipoPessoa != 0 ) {
            if(CodigoPessoa != 0){sql = sql + " AND ";} 
            sql = sql + " TipoProduto = " + TipoPessoa;
        }
        //if(sql.substring(sql.length()-4,  sql.length()).equals("WHERE")==true){
        if((CodigoPessoa == 0 )&& (TipoPessoa == 0 )){
            sql = sql.substring(0,sql.length()-5);
        }
        sql = sql + ";";
        try{
            ps = con.prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return result;
        }catch(SQLException u ){
            System.out.println(u);     
        }
        return result;
    }
    public Boolean Insert(String CPF,String CodTpUsu,String Nome, String Telefone, String DTNasc, String Email, String Senha){
        
        sql = "INSERT INTO Cadastro(Cpf,idTipoUsuario,Nome,Telefone,DaTaNascimento,Email,Senha)"
            + " VALUES('" + CPF + "','" + CodTpUsu + "','" + Nome + "',"
            + ",'" + Telefone + "','" + DTNasc + "','" + Email + "','" + Senha + "');";
        try{
            ps = con.prepareStatement(sql);
            ps.execute(sql);
            //Conexao.closeConnection();
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;        
        }        
    }
    public int Update(String CPF,String CodTpUsu,String Nome, String Telefone, String DTNasc, String Email, String Senha) {
        int RegAft = 0;
    
        sql = "UPDATE Cadastro SET ";
        if(CodTpUsu.equals("")!= true){sql = sql + "idTipoUsuario = '" + CodTpUsu +"',";}
        if(Nome.equals("")!= true){sql = sql + "Nome = '" + Nome +"',";}
        if(Telefone.equals("")!= true){sql = sql + "Telefone = '" + Telefone +"',";}
        if(DTNasc.equals("")!= true){sql = sql + "DTNasc = '" + DTNasc +"',";}
        if(Email.equals("")!= true){sql = sql + "Email = '" + Email +"',";}
        if(Senha.equals("")!= true){sql = sql + "Senha = '" + Senha +"',";}
      
        sql = sql.substring(0, sql.length()-1);
        sql = sql + " Where CodProduto = " + CPF + ";";
        try{
            ps = con.prepareStatement(sql);  
            RegAft = ps.executeUpdate(sql);
            //Conexao.closeConnection();
            return RegAft;
        }catch(SQLException u ){
            System.out.println(u);
            return RegAft;        
        }
    }
    public int Delete(String CPF){
        int RegAft = 0;
        sql = "DELETE FROM Cadastro WHERE CPF = '" + CPF + "';";
        try{
            ps = con.prepareStatement(sql);  
            RegAft = ps.executeUpdate(sql);
            //Conexao.closeConnection();
            return RegAft;
        }catch(SQLException u ){
            System.out.println(u);
            return RegAft;        
        }
    }
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = select(0,0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                     
                    String CPF = rsTabela.getString(1);
                    String Nome = rsTabela.getString(2);
                    String CodTpPes = rsTabela.getString(3);
                    String CNPJ_CPF = rsTabela.getString(4);

                    Val.addRow(new String[] {CPF, Nome,CodTpPes, CNPJ_CPF});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public Pessoa CarregaDadosFormulario(int CodProd){    
        Pessoa PesList = new Pessoa(); 
        
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd,0);
            if (rsDadosForm.next()){
               
                String CPF = rsDadosForm.getString(1);
                String Nome = rsDadosForm.getString(2);
                String CodTpPes = rsDadosForm.getString(3);
                String Email = rsDadosForm.getString(5);
                String DTNasc = rsDadosForm.getString(6);
                String Senha = rsDadosForm.getString(7);
                String Telefone = rsDadosForm.getString(8);
                String Municipio = rsDadosForm.getString(9);
                String UF = rsDadosForm.getString(10);
                String CEP = rsDadosForm.getString(11);

                
                PesList.setCPF(CPF);
                PesList.setNome(Nome);
                PesList.setTipoPessoa(CodTpPes);
                PesList.setTelefone(Telefone);
                PesList.setDTNasc(DTNasc);
                PesList.setEmail(Email); 
                PesList.setSenha(Senha);
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return PesList;
    }
}
