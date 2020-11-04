package Herança;
/* Uma interface é como se fosse um contrato que a classe faz , e que esse contrado eu devo implementar todos os metodos da interface
 * sendo que a interface é abstrata e não pode ser instanciada junto com seus métodos. A vantagem nisso é que a interface vira um 
 * tipo generico e eu consigo fazer o polimorfismo com ela*/
public interface Autenticavel {
	
	public abstract void setSenha( int senha);
	
	public abstract boolean autentica(int senha);
}
