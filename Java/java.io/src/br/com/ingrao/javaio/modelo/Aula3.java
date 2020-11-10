package br.com.ingrao.javaio.modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aula3 {
	public static void main(String[] args) throws IOException {
		/* O Java possui uma classe especial para escrita de arquivos FileWrite, porem ainda recomendo utilizar o bufferedwriter*/
//		FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write(
//				"Um texto aleatorio papai , é isso ai mesmo totalmente diferente não tem como saber qual será o proximo");
//		fw.write(System.lineSeparator());// pula uma linha
//		fw.write("asjdi aisdjais apsdoap sdkj ijq wei121e ");// escreve no arquivo
//		fw.write(System.lineSeparator());
//		fw.close();
		
		/*PrintStream uma forma de mais alto nivel de fazer uma escrita de arquivos*/
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		/*PrintWriter mesma coisa do printWriter só que surgiu depois quando o java introduzio os writers*/
		
		PrintWriter ps = new PrintWriter("lorem2.txt","UTF-8");//gravando no enconding utf-8
		
		ps.println("Um texto aleatorio papai , é isso ai mesmo totalmente diferente não tem como saber qual será o proximo");
		ps.println();
		ps.println("asjdi aisdjais apsdoap sdkj ijq wei121e aaaaaaaaaaa");
		ps.close();
	}
}
