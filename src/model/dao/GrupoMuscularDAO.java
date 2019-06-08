
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.GrupoMuscular;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GrupoMuscularDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
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
        sql = "INSERT INTO gruposmusculares(idGrupos,descGrupo)  VALUES(" + CodGrupMusc + ",'" + DescGrupoMusc + "');";        
        try{
            ps = con.prepareStatement(sql);
            ps.execute(sql);
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;        
        }        
    }
    public int Update(int CodGrupMusc,String DescGrupoMusc) {
    		if(DescGrupoMusc.equals("")!= true){
                    sql = "UPDATE gruposmusculares SET ";
                    sql = sql + " descGrupo = '" + DescGrupoMusc +"'";
                    sql = sql + " Where idGrupos = " + CodGrupMusc + ";";
                    
                    try{
                        ps = con.prepareStatement(sql);
                        ps.execute(sql);
                        return 1;
                    }catch(SQLException u ){
                        System.out.println(u);
                        return 0;        
                    }                     
		}else{
			return 1;
		}
    }
    public int Delete(int CodGrupMusc){        
        sql = "DELETE FROM gruposmusculares WHERE idGrupos = " + CodGrupMusc + ";";        
        try{
            ps = con.prepareStatement(sql);
            ps.execute(sql);
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
}
