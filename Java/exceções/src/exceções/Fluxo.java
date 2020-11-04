package exceções;

public class Fluxo {

	/*
	 * uma exceção no código pode parar seu funcionamento , tendo vista que seu
	 * código está no ar você não quer que ele trave e pare de funcionar caso
	 * aconteça algum erro interno . Para isso podemos tratar esses casos de
	 * exceções que podem ocorrer durante a execução do código. Para isso podemos
	 * utilizar os comandos try/catch que o compilador irá tentar executar oque está
	 * no try , caso ocorra uma exceção ele corre para o fluxo de catch daquela
	 * exceção seja ela generica ou especifica, e o programador pode definir oque
	 * ocorrerá quando aquela eceção for encontrada
	 */

	public static void main(String[] args) {

		System.out.println("Inicio da main");
		try {
		metodo1();
		}catch(ArithmeticException ex) {	
			String msg = ex.getMessage();// mensagem da exceção
			ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exceção
			System.out.println("ArithmeticException " + msg);
		}
		System.out.println("Fim da main");
//		a saida do programa será
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
//			a saida do programa será
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
//				a saida do programa será
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
