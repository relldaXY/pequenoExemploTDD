import static org.junit.Assert.*;

import org.junit.Test;

import tdd.ConversorDeRomanos;

public class ConversorRomanoTest {

	@Test
	public void converteSimboloI() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("I");
		
		assertEquals(1, obtido);
	}
	
	@Test
	public void converteSimboloV() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("V");
		
		assertEquals(5, obtido);
	}
	
	@Test
	public void converteSimboloC() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("C");
		
		assertEquals(100, obtido);
	}
	
	@Test
	public void converteSimboloX() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("X");
		
		assertEquals(10, obtido);
	}
	
	@Test
	public void converteSimboloD() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("D");
		
		assertEquals(500, obtido);
	}
	
	@Test
	public void converteSimboloL() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("L");
		
		assertEquals(50, obtido);
	}
	
	@Test
	public void converteSimboloM() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("M");
		
		assertEquals(1000, obtido);
	}
	
	@Test
	public void converteSimboloII() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("II");
		
		assertEquals(2, obtido);
	}
	
	@Test
	public void converteSimboloIX() {
		ConversorDeRomanos conversor = new ConversorDeRomanos();
		int obtido = conversor.converte("IX");
		
		assertEquals(9, obtido);
	}
}
