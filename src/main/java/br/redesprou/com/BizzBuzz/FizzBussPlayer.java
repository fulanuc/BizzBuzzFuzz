package br.redesprou.com.BizzBuzz;

public class FizzBussPlayer {
	public static void main(String[] args ) {
		Computador computador = new Computador();
		
		int[] numeros = new int[200];
		
		for(int i = 1; i < 200; i++ ) {
			System.out.println(computador.perguntarComputador(i));
		}
	}
}
