
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Pessoa;
import connection.ConnectionFactory;
import java.sql.Connection;

public class PessoaDAO {
    //private final ConnectDB Conexao = new ConnectDB();
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet Select(int CPF,int TipoUsuarios) {
        sql = "SELECT cadastro.CPF, " +
                    " cadastro.Nome," +
                    " tiposusuarios.TipoUsuario, " +
                    " cadastro.DtNasc, " +
                    " cadastro.Telefone," +
                    " cadastro.Email,"+
                    " cadastro.Senha"+
               " FROM cadastro" +
              " INNER JOIN tiposusuarios" +
                 " ON cadastro.idTipoUsuarios = tiposusuarios.idTipoUsuarios" +
              " WHERE";
      
        if (CPF != 0 ) {
            sql = sql + " CPF = " + CPF ;
        }
        if (TipoUsuarios != 0 ) {
            if(CPF != 0){sql = sql + " AND ";} 
            sql = sql + " idTipoUsuarios = " + TipoUsuarios;
        }
        //if(sql.substring(sql.length()-4,  sql.length()).equals("WHERE")==true){
        if((CPF == 0 )&& (TipoUsuarios == 0 )){
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
        
        if(CodTpUsu.equals("")== true){CodTpUsu = "Null";}
        if(Nome.equals("")== true){Nome = "Null";}
        if(Telefone.equals("")== true){Telefone = "Null";}
        if(DTNasc.equals("")== true){DTNasc = "Null";}
        if(Email.equals("")== true){Email = "Null";}
        if(Senha.equals("")== true){Senha = "Null";}
        
        
        sql = "INSERT INTO cadastro(Cpf,idTipoUsuarios,Nome,Telefone,DTNasc,Email,Senha)"
            + " VALUES('" + CPF + "','" + CodTpUsu + "','" + Nome + "',"
            + "'" + Telefone + "','" + DTNasc + "','" + Email + "','" + Senha + "');";
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
    
        sql = "UPDATE cadastro SET ";
        if(CodTpUsu.equals("")!= true){sql = sql + "idTipoUsuarios = '" + CodTpUsu +"',";}
        if(Nome.equals("")!= true){sql = sql + "Nome = '" + Nome +"',";}
        if(Telefone.equals("")!= true){sql = sql + "Telefone = '" + Telefone +"',";}
        if(DTNasc.equals("")!= true){sql = sql + "DTNasc = '" + DTNasc +"',";}
        if(Email.equals("")!= true){sql = sql + "Email = '" + Email +"',";}
        if(Senha.equals("")!= true){sql = sql + "Senha = '" + Senha +"',";}
      
        sql = sql.substring(0, sql.length()-1);
        sql = sql + " Where CPF = " + CPF + ";";
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
        sql = "DELETE FROM cadastro WHERE CPF = '" + CPF + "';";
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
        rsTabela = Select(0,0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String CPF = rsTabela.getString(1);
                    String Nome = rsTabela.getString(2);
                    String CodTpPes = rsTabela.getString(3);
                    String DtNasc = rsTabela.getString(4);
                    String Tel = rsTabela.getString(5);
                    String Email = rsTabela.getString(6);

                    Val.addRow(new String[] {CPF, Nome, CodTpPes, DtNasc, Tel, Email});
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
            rsDadosForm = Select(CodProd,0);
            if (rsDadosForm.next()){
//`CPF`,`nome`,`idTipoUsuarios`,`dataNascimento`,`telefone`,`email`,`idFicha`,`senha                             
               
                String CPF = rsDadosForm.getString(1);
                String Nome = rsDadosForm.getString(2);
                String CodTpPes = rsDadosForm.getString(3);
                String DTNasc = rsDadosForm.getString(4);
                String Telefone = rsDadosForm.getString(5);
                String Email = rsDadosForm.getString(6);
                String Senha = rsDadosForm.getString(7);
                
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
