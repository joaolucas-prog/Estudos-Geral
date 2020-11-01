
public class Lacos {
	
	public static void main(String[] args) {

		int contador = 0;
		
		while (contador <=10) { 
			// o laco while repetirá seu bloco sempre que sua condição for verdadeira
			// sua estrutura é while ( condição booleana ){ bloco de código }
			System.out.println(contador);
			contador += 1;
		}
		
		
		for (int contador2 = 0 ; contador2 <= 10 ; contador2++) {
			//o laço for repetirá seu bloco sempre que a condição booleana do meio for verdadeira
			//sua estrutura é for (condição inicial ; condição de repetição ; incremento){ bloco de código}
			
			System.out.println(contador2 + "-");
		}
		
		/* Os laços podem ser encadeados */
		
		for (int i = 0 ; i < 10 ; i ++) {// triangulo retangulo
			for (int j = 1 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < 10 ; i ++) { // quadrado
			for (int j = 1 ; j < 10 ; j++) {
				System.out.print("O");
			}
			System.out.println();
		}
		// podemos interroper um bloco utilizando o break;
		
		for (int i = 1 ; i < 10 ; i ++) {
			for (int j = 1 ; j < i ; j++) {
				System.out.print("@");
				if ( j > 2) {
					break;
				}
			}
			System.out.println();
		}
		
	}

}
