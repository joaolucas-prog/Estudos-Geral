
public class Lacos {
	
	public static void main(String[] args) {

		int contador = 0;
		
		while (contador <=10) { 
			// o laco while repetir� seu bloco sempre que sua condi��o for verdadeira
			// sua estrutura � while ( condi��o booleana ){ bloco de c�digo }
			System.out.println(contador);
			contador += 1;
		}
		
		
		for (int contador2 = 0 ; contador2 <= 10 ; contador2++) {
			//o la�o for repetir� seu bloco sempre que a condi��o booleana do meio for verdadeira
			//sua estrutura � for (condi��o inicial ; condi��o de repeti��o ; incremento){ bloco de c�digo}
			
			System.out.println(contador2 + "-");
		}
		
		/* Os la�os podem ser encadeados */
		
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
