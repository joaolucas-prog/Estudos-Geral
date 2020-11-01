
public class Condicionais {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		/* comparador lógicos 
		 == , igual
		 != , diferente
		  < , menor
		  > , maior
		 <= , menor ou igual
		 >= , maior ou igual
		 
		 operações lógicas
		 || , ou (or)
		 && , e  (and)
		 
		 variáveis lógicos
		 boolean = true;
		 boolean = false;
		*/
		
		int idade = 20;
		int quantidade = 3;
		
		if( idade >= 18 || quantidade >= 2 ) {
			// condicional if , ele verifica condição booleana passada como argumento , se for verdadeira ela entra no seu bloco
			// sua estrutura é if( condição booleana){ bloco de código }
			System.out.println("Você pode passar");
		} else {
			System.out.println("Você não pode passar");
		}
		
		/* Uma observação , quandi você cria uma variável ela só existe no seu escopo , por exemplo se criar uma
		 * variável dentro do condicional ela só existe em seu bloco*/
	}
}
