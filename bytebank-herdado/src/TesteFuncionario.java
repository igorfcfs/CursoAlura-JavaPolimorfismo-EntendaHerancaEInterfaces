
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario(/*"Nico Steppat", "223355646-9", 2600.0*/);
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
