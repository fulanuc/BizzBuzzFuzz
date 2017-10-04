package br.redesprou.com.BizzBuzz;

public class Computador {
		
	public String perguntarComputador( int entrada ) {
		String resultado = "";
		
		if( entrada == 0 ) {
			resultado = "0";
		}
		else if( entrada % 3 == 0 && entrada % 5 == 0){
			resultado = "fizz buzz";
		}
		else if( entrada % 3 == 0 ){
			resultado = "fizz";
		}
		else if( entrada % 5 == 0 ){
			resultado = "buzz";
		}
		else {
			resultado = "" + entrada;
		}
		
		return resultado;
	}
}
