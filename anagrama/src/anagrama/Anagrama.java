/*
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.
*/
package anagrama;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagrama {
	
public static void main(String[] args) {
	Scanner dados=new Scanner(System.in);
	String anagrama="";
	
	System.out.print("Digite a string desejada: ");
	anagrama=dados.next();
   	dados.close();
	
   	String texto = "ovo";
    List<String> partes = new ArrayList<String>();
    for (int i = 0; i < texto.length(); i += 2) partes.add(texto.substring(i, Math.min(i + 2,texto.length())));
    for (int i = 0; i < partes.size(); i++) System.out.println(partes.get(i));
   	
   	
	//ehAnagrama(anagrama);
	
		
		
}

private static boolean ehAnagrama(String anagrama) {
	anagrama.toLowerCase();
	char[] vetorAnagrama=anagrama.toCharArray();
	 
	Arrays.sort(vetorAnagrama);
	System.out.println(vetorAnagrama);
	
	return true;
}
	
}//fim da classe anagrama