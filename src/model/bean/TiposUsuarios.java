
package model.bean;

public class TiposUsuarios {
    
    private int IdTipoUsuarios;
    private String tipoUsuarios;

    public TiposUsuarios() {
    }

    public TiposUsuarios(String tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }

    

    public int getIdTipoUsuarios() {
        return IdTipoUsuarios;
    }

    public void setIdTipoUsuarios(int IdTipoUsuarios) {
        this.IdTipoUsuarios = IdTipoUsuarios;
    }

    public String getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(String tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }
}

