
package model.bean;


public class Ficha {
    
    private String Nome;
    private String CPF;
    private String IdFicha;
    private String IdExercicios;
    private double carga;
    private String repeticao;
    private String serie;
    private String GroupMusc;
    private String Exercicios;

    public Ficha() {
    }

    public Ficha(String Nome, String CPF, String Exercicios, String IdFicha, String IdExercicios, double carga, String repeticao, String serie, String GroupMusc) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Exercicios = Exercicios;
        this.IdFicha = IdFicha;
        this.IdExercicios = IdExercicios;
        this.carga = carga;
        this.repeticao = repeticao;
        this.serie = serie;
        this.GroupMusc = GroupMusc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getGroupMusc() {
        return GroupMusc;
    }

    public void setGroupMusc(String GroupMusc) {
        this.GroupMusc = GroupMusc;
    }


    public String getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(String IdFicha) {
        this.IdFicha = IdFicha;
    }

    public String getIdExercicios() {
        return IdExercicios;
    }

    public void setIdExercicios(String IdExercicios) {
        this.IdExercicios = IdExercicios;
    }

    public String getExercicios() {
        return Exercicios;
    }

    public void setExercicios(String IdExercicios) {
        this.Exercicios = IdExercicios;
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
