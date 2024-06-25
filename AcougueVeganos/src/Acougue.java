import java.util.ArrayList;
import java.util.List;
//Criação da classe açougue
public class Acougue {
    private String nome;
    private String endereco;
    private Gerente gerente;
    private List<Carne> carnes;

    //Método construtor:
    public Acougue(String nome, String endereco, Gerente gerente) {
        this.nome = nome;
        this.endereco = endereco;
        this.gerente = gerente;
        carnes = new ArrayList<Carne>();
    }
    //Adicionar carne
    public void addCarne(Carne carne) {
        carnes.add(carne);
    }
    //Remover carne
    public void rmvCarne(Carne carne) {
        carnes.remove(carne);
    }
    //Getter e Setters
    public List<Carne> getCarnes() {
        return carnes;
    }
    public void setCarnes(List<Carne> carnes) {
        this.carnes = carnes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    //Listar carnes:
    public List<Carne> listarCarnes(){
        return new ArrayList<>(carnes);
    }
    //Pesar carnes:
    public double pesarCarne() {
        double pesoTotal = 0;
        for (Carne carne : carnes) {
            pesoTotal += carne.getPeso();
        }
        return pesoTotal;
    }

    //Calcular preço:
    public double calcPreco(){
        double precoTotal = 0;
        for (Carne carne : carnes) {
            precoTotal += carne.getPeso() * carne.getPrecoPorKg();
        }
        return precoTotal;
    }
}