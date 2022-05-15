package edu.poniperro;

import edu.poniperro.Calculadora.Calculadora;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public static Calculadora calculadora;
    @BeforeClass
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    void sumaTest() {
        assertEquals(5.0, calculadora.sumar(2.0,3.0));
    }
    @Test
    void suma1Test() {
        assertEquals(5.2, calculadora.sumar(2.1,3.1));
    }

    @Test
    void restaTest() {
        assertEquals(5.0, calculadora.restar(7.0, 2.0));
    }
    @Test
    void resta1Test() {
        assertEquals(5.2, calculadora.restar(7.4, 2.2));
    }
    @Test
    void resta2Test() {
        assertEquals(-1.0, calculadora.restar(1.0, 2.0));
    }

    @Test
    void multiplicacionTest() {
        assertEquals(15.0, calculadora.multiplicar(5.0, 3.0));
    }

    @Test
    void divisionTest() {
        assertEquals(2.0, calculadora.dividir(10.0, 5.0));
    }
}
