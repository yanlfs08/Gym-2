package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Ficha;


public class FichaDAO {

    public void Create(Ficha F) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO ficha (idFicha), (idExercicio), (carga), (repeticao), (serie) VALUES (?), (?), (?), (?), (?)");

            stmt.setString(1, F.getIdFicha());
            stmt.setString(2, F.getIdExercicios().getIdExercicios());
            stmt.setDouble(3, F.getCarga());
            stmt.setString(4, F.getRepeticao());
            stmt.setString(5, F.getSerie());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ficha Cadastrada!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao Casdastrar: " + ex);

        } finally {

            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
