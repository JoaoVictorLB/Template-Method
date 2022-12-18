package Test.java.templatemethod;

import main.java.templatemethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompactoTest {
    @Test
    void deveRetonarAprovado() {
        Compacto carro = new Compacto();
        carro.setNotaSegurancaColisaoFrontal(4.9f);
        carro.setNotaSegurancaColisaoLateral(5.0f);
        carro.setNotaSegurancaColisaoTraseira(5.0f);
        assertEquals("Aprovado", carro.resultadoDosTestesDeSeguranca());
    }

    @Test
    void deveRetonarReprovado() {
        Compacto carro = new Compacto();
        carro.setNotaSegurancaColisaoFrontal(3.5f);
        carro.setNotaSegurancaColisaoLateral(3.0f);
        carro.setNotaSegurancaColisaoTraseira(3.7f);
        assertEquals("Reprovado", carro.resultadoDosTestesDeSeguranca());
    }

    @Test
    void deveRetornarInformacoes() {
        Compacto carro = new Compacto();
        carro.setAno("2019");
        carro.setNome("Onix");
        carro.setNotaSegurancaColisaoFrontal(4.5f);
        carro.setNotaSegurancaColisaoLateral(5.0f);
        carro.setNotaSegurancaColisaoTraseira(4.7f);
        assertEquals("Veiculo{nome=Onix, ano='2019', resultado=Aprovado}", carro.getInfo());
    }
}
