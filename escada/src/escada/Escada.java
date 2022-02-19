/*
# Questao 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
e espacos. A base e altura da escada devem ser iguais ao valor de n. A ultima linha nao deve conter
nenhum espaco.
*/
package escada;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Escada {

public static void main(String[] args) {

	    int numeroLido=0;
	    String degrauEscada="*";
		Scanner dados=new Scanner(System.in);

	     try{
	     	  	System.out.print("Digite um numero inteiro: ");
	       	  	numeroLido=dados.nextInt();
	       	  	dados.close();
	        	  	
	         }catch (InputMismatchException ime){
	           	System.out.println("O valor digitado e invalido, por favor comece novamente."); 	
	           	return;
	      }
 
	     for(int numeroDegrau=1; numeroDegrau<=numeroLido;numeroDegrau++) {
			
	    	 imprimeDegrau(numeroDegrau,numeroLido,degrauEscada);
	    	 System.out.print("\n");
	}
}	
	

private static void imprimeDegrau(int numeroDegrau, int numeroLido,String degrauEscada) {
	
	/*a Quantidade de  espaços e dado pela diferenca entre o numero lido(tamanho da escada) e o degrau atual*/
		int espacoDegrau=numeroLido-numeroDegrau; 
		
		for(int i=0;i<numeroDegrau;i++){
			
			if(i==0) { /*so coloca os espacos se for a primeira iteracao*/
				for(int j=0;j<espacoDegrau;j++) {
					System.out.print(" ");	 /*imprime o espaco entre a base e o degrau*/	
				}
		}
		 System.out.print(degrauEscada); /*imprime o dregrau da escada armazenado em degrauEscada*/	
		 
	}
} //fim do imprimeDegrau		
}//fim da classe escada