package exceções;

/* No Java criar uma exceção é bastante simples , basta você herdar o RunTimeException e você criará uma classe de exceção*/
public class MinhaExecao extends RuntimeException {
	
	public MinhaExecao(String msg) {
		super(msg);
	}
}
