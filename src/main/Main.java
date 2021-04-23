package main;

public class Main {

	public static void main(String[] args) {
		
		Administrador adm = new Administrador("Fábio", "355264666",28383);
		adm.setSenha(222);
		Gerente gerente = new Gerente("Diogo", "7594746",8723);
		gerente.setSenha(222);
		EditorDeVideo ev = new EditorDeVideo("Rafael", "03739352", 2078);
		Designer ds = new Designer("Rodrigo", "385879", 2747);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(ev);
		controle.registra(ds);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticaUser(gerente);
		si.autenticaUser(adm);
		
	}

}
