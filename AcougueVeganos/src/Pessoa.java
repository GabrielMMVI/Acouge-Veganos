public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    //Getters
    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}