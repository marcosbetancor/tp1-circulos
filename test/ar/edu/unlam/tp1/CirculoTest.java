package ar.edu.unlam.tp1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circulo = new Circulo(2.0);
		
		Double esperado = 2.0;
		Double actual = circulo.getRadio();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);

	}
	
	@Test
	
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circulo = new Circulo(3.7);
		
		Double esperado = 3.7;
		
		Double actual = circulo.getRadio();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);

	}
	
	@Test
	
	public void crearUnCirculoConRadio5() {
		
		Circulo circulo = new Circulo(5.0);
		
		Double esperado = 5.0;
		
		Double actual = circulo.getRadio();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
	}
	
	@Test
	
	public void crearUnCirculoConRadio10Punto9() {
		
		Circulo circulo = new Circulo(10.9);
		
		Double esperado = 10.9;
		
		Double actual = circulo.getRadio();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
	}
	
	@Test
	
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
	
		Circulo circulo = new Circulo(9.8);
		
		Double esperado = 301.71;
		
		Double actual = circulo.calculaArea();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
	}
	
	@Test
	
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es615Punto73() {
		
		Circulo circulo = new Circulo(9.8);
		
		Double esperado = 61.57;
	
		Double actual = circulo.calculaPerimetro();	
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
	}
	
	@Test
	
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo circulo = new Circulo(16.6);
		
		Double esperado = 865.69; //Se modificó por un resultado más exacto
	
		Double actual = circulo.calculaArea();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);

	}
	
	@Test
	
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es865Punto67() {
	
		Circulo circulo = new Circulo(16.6);
		
		Double esperado = 104.30;

		Double actual = circulo.calculaPerimetro();
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
	
	}
}
