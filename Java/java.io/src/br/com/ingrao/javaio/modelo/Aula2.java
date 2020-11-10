package br.com.ingrao.javaio.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class Aula2 {
	/* Escrita em arquivos */
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();// conexao com rede

		InputStream fis = System.in; // Recebe a escrita do teclado
		//InputStream fis = s.getInputStream(); // input da rede
		//InputStream fis = new FileInputStream("lorem.txt");// Lê o arquivo de entrada
		Reader isr = new InputStreamReader(fis);// ler os arquivos do tipo FIS e transforma e sequancia de char
		BufferedReader br = new BufferedReader(isr);// ler os arquivos do tipo ISR
		
		// Escrita de arquivos
		OutputStream fos = System.out;//Saída no console
		//OutputStream fos = s.getOutputStream();//output rede
		//OutputStream fos = new FileOutputStream("lorem2.txt");// escreve no arquivo de saida
		Writer osw = new OutputStreamWriter(fos);// escreve os arquivos do tipo
		BufferedWriter bw = new BufferedWriter(osw);// escreve os arquivos 
		

//		bw.write(
//		"Um texto aleatorio papai , é isso ai mesmo totalmente diferente não tem como saber qual será o proximo");
//		bw.newLine();// pula uma linha
//		bw.write("asjdi aisdjais apsdoap sdkj ijq wei121e ");// escreve no arquivo
//		bw.newLine();
//		bw.close();

		String linha = br.readLine(); // devolve uma String que representa uma linha do arquivo

		while (linha != null && !linha.isEmpty()){// fazendo uma Cópia dos arquivos ou escrevendo no arquivo com teclado
			bw.write(linha);
			bw.newLine();
			bw.flush();//toda vez que der enter irá aparecer no console
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}
}
