package exce��es;

/* No Java criar uma exce��o � bastante simples , basta voc� herdar o RunTimeException e voc� criar� uma classe de exce��o*/
public class MinhaExecao extends RuntimeException {
	
	public MinhaExecao(String msg) {
		super(msg);
	}
}
