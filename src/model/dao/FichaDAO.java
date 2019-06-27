package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Ficha;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FichaDAO {
    Connection con = ConnectionFactory.getConnection();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    int RegAft = 0;
    public FichaDAO() {
    }
    
    public ResultSet select(long CPF,long CodigoFicha,long CodigoExec,boolean relacionado) {
        if(relacionado){
            
            sql = " SELECT ficha.idFicha AS Ficha, " +
                         " ficha.idExercicios AS IdExec, " +
                         " cadastro.Nome AS Nome, " +
                         " cadastro.CPF AS CPF, " +
                         " ficha.carga AS Carga, " +
                         " ficha.repeticao AS Repeticoes, " +
                         " ficha.serie AS Series, " +
                         " exercicios.descExercicio AS Exercicio, " +
                         " gruposmusculares.descGrupo AS GrupoMuscular" +
                    " FROM ficha " +
                   " INNER JOIN  cadastro " +
                      " ON ficha.CPF = cadastro.CPF " +
                   " INNER JOIN exercicios " +
                      " ON ficha.idExercicios = exercicios.idExercicios " +
                   " INNER JOIN gruposmusculares " +
                      " ON exercicios.idGrupos = gruposmusculares.idGrupos ";
        } else {
            sql = "SELECT * FROM ficha";
        }if ((CodigoFicha != 0) || (CPF != 0)) {
            sql = sql + " WHERE";
            if (CPF != 0) {sql = sql + "  ficha.CPF = '" + CPF+"' AND";}
            if (CodigoFicha != 0) {sql = sql + "  ficha.idFicha = '" + CodigoFicha+"' AND";}
            sql = sql + "  ficha.idExercicios = '"+ CodigoExec+"' ";
            if(relacionado){
                sql = sql + " ORDER BY ficha.idFicha, " +
                                 " gruposmusculares.descGrupo;";
            }else{
                sql = sql + " ORDER BY ficha.idFicha; ";
            }
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

    public Boolean Insert(long CPF,String CodigoFicha,String idExercicio,double carga,String repeticao,String serie){
        
        sql = "INSERT INTO ficha(CPF,idFicha,idExercicios,carga,repeticao,serie)"
                +" VALUES('" + CPF + "','" + CodigoFicha + "','" + idExercicio + "'," + carga + "," +
                         "'" + repeticao +"','" + serie + "');";
        try{
            ps = con.prepareStatement(sql);
            RegAft = ps.executeUpdate(sql);
            //Conexao.closeConnection();
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;
        }
    }
    
    public int Update(long CPF,
                      String CodigoFicha,
                      String idExercicio,
                      Double carga,
                      String repeticao,
                      String serie){
        RegAft = 0;        
        sql = "UPDATE ficha SET ";
        if(carga!= 0){sql = sql + " carga = '" + carga + "',";}
        if(repeticao.equals("")== false){sql = sql + " repeticao = '" + repeticao + "',";}
        if(serie.equals("")== false){sql = sql + " serie = '" + serie + "',";}
        sql = sql.substring(0, sql.length()-1);
        
        sql = sql + " WHERE CPF = '" + CPF+"'";
        sql = sql + "   AND idFicha = '" + CodigoFicha +"'";
        sql = sql + "   AND idExercicios = '"+ idExercicio+"';";
        
        
       try{
            ps = con.prepareStatement(sql);
            RegAft = ps.executeUpdate(sql);
            //Conexao.closeConnection();
            return RegAft;
        }catch(SQLException u ){
            System.out.println(u); 
            return RegAft;
        } 
    }
    
    public int Delete(long CPF, String CodigoFicha, String idExercicio){
        RegAft = 0;
        sql = " DELETE FROM ficha " ;
        sql = sql + " WHERE CPF = '" + CPF+"' ";
        sql = sql + "   AND idFicha = '" + CodigoFicha +"' ";
        sql = sql + "   AND idExercicios = '"+ idExercicio+"'; ";
        
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
        rsTabela = select(0,0,0,true);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String Ficha = rsTabela.getString("Ficha");
                    String IdExec = rsTabela.getString("IdExec");
                    String CPF = rsTabela.getString("CPF");
                    String Nome = rsTabela.getString("Nome");
                    String Exercicio = rsTabela.getString("Exercicio");
                    String Repetições = rsTabela.getString("Repeticoes");
                    String Serie = rsTabela.getString("Series");
                    String Carga = rsTabela.getString("Carga");
                    String GrupoMuscular = rsTabela.getString("GrupoMuscular");

                    Val.addRow(new String[] {Ficha,IdExec,CPF,Nome,Exercicio,Repetições,Serie,Carga,GrupoMuscular});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    
    public Ficha CarregaDadosFormulario(long CPF,long CodFicha,long CodExec){
        //Cadastro UsuList = new Cadastro();
        //Exercicios ExerciciosList = new Exercicios();
        Ficha FichaList = new Ficha();
        //GrupoMuscular GrupoMuscList = new GrupoMuscular();
        
        ResultSet rsDadosForm = null;
        
        try{
            rsDadosForm = select(CPF,CodFicha,CodExec,true);
            if (rsDadosForm.next()){
                    String Ficha = rsDadosForm.getString("Ficha");
                    String Nome = rsDadosForm.getString("Nome");
                    String CPF_Ficha = rsDadosForm.getString("CPF");
                    String IdExec = rsDadosForm.getString("IdExec");
                    String Exercicio = rsDadosForm.getString("Exercicio");
                    double Carga = rsDadosForm.getDouble("carga");
                    String Repetições = rsDadosForm.getString("Repeticoes");
                    String Serie = rsDadosForm.getString("series");
                    String GrupoMuscular = rsDadosForm.getString("GrupoMuscular");
                    
                    FichaList.setIdFicha(Ficha);
                    FichaList.setNome(Nome);
                    FichaList.setCPF(CPF_Ficha);
                    FichaList.setIdExercicios(IdExec);
                    FichaList.setExercicios(Exercicio);
                    FichaList.setCarga(Carga);
                    FichaList.setRepeticao(Repetições);
                    FichaList.setSerie(Serie);
                    FichaList.setGroupMusc(GrupoMuscular);
            }
        }catch (SQLException ex) {
            System.out.println(ex);   
        }return FichaList;
    }     
}

