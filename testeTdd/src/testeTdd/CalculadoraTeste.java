package testeTdd;

import JUnit.framework.*;

public class CalculadoraTeste {

	@Test
    public void testSomar() {
		Calculadora calculadora = new Calculadora();
        int result = calculadora.somar(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testSubtrair() {
    	Calculadora calculadora = new Calculadora();
        int result = calculadora.subtrair(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testeMultiplicar() {
    	Calculadora calculadora = new Calculadora();
        int result = calculadora.multiplicar(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDividir() {
    	Calculadora calculadora = new Calculadora();
        int result = calculadora.dividir(8, 2);
        assertEquals(4, result);
    }

    @Test
    public void testeDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.dividir(10, 0);
        });
    }
		
}

