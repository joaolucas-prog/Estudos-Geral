package exceções;

public class Main {
	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			ex.printStackTrace();;
		}
	}
}
