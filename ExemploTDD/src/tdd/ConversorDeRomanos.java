package tdd;

import java.util.HashMap;

public class ConversorDeRomanos {
	
	
	
	private static HashMap<Character, Integer> tabela = new HashMap<Character, Integer>(){{
	put('I', 1);
	put('V', 5);
	put('X', 10);
	put('L', 50);
	put('C', 100);
	put('D', 500);
	put('M', 1000);	
	}};
	
	
	public int converte(String numeroRomano){
		//return tabela.get(numeroRomano);
		int acumulador = 0;
		int iteracoes = numeroRomano.length(); 
		
		for(int i = 0; i< iteracoes; i++)
			acumulador += tabela.get(numeroRomano.charAt(i));
		
		return acumulador;
	}
}
