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
import java.util.logging.Level;
import java.util.logging.Logger;


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
}
