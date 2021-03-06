
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Exercicios;
import model.bean.GrupoMuscular;

public class ExerciciosDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet Select(int CodigoExec) {
        sql = "SELECT idExercicios,descExercicio,idGrupos " +
               " FROM exercicios ";          
        if (CodigoExec != 0 ) {
            sql = sql + " WHERE idExercicios = '" + CodigoExec + "' ORDER BY idExercicios;";
        }else{
            sql = sql + " ORDER BY idExercicios;";
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
    public void Create (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
            GrupoMuscular G = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO exercicios (`idExercicios`,`descExercicio`,`idGrupos`) VALUES (?, ?, ?)");
            stmt.setString(1, E.getIdExercicios());
            stmt.setString(2, E.getdescExercicio());
            stmt.setString(3, E.getIdGruposMusculares().getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Cadastrado");
                    
            } catch (SQLException ex) {
            
                JOptionPane.showMessageDialog(null,"Erro ao Casdastrar: " + ex);
            
                }finally{
            
                ConnectionFactory.closeConnection(con, stmt);
            }
        }
    
    public void Update (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE exercicios SET descExercicio = ? WHERE idExercicios = ?");
            stmt.setString(1, E.getdescExercicio());
            stmt.setString(2, E.getIdExercicios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Atualizado");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void Delete (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String title = "Confirmar Exclusao";
        
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o exercicio?", title, JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
            
            try {
            stmt = con.prepareStatement("DELETE FROM exercicios WHERE idExercicios = ?");
          
            stmt.setString(1, E.getIdExercicios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Excluido!");
                    
            } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
            
            }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            }
        }     
    }
    
    
    public List <Exercicios> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Exercicios> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("select e.idExercicios as ei, e.descExercicio, g.descGrupo from exercicios e inner join gruposmusculares  g on g.idGrupos = e.idGrupos order by e.descExercicio");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Exercicios E = new Exercicios();
                GrupoMuscular G = new GrupoMuscular();
                
                E.setIdExercicios(rs.getString("ei"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                E.setIdGruposMusculares(G);
                
                G.setDesc(rs.getString("g.descGrupo"));
                
                exercicio.add(E);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
    
    public List <Exercicios> readPesquisaExercicio(String pesquisa){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Exercicios> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("select e.idExercicios as ei, e.descExercicio, g.descGrupo from exercicios e inner join gruposmusculares  g on g.idGrupos = e.idGrupos where e.descExercicio like ?");
            stmt.setString(1, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Exercicios E = new Exercicios();
                GrupoMuscular G = new GrupoMuscular();
                
                E.setIdExercicios(rs.getString("ei"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                E.setIdGruposMusculares(G);
                G.setDesc(rs.getString("g.descGrupo"));

                exercicio.add(E);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
    
    public List <Exercicios> readPesquisaDesc(String pesquisa){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Exercicios> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("select e.idExercicios as ei, e.descExercicio, g.descGrupo from exercicios e inner join gruposmusculares  g on g.idGrupos = e.idGrupos where g.descGrupo like ?");
            stmt.setString(1, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Exercicios E = new Exercicios();
                GrupoMuscular G = new GrupoMuscular();
                
                E.setIdExercicios(rs.getString("ei"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                E.setIdGruposMusculares(G);
                G.setDesc(rs.getString("g.descGrupo"));

                exercicio.add(E);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
}
