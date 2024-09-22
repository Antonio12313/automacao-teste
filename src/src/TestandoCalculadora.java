import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestandoCalculadora {

    @Test
    public void SomandoDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.Somar(20, 30);
        System.out.println(soma);
        assertEquals(50.0, soma, 0.0001);
    }

    @Test
    public void MultiplicandoDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double multiplicacao = calculadora.Multiplicar(2.5, 10.0);
        System.out.println(multiplicacao);
        assertEquals(25.0, multiplicacao, 0.0001);
    }
}
