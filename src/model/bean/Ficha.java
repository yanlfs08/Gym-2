
package model.bean;


public class Ficha {
    
    private String IdFicha;
    private Exercicios IdExercicios;
    private double carga;
    private String repeticao;
    private String serie;

    public Ficha() {
    }

    public Ficha(String IdFicha, Exercicios IdExercicios, double carga, String repeticao, String serie) {
        this.IdFicha = IdFicha;
        this.IdExercicios = IdExercicios;
        this.carga = carga;
        this.repeticao = repeticao;
        this.serie = serie;
    }


    public String getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(String IdFicha) {
        this.IdFicha = IdFicha;
    }

    public Exercicios getIdExercicios() {
        return IdExercicios;
    }

    public void setIdExercicios(Exercicios IdExercicios) {
        this.IdExercicios = IdExercicios;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    
}
