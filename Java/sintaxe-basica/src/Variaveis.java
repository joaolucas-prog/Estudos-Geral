
public class Variaveis {
	
	public static void main(String[] args) {
		
		System.out.println("ol� mundo");//imprime ol� mundo
		
		int idade; // criando uma vari�vel do tipo inteiro
		idade = 37; // atribuinido valor a vari�vel
		
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
		
		double salario = 120.23; // vari�vel para pontos flutuantes , ou numeros decimais como preferir
		 
		/* Operadores matem�ticos tamb�m funcionam para a vari�cel do tipo double */
		
		salario += 20; //somando 20 ao valor atual do salario , equivalente a salario = salario +20
		salario -= 20;//subtrai 20 ao valor atual do salario, equivalente a salario = salario -20
		salario *= 2; // multiplica o valor atual do idade por 2 , equivalente a salario = salario * 2
		salario /= 2; //divide o valor atual do salario por 2, equivalente a salario= salario / 2
		salario %= 37; // Retorna o resto da divis�o , equivalente a salario = salario % 37
		
		/* Convers�o do tipo double para int , lembrando que o contr�rio n�o � necess�rio */
		
		double x = 23.51;
		int y = (int) x; // transformando x em int
		
		System.out.println(y + " e " + x);
		
		/* Outro tipo de vari�veis num�ricos*/
		
		long valorGrande = 1239129312L;
		float pontoFlutuante = 3.14f;
		short valorPequeno = 1231;
		byte b = 127;
		
		System.out.println(valorGrande +" " + valorPequeno + " " + b + " " + pontoFlutuante);
		
		/*-------------------------------------------------------------------------------------------------------*/
		// Vari�veis de Caracteres
		
		char letra = 'a';//valor do caracter
		
		char valor = 66;// apesar de ser um "numero" ir� retornar o character que � representado pelo numero 66
		
		char total = (char) (valor +1); // precisamos da o cast pois o 1 por padr�o � do tipo int
		
		System.out.println(letra +" "+valor+" "+ total);// imprime a B C
		
		String palavra = "Alguma palavra aleat�ria"; // String n�o � uma palavra reservada , pois � um Objeto mas considere como vari�vel
		
		System.out.println(palavra);
		
		/* Strings podem ser concatenadas com int  , mas ir� juntar os numeros e n�o um valor equivalente igual o char
		  exemplo  somar "ol�" + 33  resultar� em "ol�33" */
	}
}
