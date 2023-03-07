package exec.java;

public class VariavelGlobalLocal {
	/*Variavel local*/
	static int maiorIdadeGlobal = 30;
	
	
	public static void main(String[] args) {
		/* variavel local do metodo main */
		int variavellocal = 35;
		metodo2();	
	}
		public static void metodo2 () {
			System.out.println("o valor da variavel global é : " + maiorIdadeGlobal);
		
	}
	
}
