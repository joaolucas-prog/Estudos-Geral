package exce��es;

public class Conexao implements AutoCloseable {//permite fazer um try com resources "argumentos" para n�o precisar fazer um finally
	//para fechar a conex�o 

	public Conexao() {
		System.out.println("iniciando conex�o");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException("Poxa crush deu ruim");
		//System.out.println("Dados lidos");
	}
	
	public void close() {
		System.out.println("fechando conexao");
	}
}
