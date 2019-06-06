package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Cadastro;
import model.bean.Exercicios;
import model.bean.Ficha;
import model.bean.GrupoMuscular;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FichaDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public FichaDAO() {
    }
    
    /*public ResultSet select(int CodigoFicha,boolean relacionado) {
        if(relacionado){
            
            sql = "SELECT \n" +
                  "c.`Nome` AS Nome, \n" +
                    "f.`carga` AS Carga, \n" +
                    "f.`repeticao` AS Repetições, \n" +
                    "f.`serie` AS Séries, \n" +
                    "e.`descExercicio` AS Exercicio, g.`descGrupo` AS 'Grupro Muscular' \n" +
                    "FROM `ficha` f \n" +
                    "INNER JOIN `cadastro` c \n" +
                    "ON f.`idFicha` = c.`idFicha` \n" +
                    "INNER JOIN `exercicios` e \n" +
                    "ON f.`idExercicios` = e.`idExercicios` \n" +
                    "INNER JOIN `gruposmusculares` g \n" +
                    "ON e.`idGrupos` = g.`idGrupos`\n" +
                    "ORDER BY g.`descGrupo`";
        } else {
            sql = "SELECT * FROM ficha";
        }if (CodigoFicha != 0 ) {
            sql = sql + " WHERE idFicha = " + CodigoFicha + " ORDER BY ficha.idFicha;";
        }else{
            sql = sql + " ORDER BY ficha.idFicha;";
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
    }*/

    public Boolean Insert(String CodigoFicha,String idExercicio,double carga,String repeticao,String serie){
        
        sql = "INSERT INTO ficha(idFicha,idExercicios,carga,repeticao,serie)"
                +" VALUES(" + CodigoFicha + ",'" + idExercicio + "'," + carga + ",'" 
                            + repeticao +"','" + serie + "');";
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
    
    public int Update(int CodigoFicha,int idExercicio,int carga,int repeticao,int serie){
        sql = "UPDATE ficha SET ";
        sql = sql + " idExercicio = '" + idExercicio + "'";
        sql = sql + " carga = '" + carga + "'";
        sql = sql + " repeticao = '" + repeticao + "'";
        sql = sql + " serie = '" + serie + "'";
        sql = sql + " WHERE idFicha = " + CodigoFicha + ";";
        
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
    
    public int Delete(int CodigoFicha, int idExercicio){
        sql = "DELETE FROM ficha WHERE idFicha = " + CodigoFicha + ";";
        //sql = "DELETE FROM ficha WHERE idExercico = " + idExercicio + ";";
        
        try{
            ps = con.prepareStatement(sql);
            ps.execute(sql);
            return 1;
        }catch(SQLException u ){
            System.out.println(u);
            return 0;        
        }
    }
    
   /* public void PreencherTabela(JTable modeloTable,boolean Limpar){
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = select(0,true);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String Nome = rsTabela.getString("Nome");
                    String Exercicio = rsTabela.getString("descExercicio");
                    String Carga = rsTabela.getString("carga");
                    String Repetições = rsTabela.getString("repeticao");
                    String Serie = rsTabela.getString("serie");
                    String GrupoMuscular = rsTabela.getString("descGrupo");

                    Val.addRow(new String[] {Nome, Exercicio, Carga, Repetições, Serie, GrupoMuscular });
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    
    public Ficha CarregaDadosFormulario(int CodFicha){
        Cadastro UsuList = new Cadastro();
        Exercicios ExerciciosList = new Exercicios();
        Ficha FichaList = new Ficha();
        GrupoMuscular GrupoMuscList = new GrupoMuscular();
        
        ResultSet rsDadosForm = null;
        
        try{
            rsDadosForm = select(CodFicha,true);
            if (rsDadosForm.next()){
                    String Nome = rsDadosForm.getString("Nome");
                    String Exercicio = rsDadosForm.getString("descExercicio");
                    double Carga = rsDadosForm.getDouble("carga");
                    String Repetições = rsDadosForm.getString("repeticao");
                    String Serie = rsDadosForm.getString("serie");
                    String GrupoMuscular = rsDadosForm.getString("descGrupo");
                    
                    UsuList.setNome(Nome);
                    ExerciciosList.setdescExercicio(Exercicio);
                    FichaList.setCarga(Carga);
                    FichaList.setRepeticao(Repetições);
                    FichaList.setSerie(Serie);
                    GrupoMuscList.setDesc(GrupoMuscular);
            }
        }catch (SQLException ex) {
            System.out.println(ex);   
        }return FichaList;
    } */
    
    public List <Ficha> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Ficha> ficha = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT \n" +
                                        "c.`Nome` AS Nome, \n" +
                                        "f.`carga` AS Carga, \n" +
                                        "f.`repeticao` AS Repetições, \n" +
                                        "f.`serie` AS Séries, \n" +
                                        "e.`descExercicio` AS Exercicio, g.`descGrupo` AS 'Grupro Muscular' \n" +
                                        "FROM `ficha` f \n" +
                                        "INNER JOIN `cadastro` c \n" +
                                        "ON f.`idFicha` = c.`idFicha` \n" +
                                        "INNER JOIN `exercicios` e \n" +
                                        "ON f.`idExercicios` = e.`idExercicios` \n" +
                                        "INNER JOIN `gruposmusculares` g \n" +
                                        "ON e.`idGrupos` = g.`idGrupos`\n" +
                                        "ORDER BY g.`descGrupo`"); 
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Cadastro      C = new Cadastro();
                Exercicios    E = new Exercicios();
                Ficha         F = new Ficha();
                GrupoMuscular G = new GrupoMuscular();
                
                C.setNome(rs.getString("c.Nome"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                F.setCarga(rs.getDouble("f.carga"));
                F.setSerie(rs.getString("f.serie"));
                F.setRepeticao(rs.getString("f.repeticao"));
                G.setDesc(rs.getString("g.descGrupo"));
                
                ficha.add(F);
        }
    } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ficha;
    }
    
    public List <Ficha> readPesquisaFicha(String pesquisa){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Ficha> ficha = new ArrayList<>();
        
         try {
            stmt = con.prepareStatement("SELECT \n" +
                                        "c.`Nome` AS Nome, \n" +
                                        "f.`carga` AS Carga, \n" +
                                        "f.`repeticao` AS Repetições, \n" +
                                        "f.`serie` AS Séries, \n" +
                                        "e.`descExercicio` AS Exercicio, g.`descGrupo` AS 'Grupro Muscular' \n" +
                                        "FROM `ficha` f \n" +
                                        "INNER JOIN `cadastro` c \n" +
                                        "ON f.`idFicha` = c.`idFicha` \n" +
                                        "INNER JOIN `exercicios` e \n" +
                                        "ON f.`idExercicios` = e.`idExercicios` \n" +
                                        "INNER JOIN `gruposmusculares` g \n" +
                                        "ON e.`idGrupos` = g.`idGrupos`\n" +
                                        "ORDER BY g.`descGrupo`");
            stmt.setString(1, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Cadastro      C = new Cadastro();
                Exercicios    E = new Exercicios();
                Ficha         F = new Ficha();
                GrupoMuscular G = new GrupoMuscular();
                
                C.setNome(rs.getString("c.Nome"));
                E.setdescExercicio(rs.getString("e.descExercicio"));
                F.setCarga(rs.getDouble("f.carga"));
                F.setSerie(rs.getString("f.serie"));
                F.setRepeticao(rs.getString("f.repeticao"));
                G.setDesc(rs.getString("g.descGrupo"));
                
                ficha.add(F);
        }
    } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ficha;
    }
    
    
}

