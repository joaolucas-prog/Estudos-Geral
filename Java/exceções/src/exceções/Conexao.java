package exceções;

public class Conexao implements AutoCloseable {//permite fazer um try com resources "argumentos" para não precisar fazer um finally
	//para fechar a conexão 

	public Conexao() {
		System.out.println("iniciando conexão");
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
