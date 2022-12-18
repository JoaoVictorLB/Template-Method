package Test.java.templatemethod;

import main.java.templatemethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSUV {
    @Test
    void deveRetonarAprovado() {
        SUV carro = new SUV();
        carro.setNotaSegurancaColisaoFrontal(4.5f);
        carro.setNotaSegurancaColisaoLateral(5.0f);
        carro.setNotaSegurancaColisaoTraseira(4.7f);
        assertEquals("Aprovado", carro.resultadoDosTestesDeSeguranca());
    }

    @Test
    void deveRetonarReprovado() {
        SUV carro = new SUV();
        carro.setNotaSegurancaColisaoFrontal(2.5f);
        carro.setNotaSegurancaColisaoLateral(3.0f);
        carro.setNotaSegurancaColisaoTraseira(2.7f);
        assertEquals("Reprovado", carro.resultadoDosTestesDeSeguranca());
    }

    @Test
    void deveRetornarInformacoes() {
        SUV carro = new SUV();
        carro.setAno("2019");
        carro.setNome("Creta Sport");
        carro.setNotaSegurancaColisaoFrontal(4.5f);
        carro.setNotaSegurancaColisaoLateral(5.0f);
        carro.setNotaSegurancaColisaoTraseira(4.7f);
        assertEquals("SUV{nome=Creta Sport, ano='2019', resultado=Aprovado}", carro.getInfo());
    }
}
