package main;

public class Designer extends Funcionario{

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonifica��o designer");
		return 200;
	}

}
