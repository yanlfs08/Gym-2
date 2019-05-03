
package model.bean;

import java.lang.String;


public class Avaliação {
    
    private String idAvaliacao;
    private String data;
    private double peso;
    private double altura;
    private double gorduraCorporal;
    private Cadastro cpf;
    
    public Avaliação(){
        
    }

    public Avaliação(String idAvaliacao, String data, double peso, double altura, double gorduraCorporal, Cadastro cpf) {
        this.idAvaliacao = idAvaliacao;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.gorduraCorporal = gorduraCorporal;
        this.cpf = cpf;
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

    /**
     * @return the cpf
     */
    public Cadastro getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Cadastro cpf) {
        this.cpf = cpf;
    }

    
}
