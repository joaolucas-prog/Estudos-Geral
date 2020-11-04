package exceçõesProjeto;

public class Main {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);
		cc.saca(98);
		
		System.out.println(cc.getSaldo());
		
		

	}

}
