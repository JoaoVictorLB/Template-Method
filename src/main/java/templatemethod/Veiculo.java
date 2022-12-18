package main.java.templatemethod;

public abstract class Veiculo {
    private String nome;
    private String ano;
    private float notaSegurancaColisaoFrontal;
    private float notaSegurancaColisaoTraseira;
    private float notaSegurancaColisaoLateral;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getNotaSegurancaColisaoFrontal() {
        return notaSegurancaColisaoFrontal;
    }

    public void setNotaSegurancaColisaoFrontal(float notaSegurancaColisaoFrontal) {
        this.notaSegurancaColisaoFrontal = notaSegurancaColisaoFrontal;
    }

    public float getNotaSegurancaColisaoTraseira() {
        return notaSegurancaColisaoTraseira;
    }

    public void setNotaSegurancaColisaoTraseira(float notaSegurancaColisaoTraseira) {
        this.notaSegurancaColisaoTraseira = notaSegurancaColisaoTraseira;
    }

    public float getNotaSegurancaColisaoLateral() {
        return notaSegurancaColisaoLateral;
    }

    public void setNotaSegurancaColisaoLateral(float notaSegurancaColisaoLateral) {
        this.notaSegurancaColisaoLateral = notaSegurancaColisaoLateral;
    }

    public float calcularMedia() {
        return (this.notaSegurancaColisaoFrontal + this.notaSegurancaColisaoTraseira + this.notaSegurancaColisaoLateral) / 3;
    }

    public abstract String resultadoDosTestesDeSeguranca();

    public String getTipo() {
        return "Veiculo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome=" + this.nome +
                ", ano='" + this.ano + '\'' +
                ", resultado=" + this.resultadoDosTestesDeSeguranca() +
                '}';
    }
}
