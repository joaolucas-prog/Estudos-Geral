package br.com.ingrao.javaio.modelo;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Aula4 {
	public static void main(String[] args) throws Exception {
		/* Scanner "Mestre da leitura"*/

		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");//abrindo o arquivo e usando codificação UTF-8

		while (scanner.hasNextLine()) {//enquanto tiver proxima linha
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner separador =  new Scanner(linha);
			separador.useLocale(Locale.US);
			separador.useDelimiter(",");//separando o conteudo por virgula
			
			String tipoConta = separador.next();
			int agencia = separador.nextInt();
			int numero = separador.nextInt();
			String titular = separador.next();
			double saldo = separador.nextDouble();
			
			System.out.format(
					new Locale("pt","br"),//para transformar os pontos do double em virgula
					"%s - %04d-%08d, %s: %010.2f %n",// formatação
					tipoConta,agencia,numero,titular,saldo//valores
					);
			//%n pula linha
			//%s = String , %d = decimal(int) , %f ponto flutuante double
			//%08d 8 numeros caso tenha menos preenche com 0
			//010.2f 10 numeros inteiros e 2 flutuantes e nos inteiros preencher com 0 caso precise
			// para saber melhor como formatar olhar documentação
			//System.out.printl(valor1 + valor2 + valor3 + valor4 + valor5); forma noob
			
			separador.close();
//			String[] valores = linha.split(",");//separando o conteudo por virgula , usando o metodo da String
//			System.out.println(valores[3]);
		}
		scanner.close();
	}
}
