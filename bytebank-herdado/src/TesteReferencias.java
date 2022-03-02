
public class TesteReferencias {

	public static void main(String[] args) {
		
		// pra que fazer isso?
		// Gerente g1 = Funcionario(); // - erro, nem todo funcionario e um gerente
		
		/*1*/Gerente g1 = new Gerente(); // - ok
		// /*2*/ Funcionario g1 = new Gerente(); // - gerente e um funcionario
		
		
		g1.setNome("Marcos");
		String nome = g1.getNome();
		
		//g1.autentica(2222); - o compilador so olha no tipo da referencia (so serve se vc usar o polimorfismo, tipo 2)
		
		System.out.println(nome);
		
	}
	
}
