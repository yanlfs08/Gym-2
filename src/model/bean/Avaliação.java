
package model.bean;

import java.lang.String;


public class Avaliação {
    
    private String idAvaliacao;
    private String data;
    private double peso;
    private double altura;
    private double gorduraCorporal;
    
    public Avaliação(){
        
    }

    public Avaliação(String data, double peso, double altura, double gorduraCorporal) {
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.gorduraCorporal = gorduraCorporal;
    }
    

    public String getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(String idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getGorduraCorporal() {
        return gorduraCorporal;
    }


    public void setGorduraCorporal(double gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }

    
}
