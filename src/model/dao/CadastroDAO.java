/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Avaliação;
import model.bean.Cadastro;
import model.bean.TiposUsuarios;


/**
 *
 * @author yanlf
 */
public class CadastroDAO {
    
    public boolean validarLogin(String CPF, String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs =null;
        boolean check = false;
        
        try {
            
            stmt = con.prepareStatement("select * from cadastro where cpf = ? and senha = ?");
            stmt.setString(1, CPF);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()){
                
                check=true;
            }
            
        }catch (SQLException ex) {
            
            Logger.getLogger(GruposMuscularesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return check;
        
    }
    
    public List <Cadastro> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Cadastro> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("select c.CPF, c.nome as Nome, c.dataNascimento as 'D.Nascimento', c.telefone as Contato, c.email as Email, t.tipoUsuarios as Acesso\n" +
                "From cadastro c inner join tiposusuarios t on t.idTipoUsuarios = c.idTipoUsuarios;");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Cadastro c = new Cadastro();
                TiposUsuarios tu = new TiposUsuarios();
                
                tu.setTipoUsuarios(rs.getString("Acesso"));
                
                c.setCPF(rs.getString("CPF"));
                c.setNome(rs.getString("Nome"));
                c.setDataNascimento(rs.getString("D.Nascimento"));
                c.setTelefone(rs.getString("Contato"));
                c.setEmail(rs.getString("Email"));
                c.setIdTiposUsuarios(tu); 
                
                exercicio.add(c);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
}
