package exceções;

public class Fluxo2 {
		

		public static void main(String[] args) {

			System.out.println("Inicio da main");
			try {
			metodo1();
			/* Podemos fazer uma cadeia de catch ou separá-los pelo | */
			}catch(ArithmeticException | NullPointerException | MinhaExecao ex) {
				String msg = ex.getMessage();// mensagem da exceção
				ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exceção
				System.out.println("ArithmeticException " + msg);
			}//catch(NullPointerException ex){
//				String msg = ex.getMessage();// mensagem da exceção
//				System.out.println("NullPointerException " + msg);
//				ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exceção
//			}
			System.out.println("Fim da main");

		}

		public static void metodo1() {
			System.out.println("Inicio do metodo1");

				metodo2();

			System.out.println("fim do metodo1");
		}

		public static void metodo2() {
			System.out.println("Inicio do metodo2");
			//ArithmeticException ex = new ArithmeticException("Deu ruim boy");//criando uma exceção do tipo arithmetic
			//throw ex;//causando a exceçao
			throw new MinhaExecao("Deu ruim");// em uma linha e usando a excção criada
			//System.out.println("Fim do metodo2");
		}

}
