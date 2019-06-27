
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.GrupoMuscular;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GrupoMuscularDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    int RegAft = 0;
    public ResultSet Select(int CodGrupMusc) {
        sql = "SELECT * FROM gruposmusculares";              
        if (CodGrupMusc != 0 ) {
            sql = sql + " WHERE idGrupos  = " + CodGrupMusc + ";";
        }else{
            sql = sql + ";";
        }
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
    public Boolean Insert(int CodGrupMusc,String DescGrupoMusc){
        RegAft = 0;
        sql = "INSERT INTO gruposmusculares(idGrupos,descGrupo)  VALUES(" + CodGrupMusc + ",'" + DescGrupoMusc + "');";        
        try{
            ps = con.prepareStatement(sql);
            RegAft = ps.executeUpdate(sql);
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;        
        }        
    }
    public int Update(int CodGrupMusc,String DescGrupoMusc) {
        RegAft = 0;
        if(DescGrupoMusc.equals("")!= true){
            sql = "UPDATE gruposmusculares SET ";
            sql = sql + " descGrupo = '" + DescGrupoMusc +"'";
            sql = sql + " Where idGrupos = " + CodGrupMusc + ";";

            try{
                ps = con.prepareStatement(sql);
                RegAft = ps.executeUpdate(sql);
                return RegAft;
            }catch(SQLException u ){
                System.out.println(u);
                return RegAft;        
            }                     
        }else{
                return 1;
        }
    }
    public int Delete(int CodGrupMusc){        
        RegAft = 0;
        sql = "DELETE FROM gruposmusculares WHERE idGrupos = " + CodGrupMusc + ";";        
        try{
            ps = con.prepareStatement(sql);
            RegAft = ps.executeUpdate(sql);
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
        rsTabela = Select(0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String codigo = rsTabela.getString(1);
                    String descricao = rsTabela.getString(2);
                    Val.addRow(new String[] {codigo, descricao});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public GrupoMuscular CarregaDadosFormulario(int CodGrupMusc){    
        GrupoMuscular GrupoMuscList = new GrupoMuscular();         
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = Select(CodGrupMusc);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String descricao = rsDadosForm.getString(2);

                GrupoMuscList.setId(codigo);
                GrupoMuscList.setDesc(descricao);                     
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return GrupoMuscList;
    }
    public List <GrupoMuscular> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <GrupoMuscular> grupomuscular = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM gruposmusculares");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                GrupoMuscular G = new GrupoMuscular();
                
                G.setIdInt(rs.getInt("idGrupos"));
                G.setDesc(rs.getString("descGrupo"));

                grupomuscular.add(G);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return grupomuscular;
    }
}
