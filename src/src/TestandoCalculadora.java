import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestandoCalculadora {
    @Test
    public void SomandoDoisNumeros(){
        Calculadora calculadora  = new Calculadora();
        double soma = calculadora.Somar(20,30);
        System.out.println(soma);
        Assertions.assertEquals(50,soma);
    }
    @Test
    public void MultiplicandoDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        double multiplicacao= calculadora.Multiplicar(2.5,10.0);
        System.out.println(multiplicacao);
        Assertions.assertEquals(25.0,multiplicacao);
    }

}