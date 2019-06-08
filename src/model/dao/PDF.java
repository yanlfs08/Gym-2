/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PDF {
    public static ResultSet PegaFichaPeloCadastro(String CPFpes) throws SQLException{
        /*String SQL=("select CPF, idExercicios, carga, repeticao, serie, Nome from ficha right join cadastro on ficha.idficha = cadastro.idFicha where CPF = 1784733679");*/
        String SQL=("select CPF, descExercicio, carga, repeticao, serie, Nome from ficha inner join cadastro on cadastro.idFicha = ficha.idFicha inner join exercicios on ficha.idExercicios = exercicios.idExercicios where CPF = '" + CPFpes +"';");
        PreparedStatement s = ConnectionFactory.getConnection().prepareStatement(SQL); 
        return s.executeQuery();
        
    }
    
    public static void PDF(String CPF) throws Exception{                
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Ficha.pdf"));
                my_pdf_report.open();            
                //we have four columns in our table
                PdfPTable my_report_table = new PdfPTable(4);
                //create a cell object
                PdfPCell table_cell;
                
                ResultSet r;
                r = PDF.PegaFichaPeloCadastro(CPF);
                
                String TesteNome = null;
                String TesteCPF = null;
                
                while(r.next ()) {
                TesteNome = (r.getString("Nome"));
                TesteCPF = (r.getString("CPF"));
                }
                
                table_cell=new PdfPCell(new Phrase("CPF:"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase(TesteCPF));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("Nome:"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase(TesteNome));
                my_report_table.addCell(table_cell);
                /*
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                */
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("-------------------------"));
                my_report_table.addCell(table_cell);
                
                table_cell=new PdfPCell(new Phrase("EXERCICIO"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("CARGA"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("REPETIÇÃO"));
                my_report_table.addCell(table_cell);
                table_cell=new PdfPCell(new Phrase("SERIES"));
                my_report_table.addCell(table_cell);
                
                r= null;
                r = PDF.PegaFichaPeloCadastro(CPF);
                while(r.next()) {                
                                String descExercicio = r.getString("descExercicio");
                                table_cell=new PdfPCell(new Phrase(descExercicio));
                                my_report_table.addCell(table_cell);
                                String carga=r.getString("carga");
                                table_cell=new PdfPCell(new Phrase(carga));
                                my_report_table.addCell(table_cell);
                                String repeticao=r.getString("repeticao");
                                table_cell=new PdfPCell(new Phrase(repeticao));
                                my_report_table.addCell(table_cell);
                                String serie=r.getString("serie");
                                table_cell=new PdfPCell(new Phrase(serie));
                                my_report_table.addCell(table_cell);
                                }
                my_pdf_report.add(my_report_table);                       
                my_pdf_report.close();
    }
}



