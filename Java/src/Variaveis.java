
public class Variaveis {
	
	public static void main(String[] args) {
		
		System.out.println("ol� mundo");//imprime ol� mundo
		
		int idade; // criando uma vari�vel do tipo inteiro
		idade = 37;
		
		System.out.println(idade); //imprime o valor da vari�vel idade
		
		/* operadores matem�ticos funcionam para a vari�vel do tipo int*/
		
		idade += 20; //somando 20 ao valor atual da idade , equivalente a idade = idade +20
		idade -= 20;//subtrai 20 ao valor atual da idade, equivalente a idade = idade -20
		idade *= 2; // multiplica o valor atual da idade por 2 , equivalente a idade = idade * 2
		idade /= 2; //divide o valor atual da idade por 2, equivalente a idade= idade / 2
		idade %= 37; // Retorna o resto da divis�o , equivalente a idade = idade % 37
		
		System.out.println(idade);
		
		/* Podemos concatenar esse tipo int com as palavras do print*/
		
		System.out.println("idade : " + idade);
		
		
	}
}
