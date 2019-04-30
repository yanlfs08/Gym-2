
package model.bean;

public class Exercicios {
    
    private String idExercicios;
    private String descExercicio;
    private GruposMusculares idGruposMusculares;

    public Exercicios() {
    }

    public Exercicios(String descGrup, GruposMusculares idGruposMusculares) {
        
        this.descExercicio = descExercicio;
        this.idGruposMusculares = idGruposMusculares;
    }

    public String getIdExercicios() {
        return idExercicios;
    }

    public void setIdExercicios(String idExercicios) {
        this.idExercicios = idExercicios;
    }

    public String getdescExercicio() {
        return descExercicio;
    }

    public void setdescExercicio(String desc) {
        this.descExercicio = desc;
    }

    public GruposMusculares getIdGruposMusculares() {
        return idGruposMusculares;
    }

    public void setIdGruposMusculares(GruposMusculares idGruposMusculares) {
        this.idGruposMusculares = idGruposMusculares;
    }

    
}
