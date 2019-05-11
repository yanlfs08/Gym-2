
package model.bean;

public class Pessoa {
    private String CPF = "";
    private String Nome = "";
    private String TipoPessoa = "";
    private String Telefone = "";
    private String DTNasc = "";
    private String Email = "";
    private String Senha = "";


    
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getTipoPessoa() {
        return TipoPessoa;
    }
    public void setTipoPessoa(String TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    public String getDTNasc() {
        return DTNasc;
    }
    public void setDTNasc(String DTNasc) {
        this.DTNasc = DTNasc;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
