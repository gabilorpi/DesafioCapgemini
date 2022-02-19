/*Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
● Possui no mínimo 6 caracteres.
● Contém no mínimo 1 digito.
● Contém no mínimo 1 letra em minúsculo.
● Contém no mínimo 1 letra em maiúsculo.
● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
 */
package senhaSegura;
import java.util.ArrayList;
import java.util.Scanner;


public class Senha {

	public static void main(String[] args) {
			Scanner dados=new Scanner(System.in);
			String senha="";
			int numeroExigidoCaracteresSenha=6;
			ArrayList<String> mensagensAvisoUsuario= new ArrayList<String>();
	     	
			System.out.print("Digite sua senha:");
	       	senha=dados.next();
	       	dados.close();
	       	
	     	       
	       	if(contaCaracteresSenha(senha)<numeroExigidoCaracteresSenha) {
	       		mensagensAvisoUsuario.add("");    		
     	   	}
                  	 
	        if(!verificaExisteCaracterEspecial(senha)) {
	        	  mensagensAvisoUsuario.add("Contendo (01) um caractere especial.");	  
       	   	}
       	  	
       	 	if(!verificaExisteLetraMinuscula(senha)) {
       	 		  mensagensAvisoUsuario.add("Contendo (01) uma letra minúscula.");
       	   	}
       	    	
       	 	if(!verificaExisteLetraMaiuscula(senha)) {
       	 		mensagensAvisoUsuario.add("Contendo (01) uma letra maiúscula.");
   	    	}
       	 	
       	 	if(!verificaExisteNumero(senha)) {
       	 		mensagensAvisoUsuario.add("Contendo (01) um número.");
   	    	}

       	 	if(mensagensAvisoUsuario.size() > 0) {
       	 	
       	 		if(senha.length()<numeroExigidoCaracteresSenha) {
       	 			System.err.println("\nSua senha tem " + senha.length() + " caracteres ela deve ter no mínimo 6 caracteres.");	
       	 			
       	 		} else {
       	 			System.err.println("\nVocê precisa modificar sua senha adicionando pelo menos "+mensagensAvisoUsuario.size()+" caracteres seguindo os critérios:");	
       	 		}
       	 		
       	 		 for(int i=0;i<mensagensAvisoUsuario.size();i++) {
       	 			System.out.println(mensagensAvisoUsuario.get(i));
       	 		}
       	 		
       	 	
       	 	} else {
       	 		System.out.println("Sua senha atende aos requisitos e é segura!");
       	 	}
}
	
	private static int contaCaracteresSenha(String senha) {
		
		return senha.length(); 
	}
	
	private static boolean verificaExisteCaracterEspecial(String senha) {
	 
	 boolean existeCaracterEspecial=false;
	 char[] caracteresEspeciais = {'#','@','!','$','%','^','&','(',')','-','+','*'}; //vetor contendo o alfabeto para buscar
	  for(int i=0; i<senha.length(); i++) {  // executo a iteração sobre a string Senha que contém o valor digitado pelo usuário
     
          char caracterEspecial = senha.charAt(i); // Sepraro o caractere na posição i do vetor para comparação 
          for(int j=0; j<caracteresEspeciais.length; j++) {
       
              if(caracteresEspeciais[j] == caracterEspecial) {	// comparo para verificar se o caractere selecionado é um caractere especial
            	  existeCaracterEspecial=true;      			//se achar algum caractere especial, existeCaracterEspecial recebe verdadeiro
              }
          }  
	  }
	  return existeCaracterEspecial;	//retorno o boolean com o resultado verdadeiro se contem caracter especial e falso caso contrário
	}								   // fim do verificaExisteCaracterEspecial
 
	private static boolean verificaExisteNumero(String senha) { 
 
	boolean existeNumero=false;
	char[] numeros= {'0','1','2','3','4','5','6','7','8','9'};
	for(int i=0; i<senha.length(); i++)	{
		char strNumero = senha.charAt(i);
        for(int j=0; j<numeros.length; j++) {
       
            if(numeros[j] == strNumero) {
            	existeNumero=true;      
            }
        }  
    }
	return existeNumero;
}	//fim do verificaExisteNumero

	private static boolean verificaExisteLetraMinuscula(String senha) { 

	boolean existeLetra=false;
	char[] letras= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	for(int i=0; i<senha.length(); i++)	{
	   char letra = senha.charAt(i);
       for(int j=0; j<letras.length; j++) {
           if(letras[j] == letra) {
        	   existeLetra=true;      
           }
       }  
    }
		return existeLetra;
   }		//Fim do verificaExisteLetraMinuscula

	private static boolean verificaExisteLetraMaiuscula(String senha) { 
	
	boolean existeLetraMaiscula=false;
    char[] letras= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    for(int i=0; i<senha.length(); i++) {
    	char letra = senha.charAt(i);
    	for(int j=0; j<letras.length; j++) {
    		if(letras[j] == letra) {
    			existeLetraMaiscula=true;      
    		}
    	}  
    }
    	return existeLetraMaiscula;
	}		//fim do verificaExisteLetraMaiuscula 

 }			//fim da classe senha
