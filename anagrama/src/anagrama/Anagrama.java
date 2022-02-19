/*
# Quest�o 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o n�mero de pares de substrings que s�o anagramas.
*/
package anagrama;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrama {
	
public static void main(String[] args) {
	Scanner dados=new Scanner(System.in);
	String anagrama="";
	int controle=0;
	/*System.out.print("Digite a string desejada: ");
	anagrama=dados.next();
   	dados.close();*/
	GeradorDeAnagramas gAnagramas=new GeradorDeAnagramas();
   	String texto = "ifailuhkqq";
   	ArrayList<String> listaAnagramasPares= new ArrayList<String>();
   
   	gAnagramas.listaAnagramasGerados=gAnagramas.geraListaAnagramas("", texto);

		
   for(int i=0; i<gAnagramas.listaAnagramasGerados.size();i++) {
	   
	   String s=gAnagramas.listaAnagramasGerados.get(i);
	    String temp="";
	   for(int j=0; j<=1;j++) {
		  
		  temp+= s.valueOf(s.charAt(j));
		  
	   }
	   listaAnagramasPares.add(temp);
   }
   Set<String> set=new HashSet<>(listaAnagramasPares);
   listaAnagramasPares.clear();
   listaAnagramasPares.addAll(set);
   
   for(int i=0; i<listaAnagramasPares.size();i++) {
	   
	   System.out.println(listaAnagramasPares.get(i));
   }
   
}
}//fim da classe anagrama