package main;

public class Main {

	public static void main(String[] args) {
	
		Funcionario funcionario = new Funcionario("Klaiton Ricken","235893835",1223);
	
		Gerente gerente = new Gerente("Diogo", "7594746", 3488, 123);
		
		if(gerente.autentica(123))
			System.out.println("Autenticou");
		
		System.out.println("Bonificação funcionario: " + funcionario.getBonificacao());
		System.out.println("Bonificação gerente: " + gerente.bonificaca());
		
	}

}
