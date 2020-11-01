
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Cliente primeiroCliente = new Cliente();
		
		primeiroCliente.setNome("João Vitor");
		
		primeiraConta.setTitular(primeiroCliente);
		
		System.out.println("=============================");
		
		System.out.println(primeiraConta.getTitular().getNome());
		
		primeiraConta.getTitular().setCpf("012.000.000-00");
		primeiraConta.getTitular().setProfissao("Programador");
		
		System.out.println(primeiraConta.getTitular().getProfissao());

	}
}
