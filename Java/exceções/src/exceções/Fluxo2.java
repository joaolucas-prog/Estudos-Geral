package exce��es;

public class Fluxo2 {
		

		public static void main(String[] args) {

			System.out.println("Inicio da main");
			try {
			metodo1();
			/* Podemos fazer uma cadeia de catch ou separ�-los pelo | */
			}catch(ArithmeticException | NullPointerException | MinhaExecao ex) {
				String msg = ex.getMessage();// mensagem da exce��o
				ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exce��o
				System.out.println("ArithmeticException " + msg);
			}//catch(NullPointerException ex){
//				String msg = ex.getMessage();// mensagem da exce��o
//				System.out.println("NullPointerException " + msg);
//				ex.printStackTrace();// imprime o rastro do fluxo que ocorreu a exce��o
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
			//ArithmeticException ex = new ArithmeticException("Deu ruim boy");//criando uma exce��o do tipo arithmetic
			//throw ex;//causando a exce�ao
			throw new MinhaExecao("Deu ruim");// em uma linha e usando a exc��o criada
			//System.out.println("Fim do metodo2");
		}

}
