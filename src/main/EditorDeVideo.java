package main;

public class EditorDeVideo extends Funcionario{

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonifica��o editor");
		return 100;
	}

}
