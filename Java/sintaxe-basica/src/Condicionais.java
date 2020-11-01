
public class Condicionais {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		/* comparador l�gicos 
		 == , igual
		 != , diferente
		  < , menor
		  > , maior
		 <= , menor ou igual
		 >= , maior ou igual
		 
		 opera��es l�gicas
		 || , ou (or)
		 && , e  (and)
		 
		 vari�veis l�gicos
		 boolean = true;
		 boolean = false;
		*/
		
		int idade = 20;
		int quantidade = 3;
		
		if( idade >= 18 || quantidade >= 2 ) {
			// condicional if , ele verifica condi��o booleana passada como argumento , se for verdadeira ela entra no seu bloco
			// sua estrutura � if( condi��o booleana){ bloco de c�digo }
			System.out.println("Voc� pode passar");
		} else {
			System.out.println("Voc� n�o pode passar");
		}
		
		/* Uma observa��o , quandi voc� cria uma vari�vel ela s� existe no seu escopo , por exemplo se criar uma
		 * vari�vel dentro do condicional ela s� existe em seu bloco*/
	}
}
