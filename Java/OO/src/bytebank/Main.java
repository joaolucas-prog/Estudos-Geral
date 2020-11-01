package bytebank;

public class Main {
	
	public static void main(String[] args) {
		/* Ao definiruma classe em java podemos criar um objeto e junto a esse objeto uma referencia ao mesmo
		 * sua estrutura b�sica � "tipoObjeto nome_referencia = new tipoObjeto();" o java ir� instanciar um objeto 
		 * do tipo tipoObjeto e a vari�vel nome_referencia ir� ser uma refer�ncia ao objeto e n�o um Objeto
		 * propriamente digo , ou seja se voc� cria uma nova refer�ncia "tipoObjeto nova_referencia = nome_referencia"
		 * e atribui o valor de outra referencia , ambas as referencias apontam para o mesmo objeto e caso mude o valor
		 * em um , ambos as refer�ncias recebem aquela altera��o. Ent�o cuidado ao igualar refer�ncias pois eles guardam
		 * o mesmo valor da mem�ria em que o objeto foi criado e n�o criam novos objetos. Para criar um novo objeto
		 * devemos fazer um novo instanciamento "tipoObjeto nova_refer�ncia = new tipoObjeto()" .*/
		
		Cliente joao = new Cliente();// instanciando um Cliente
		joao.cpf="000.000.000-00"; // atribuindo valor aos atributos
		joao.nome="Jo�o Lucas";
		joao.profissao = "programador";
		

		Conta contaJoao = new Conta(133,222222);// instanciando uma Conta
		contaJoao.setTitular(joao);//associando o titular ao cliente 
		
	}
}
