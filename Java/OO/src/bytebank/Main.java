package bytebank;

public class Main {
	
	public static void main(String[] args) {
		/* Ao definiruma classe em java podemos criar um objeto e junto a esse objeto uma referencia ao mesmo
		 * sua estrutura básica é "tipoObjeto nome_referencia = new tipoObjeto();" o java irá instanciar um objeto 
		 * do tipo tipoObjeto e a variável nome_referencia irá ser uma referência ao objeto e não um Objeto
		 * propriamente digo , ou seja se você cria uma nova referência "tipoObjeto nova_referencia = nome_referencia"
		 * e atribui o valor de outra referencia , ambas as referencias apontam para o mesmo objeto e caso mude o valor
		 * em um , ambos as referências recebem aquela alteração. Então cuidado ao igualar referências pois eles guardam
		 * o mesmo valor da memória em que o objeto foi criado e não criam novos objetos. Para criar um novo objeto
		 * devemos fazer um novo instanciamento "tipoObjeto nova_referência = new tipoObjeto()" .*/
		
		Cliente joao = new Cliente();// instanciando um Cliente
		joao.cpf="000.000.000-00"; // atribuindo valor aos atributos
		joao.nome="João Lucas";
		joao.profissao = "programador";
		

		Conta contaJoao = new Conta(133,222222);// instanciando uma Conta
		contaJoao.setTitular(joao);//associando o titular ao cliente 
		
	}
}
