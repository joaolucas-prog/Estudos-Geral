
public class Variaveis {
	
	public static void main(String[] args) {
		
		System.out.println("olá mundo");//imprime olá mundo
		
		int idade; // criando uma variável do tipo inteiro
		idade = 37; // atribuinido valor a variável
		
		System.out.println(idade); //imprime o valor da variável idade
		
		/* operadores matemáticos funcionam para a variável do tipo int*/
		
		idade += 20; //somando 20 ao valor atual da idade , equivalente a idade = idade +20
		idade -= 20;//subtrai 20 ao valor atual da idade, equivalente a idade = idade -20
		idade *= 2; // multiplica o valor atual da idade por 2 , equivalente a idade = idade * 2
		idade /= 2; //divide o valor atual da idade por 2, equivalente a idade= idade / 2
		idade %= 37; // Retorna o resto da divisão , equivalente a idade = idade % 37
		
		System.out.println(idade);
		
		/* Podemos concatenar esse tipo int com as palavras do print*/
		
		System.out.println("idade : " + idade);
		
		double salario = 120.23; // variável para pontos flutuantes , ou numeros decimais como preferir
		 
		/* Operadores matemáticos também funcionam para a variácel do tipo double */
		
		salario += 20; //somando 20 ao valor atual do salario , equivalente a salario = salario +20
		salario -= 20;//subtrai 20 ao valor atual do salario, equivalente a salario = salario -20
		salario *= 2; // multiplica o valor atual do idade por 2 , equivalente a salario = salario * 2
		salario /= 2; //divide o valor atual do salario por 2, equivalente a salario= salario / 2
		salario %= 37; // Retorna o resto da divisão , equivalente a salario = salario % 37
		
		/* Conversão do tipo double para int , lembrando que o contrário não é necessário */
		
		double x = 23.51;
		int y = (int) x; // transformando x em int
		
		System.out.println(y + " e " + x);
		
		/* Outro tipo de variáveis numéricos*/
		
		long valorGrande = 1239129312L;
		float pontoFlutuante = 3.14f;
		short valorPequeno = 1231;
		byte b = 127;
		
		System.out.println(valorGrande +" " + valorPequeno + " " + b + " " + pontoFlutuante);
		
		/*-------------------------------------------------------------------------------------------------------*/
		// Variáveis de Caracteres
		
		char letra = 'a';//valor do caracter
		
		char valor = 66;// apesar de ser um "numero" irá retornar o character que é representado pelo numero 66
		
		char total = (char) (valor +1); // precisamos da o cast pois o 1 por padrão é do tipo int
		
		System.out.println(letra +" "+valor+" "+ total);// imprime a B C
		
		String palavra = "Alguma palavra aleatória"; // String não é uma palavra reservada , pois é um Objeto mas considere como variável
		
		System.out.println(palavra);
		
		/* Strings podem ser concatenadas com int  , mas irá juntar os numeros e não um valor equivalente igual o char
		  exemplo  somar "olá" + 33  resultará em "olá33" */
	}
}
