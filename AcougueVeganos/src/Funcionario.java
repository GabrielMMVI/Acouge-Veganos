//Funcionairo extende de Pessoa
public class Funcionario extends Pessoa{
    private double salario;
    private String cargo;
    public Funcionario(String cpf, String nome, String dataNascimento, String telefone, double salario, String cargo){
        setCpf(cpf);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setTelefone(telefone);
        this.salario = salario;
        this.cargo = cargo;
    }
    //Getters e Setters:

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double calcSalario(){
        return salario;
    }
}
