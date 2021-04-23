package main;

public class SistemaInterno {

	private int senha = 222;
	
	public void autenticaUser(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if(autenticou) {
			System.out.println("Autenticou no sistema.");
		}else {
			System.out.println("Acesso negado.");
		}
	}
	
}
