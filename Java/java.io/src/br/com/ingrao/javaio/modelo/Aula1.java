package br.com.ingrao.javaio.modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Aula1 {
	/*	Agora vamos trabalhar com fluxos de entrada e saida em uma aplicação*/
	public static void main(String[] args) throws IOException{
		
		//Fluxo de arquivos de entrada
		//Leitura de arquivos
		InputStream fis = new FileInputStream("lorem.txt");//Lê o arquivo de entrada
		Reader isr = new InputStreamReader(fis);//ler os arquivos do tipo FIS e transforma e sequancia de char
		BufferedReader br = new BufferedReader(isr);//ler os arquivos do tipo ISR
		
		String linha = br.readLine(); // devolve uma String que representa uma linha do arquivo
		
		while(linha != null) {			
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		
	}
}
