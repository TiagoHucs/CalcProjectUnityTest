package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void somar() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.somar(1.2,2.3);
        assertEquals(3.5,result,0);
    }

    @Test
    public void subtrair() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.subtrair(5.8,4.7);
        assertEquals(1.1,result,0);
    }
}