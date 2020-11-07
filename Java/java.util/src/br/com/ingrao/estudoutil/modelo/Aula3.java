package br.com.ingrao.estudoutil.modelo;

public class Aula3 {

	/*No java como ele é todo orientado a objetos não faz sentido existir tipos primitivos, mas existe. Mas como o java controla 
	 * isso ? Ele utiliza o autoboxing e unboxing e oque seria exatamente isso , por de baixo dos panos o JAva transforma o primi
	 * tivo em Object quando utilizado por outras classe (autoboxing) e devolve para o tipo primitivo quando indicado na variavel
	 * unboxing
	 * 
	 * metodos da classe Integer
	 * .valueOf(int i) devolve um objeto integer com valor i
	 * .valueOf(String i) transforma a String i no tipo Integer
	 * .parseInt(String i) transforma a String i no tipo int
	 * .intValue() devolve o valor do objeto na forma primitiva*/
	public static void main(String[] args) {
		Integer ref = Integer.valueOf(29);//autoboxing
		int t = ref.intValue();//unboxing;
		
		String t1 = "10";
		Integer t2 = Integer.parseInt(t1);
		System.out.println(t2);
		System.out.println(t1);
		
		
	}
}
