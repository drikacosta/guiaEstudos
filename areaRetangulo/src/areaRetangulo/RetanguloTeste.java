package areaRetangulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
	
	@Test
	public void testeCalcularArea() {
		Retangulo retangulo = new Retangulo(5, 10);
		assertEquals(50, retangulo.calcularArea(), 0.001);
	}

}
