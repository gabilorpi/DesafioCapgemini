package anagrama;

import java.util.ArrayList;

public class GeradorDeAnagramas {
	
	ArrayList<String> listaAnagramasGerados= new ArrayList<String>();
	
	

public  ArrayList<String> geraListaAnagramas(String prefix, String textoDigitado) {
		
	if(textoDigitado.length() <= 1) {
		listaAnagramasGerados.add(prefix+textoDigitado);
			
		}else {
			for (int i = 0; i < textoDigitado.length(); i++) {
				String primeiraParteTexto = textoDigitado.substring(i, i + 1);/*pega a primeira letra*/
				String segundaParteTexo= textoDigitado.substring(0, i); /*pega a substring entre a primeira e a proxima*/ 
				String ultimaParteTexto = textoDigitado.substring(i + 1); 
				geraListaAnagramas(prefix + primeiraParteTexto, segundaParteTexo + ultimaParteTexto);
			}
		}
		return listaAnagramasGerados;
	}
}
