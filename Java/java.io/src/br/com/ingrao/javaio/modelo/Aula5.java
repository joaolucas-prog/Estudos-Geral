package br.com.ingrao.javaio.modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Aula5 {
	/*Serializa��o de Objetos no Java*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Transformando a classe String em bytes e armazenando	
//		String nome = "jo�o Lucas ";	
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

// 		lendo os arquivos em byte e transformando em classe
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String) ois.readObject();
//		System.out.println(nome);
//		ois.close();
		
		// para serializar a classe cliente temos que implementar uma interface sem metodo chamada Serializable
//		Cliente cliente = new Cliente("joao","111","garoto de programa");
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente)ois.readObject();
//		System.out.println(cliente.getNome());
//		ois.close();
		
//		Classe com heran�as
//		Para serializar uma classe com heren�a basta voc� implementar a interface na superclasse que todas as classes
//		filhas ir�o herdar essa caracteristica, al�m disse se algum atributo � uma referencia para outro objeto
//		podemos escrever antes do nome da referencia a palavra especial transient ex private String transient s
//		mas s� se voc� n�o quiser guardar a informa��o daquele objeto 
		}
		
}
