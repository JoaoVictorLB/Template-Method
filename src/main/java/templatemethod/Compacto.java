package main.java.templatemethod;

public class Compacto extends Veiculo {
    public String resultadoDosTestesDeSeguranca() {
        if (this.calcularMedia() >= 4.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
