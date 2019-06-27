
package model.bean;

public class GrupoMuscular {
    
    private String IdGrupo;
    private String DescGrupo;
    private int IdGrupoInt;

    public GrupoMuscular() {
    }

    public GrupoMuscular(String DescGrupo) {
        this.DescGrupo = DescGrupo;
    }
  
    public String getId() {
        return IdGrupo;
    }
 
    public void setId(String IdGrupo) {
        this.IdGrupo = IdGrupo;
    }
    public int getIdInt() {
        return IdGrupoInt;
    }
 
    public void setIdInt(int IdGrupoInt) {
        this.IdGrupoInt = IdGrupoInt;
    } 
    public String getDesc() {
        return DescGrupo;
    }

    public void setDesc(String DescGrupo) {
        this.DescGrupo = DescGrupo;
    }

    @Override
    public String toString() {
        return getDesc(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
