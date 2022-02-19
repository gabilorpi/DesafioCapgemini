/*
# Questao 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o numero de pares de substrings que sao anagramas.
*/
package anagrama;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrama {
	
public static void main(String[] args) throws Exception {
	Scanner dados=new Scanner(System.in);
	System.out.print("Digite a string desejada: ");
	String texto = dados.nextLine();
	dados.close();
	
	if(texto.length() < 2) { // Caso a string seja menor do que dois, lança a exceção.
		throw new Exception("Não existe anagramas com somente um caracter.");
		
	}
	GeradorDeAnagramas gAnagramas=new GeradorDeAnagramas();
   	ArrayList<String> listaAnagramasPares= new ArrayList<String>();
   
   	gAnagramas.listaAnagramasGerados=gAnagramas.geraListaAnagramas("", texto);

		
   for(int i = 0; i < gAnagramas.listaAnagramasGerados.size(); i++) { // Separa os pares do anagrama e adiciona ao arraylist
	   
	   String s = gAnagramas.listaAnagramasGerados.get(i);
	   String temp = "";
	   
	   for(int j=0; j<=1;j++) {
		  temp += s.valueOf(s.charAt(j));
	   }
	   
	   listaAnagramasPares.add(temp);
   }
   
	   Set<String> set=new HashSet<>(listaAnagramasPares); // Cria uma coleção para tratar os pares duplicados
	   listaAnagramasPares.clear();
	   listaAnagramasPares.addAll(set);
	   
	   System.out.println("a quantidades de pares é: " + listaAnagramasPares.size());
	   
	}
}	//fim da classe anagrama
