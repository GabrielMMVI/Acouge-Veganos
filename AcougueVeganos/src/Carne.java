public class Carne {
    private String corte;
    private String tipo;
    private double peso;
    private double precoPorKg;
    // Método construtor
    public Carne(String corte, String tipo, double peso, double precoPorKg) {
        this.corte = corte;
        this.tipo = tipo;
        this.peso = peso;
        this.precoPorKg = precoPorKg;
    }
    //Getters e Setters
    public String getCorte() {
        return corte;
    }
    public void setCorte(String corte) {
        this.corte = corte;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecoPorKg() {
        return precoPorKg;
    }
    public void setPrecoPorKg(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }
}
