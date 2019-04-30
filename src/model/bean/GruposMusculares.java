
package model.bean;

public class GruposMusculares {
    
    private String IdGrupos;
    private String descGrupo;

    public GruposMusculares() {
    }

    public GruposMusculares(String descGrupo) {
        this.descGrupo = descGrupo;
    }
  
    public String getIdGrupos() {
        return IdGrupos;
    }
 
    public void setIdGrupos(String IdGrupos) {
        this.IdGrupos = IdGrupos;
    }
 
    public String getdescGrupo() {
        return descGrupo;
    }

    public void setdescGrupo(String descGrupo) {
        this.descGrupo = descGrupo;
    }

    @Override
    public String toString() {
        return getdescGrupo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
