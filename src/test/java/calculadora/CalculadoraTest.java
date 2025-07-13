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
        double result = calculadora.subtrair(10,7);
        assertEquals(3,result,0);
    }
}