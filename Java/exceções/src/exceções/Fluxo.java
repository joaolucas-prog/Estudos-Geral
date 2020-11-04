package exce��es;

public class Fluxo {

	/*
	 * uma exce��o no c�digo pode parar seu funcionamento , tendo vista que seu
	 * c�digo est� no ar voc� n�o quer que ele trave e pare de funcionar caso
	 * aconte�a algum erro interno . Para isso podemos tratar esses casos de
	 * exce��es que podem ocorrer durante a execu��o do c�digo. Para isso podemos
	 * utilizar os comandos try/catch que o compilador ir� tentar executar oque est�
	 * no try , caso ocorra uma exce��o ele corre para o fluxo de catch daquela
	 * exce��o seja ela generica ou especifica, e o programador pode definir oque
	 * ocorrer� quando aquela ece��o for encontrada
	 */

	public static void main(String[] args) {

		System.out.println("Inicio da main");
		try {
		metodo1();
		}catch(ArithmeticException ex) {	
			String msg = ex.getMessage();// mensagem da exce��o
			ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exce��o
			System.out.println("ArithmeticException " + msg);
		}
		System.out.println("Fim da main");
//		a saida do programa ser�
//		Inicio da main
//		Inicio do metodo1
//		Inicio do metodo2
//		0
//		ArithmeticException
//		Fim da main
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo1");
//		try {
			metodo2();
//		} catch (ArithmeticException ex) {
//			System.out.println("ArithmeticException");
//		}
//			a saida do programa ser�
//			Inicio da main
//			Inicio do metodo1
//			Inicio do metodo2
//			0
//			ArithmeticException
//			fim do metodo1
//			Fim da main

		System.out.println("fim do metodo1");
	}

	public static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			// try {
			int a = 2 / 0;
			// }catch(ArithmeticException ex) {
//				System.out.println("ArithmeticException");			    
//				a saida do programa ser�
//				Inicio da main
//				Inicio do metodo1
//				Inicio do metodo2
//				0
//				ArithmeticException
//				1
//				ArithmeticException
//				2
//				ArithmeticException
//				3
//				ArithmeticException
//				4
//				ArithmeticException
//				Fim do metodo2
//				fim do metodo1
//				Fim da main
			// }
		}
		System.out.println("Fim do metodo2");
	}
}
