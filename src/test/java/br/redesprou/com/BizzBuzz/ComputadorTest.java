package br.redesprou.com.BizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputadorTest {

	@Test
	public void testNegativo() {
		Computador computador = new Computador();
		
		assertEquals("-1", computador.perguntarComputador(-1));
	}
	
	@Test
	public void testZero() {
		Computador computador = new Computador();
		
		assertEquals("0", computador.perguntarComputador(0));
	}
	
	@Test
	public void testNumeroComum() {
		Computador computador = new Computador();
		
		assertEquals("1", computador.perguntarComputador(1));
	}
	
	@Test
	public void testNumeroFizz() {
		Computador computador = new Computador();
		
		assertEquals("fizz", computador.perguntarComputador(3));
	}
	
	@Test
	public void testNumeroBuzz() {
		Computador computador = new Computador();
		
		assertEquals("buzz", computador.perguntarComputador(5));
	}
	
	@Test
	public void testNumeroFizzBuzz() {
		Computador computador = new Computador();
		
		assertEquals("fizz buzz", computador.perguntarComputador(15));
	}
}
