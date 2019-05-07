
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Avaliação;
import model.bean.Cadastro;
import model.bean.Exercicios;
import model.bean.GruposMusculares;
/**
 *
 * @author yanlf
 */
public class AvaliaçãoDAO {
    
    public void Create (Avaliação A){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO exercicios (`idAvaliacao`,`data`,`peso`,`altura`,`gorduraCorporal`,`CPF`) VALUES (?, ?, ? ,?, ?, ?)");
            stmt.setString(1, A.getIdAvaliacao());
            stmt.setString(2, A.getData());
            stmt.setDouble(3, A.getPeso());
            stmt.setDouble(4, A.getAltura());
            stmt.setDouble(5, A.getGorduraCorporal());
            stmt.setString(6, A.getCpf().getCPF());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Avaliação Cadastrada!");
                    
            } catch (SQLException ex) {
            
                JOptionPane.showMessageDialog(null,"Erro ao Casdastrar: " + ex);
            
                }finally{
            
                ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void Update (Avaliação A){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE avaliação SET data = ? peso = ?, altura = ?, gorduraCorporal = ? "
                    + "WHERE idAvaliacao = ?");
            stmt.setString(1, A.getData());
            stmt.setDouble(2, A.getPeso());
            stmt.setDouble(3, A.getAltura());
            stmt.setDouble(4, A.getGorduraCorporal());
            stmt.setString(5, A.getIdAvaliacao());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Avaliaçãp Atualizada!");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }    
    }
    
    public void Delete (Avaliação A){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String title = "Confirmar Exclusão";
        
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a avaliação?", 
                    title, JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
            
            try {
            stmt = con.prepareStatement("DELETE FROM avaliação WHERE idAvaliacao = ?");
          
            stmt.setString(1, A.getIdAvaliacao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Avaliação Excluida!");
                    
            } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
            
            }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            }
        }     
    }
    
    public List <Avaliação> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Avaliação> avaliacao = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("SELECT a.idAvaliacao as ID, c.nome as Nome, a.peso as Peso, a.altura, a.gorduraCorporal as '% Gordura' FROM"
                    + " avaliação a inner join cadastro c on c.CPF = a.CPF;");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Avaliação A = new Avaliação();
                Cadastro C = new Cadastro();
                
                A.setCpf(C);
                A.setIdAvaliacao(rs.getString("ID"));
                C.setNome(rs.getString("Nome"));
                A.setPeso(rs.getDouble("Peso"));
                A.setAltura(rs.getDouble("altura"));
                A.setGorduraCorporal(rs.getDouble("% Gordura"));
                
                avaliacao.add(A);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return avaliacao;
    }
    
    public List <Avaliação> readPesquisa(String pesquisa){
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Avaliação> avaliacao = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement(" SELECT a.idAvaliacao as ID, c.nome as Nome, a.peso as Peso, a.altura, a.gorduraCorporal as '% Gordura'" +
                    "FROM avaliação a inner join cadastro c on c.CPF = a.CPF WHERE Nome LIKE ? ");
            stmt.setString(1, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Avaliação A = new Avaliação();
                Cadastro C = new Cadastro();
                
                A.setCpf(C);
                A.setIdAvaliacao(rs.getString("ID"));
                C.setNome(rs.getString("Nome"));
                A.setPeso(rs.getDouble("Peso"));
                A.setAltura(rs.getDouble("altura"));
                A.setGorduraCorporal(rs.getDouble("% Gordura"));
                
                
                avaliacao.add(A);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return avaliacao;
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
                GruposMusculares G = new GruposMusculares();
                
                E.setIdExercicios(rs.getString("ei"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                E.setIdGruposMusculares(G);
                G.setdescGrupo(rs.getString("g.descGrupo"));

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
