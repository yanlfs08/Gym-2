
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.GruposMusculares;


public class GruposMuscularesDAO {
    
    public void Create (GruposMusculares G){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO gruposmusculares (descGrupo) VALUES (?)");
      
            stmt.setString(1, G.getdescGrupo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Grupo Muscular Cadastrado");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Casdastrar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void Update (GruposMusculares G){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE gruposmusculares SET descGrupo = ? WHERE idGrupos = ?");
            stmt.setString(1, G.getdescGrupo());
            stmt.setString(2, G.getIdGrupos());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Grupo Muscular Atualizado");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void Delete (GruposMusculares G){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String title = "Confirmar Exclusao";
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            
            try {
            stmt = con.prepareStatement("DELETE FROM gruposmusculares WHERE idGrupos = ?");
          
            stmt.setString(1, G.getIdGrupos());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Grupo Muscular Excluido");
                    
            } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
            
            }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            }
        }     
    }
    
    
    public List <GruposMusculares> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <GruposMusculares> grupomuscular = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM gruposmusculares");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                GruposMusculares G = new GruposMusculares();
                
                G.setIdGrupos(rs.getString("idGrupos"));
                G.setdescGrupo(rs.getString("descGrupo"));

                grupomuscular.add(G);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return grupomuscular;
    }
    
    public List <GruposMusculares> readPesquisa(String pesquisa){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <GruposMusculares> grupomuscular = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM gruposmusculares WHERE descGrupo LIKE ?");
            stmt.setString(1, "%" + pesquisa + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                GruposMusculares G = new GruposMusculares();

                G.setIdGrupos(rs.getString("idGrupos"));
                G.setdescGrupo(rs.getString("descGrupo"));
                
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
