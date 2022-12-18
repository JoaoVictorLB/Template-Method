package main.java.templatemethod;

public class SUV extends Veiculo {
    public String resultadoDosTestesDeSeguranca() {
        if (this.calcularMedia() >= 3.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "SUV";
    }
}
