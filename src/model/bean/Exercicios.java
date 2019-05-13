
package model.bean;

public class Exercicios {
    
    private String idExercicios;
    private String descExercicio;
    private GrupoMuscular idGruposMusculares;

    public Exercicios() {
    }

    public Exercicios(String descGrup, GrupoMuscular idGruposMusculares) {
        
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

    public GrupoMuscular getIdGruposMusculares() {
        return idGruposMusculares;
    }

    public void setIdGruposMusculares(GrupoMuscular idGruposMusculares) {
        this.idGruposMusculares = idGruposMusculares;
    }

    
}
