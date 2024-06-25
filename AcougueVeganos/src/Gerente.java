import java.util.ArrayList;
import java.util.List;
//Classe gerente extende de classe pessoa:
public class Gerente extends Pessoa {
    private double salario;
    private String turno;
    private List<Funcionario> funcionarios;
    //Método construtor
    public Gerente(String cpf, String nome, String dataNascimento, String telefone, double salario, String turno) {
        setCpf(cpf);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setTelefone(telefone);
        this.salario = salario;
        this.turno = turno;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    //Getters e Setters:

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    // Calcular salario:
    public double calcSalario(){
        return salario;
    }
    //Adicionar Funcionario
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    //Remover Funcionario
    public void rmvFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
    //Gerar Relatorio
    public void gerarRelatorio(){
        System.out.println("Relatório gerado");
    }
    //Gerenciar estoque:
    public void mngEstoque(){
        System.out.println("Estoque gerenciado");
    }
}