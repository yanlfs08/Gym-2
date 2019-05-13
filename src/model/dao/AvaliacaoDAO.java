
package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import model.bean.Avaliacao;
import model.bean.Cadastro;
import model.bean.Exercicios;
import model.bean.GrupoMuscular;
import model.dao.AvaliacaoDAO;

public class AvaliacaoDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public AvaliacaoDAO(){    
    }        
    public ResultSet select(int CodigoAval,boolean relacionado) {
        if(relacionado){
            
            sql = "SELECT avaliação.idAvaliacao as ID, " +
                        " cadastro.nome as Nome, " +
                        " avaliação.peso as Peso, " +
                        " avaliação.altura, " +
                        " avaliação.gorduraCorporal as '% Gordura' " +
                   " FROM avaliação " +
                  " INNER JOIN cadastro " +
                     " ON cadastro.CPF = avaliação.CPF ";
        }else{
            sql = "SELECT * FROM avaliação ";
        }    
        if (CodigoAval != 0 ) {
            sql = sql + " WHERE idAvaliacao = " + CodigoAval + " ORDER BY avaliação.idAvaliacao;";
        }else{
            sql = sql + " ORDER BY avaliação.idAvaliacao;";
        }
        try{
            ps = con.prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return result;
        }catch(SQLException u ){
            System.out.println(u); 
            return result;
        }           
    }
    public Boolean Insert(int CodigoAval,
                      double PesoAval,
                      double AltAval,
                      double GordCorp,
                      int CodUsuario){
        String DtAval = "";

        sql = "INSERT INTO avaliação(idAvaliacao,data,peso,altura,gorduraCorporal,CPF)"
                +" VALUES(" + CodigoAval + ",'" + DtAval + "'," + PesoAval + ",'" 
                            + AltAval +"','" + GordCorp + "'," + CodUsuario + ");";
        
        try{
            ps = con.prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;
        }           
    }
    public int Update(int CodigoAval,
                      double PesoAval,
                      double AltAval,
                      double GordCorp) {
        String DtAval = "";
        
        sql = "UPDATE avaliação SET ";
        sql = sql + "data = '" + DtAval +"',";
        if(PesoAval!= 0){sql = sql + "peso = " + PesoAval +",";}
        if(AltAval!= 0){sql = sql + "altura = '" + AltAval +"',";}
        if(GordCorp!= 0){sql = sql + "gorduraCorporal = '" + GordCorp +"',";}
        sql = sql.substring(0, sql.length()-1);
        sql = sql + " Where idAvaliacao = " + CodigoAval + ";";

        try{
            ps = con.prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return 1;
        }catch(SQLException u ){
            System.out.println(u); 
            return 0;
        }         
    }
    public int Delete(int CodigoAval){
        
        sql = "DELETE FROM avaliação WHERE idAvaliacao = " + CodigoAval + ";";
        
        try{
            ps = con.prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return 1;
        }catch(SQLException u ){
            System.out.println(u); 
            return 0;
        }  
    }
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = select(0,true);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String Codigo = rsTabela.getString("ID");
                    String Nome = rsTabela.getString("Nome");
                    String Peso = rsTabela.getString("Peso");
                    String Altura = rsTabela.getString("altura");
                    String GordCorp = rsTabela.getString("% Gordura");

                    Val.addRow(new String[] {Codigo, Nome, Peso, Altura, GordCorp});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public Avaliacao CarregaDadosFormulario(int CodProd){    
        Avaliacao AvalList = new Avaliacao();
        Cadastro UsuList = new Cadastro();
        
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd,true);
            if (rsDadosForm.next()){
                String Codigo = rsDadosForm.getString("ID");
                String Nome = rsDadosForm.getString("Nome");
                double Peso = rsDadosForm.getDouble("Peso");
                double Altura = rsDadosForm.getDouble("altura");
                double GordCorp = rsDadosForm.getDouble("% Gordura");

                AvalList.setIdAvaliacao(Codigo);
                UsuList.setNome(Nome);
                AvalList.setPeso(Peso);
                AvalList.setAltura(Altura);
                AvalList.setGorduraCorporal(GordCorp);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return AvalList;
    }
}