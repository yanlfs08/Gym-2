
package model.bean;


public class Cadastro {
    
    private String CPF;
    private String nome;
    private String dataNascimento;    
    private String telefone;
    private String email;
    private TiposUsuarios idTiposUsuarios;
    private Ficha idFicha;
    private String senha;

    public Cadastro() {
    }

    public Cadastro(String CPF, String nome, String dataNascimento, String telefone, String email, TiposUsuarios idTiposUsuarios, Ficha idFicha, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.idTiposUsuarios = idTiposUsuarios;
        this.idFicha = idFicha;
        this.senha = senha;
    }

  
    public String getCPF() {
        return CPF;
    }

 
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public TiposUsuarios getIdTiposUsuarios() {
        return idTiposUsuarios;
    }

    public void setIdTiposUsuarios(TiposUsuarios idTiposUsuarios) {
        this.idTiposUsuarios = idTiposUsuarios;
    }

    public Ficha getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Ficha idFicha) {
        this.idFicha = idFicha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
