class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; //Atributos est�tico 

	//Construtor vazio igual padr�o criado pelo Java
	public Conta () {
		
	}
	
	//Construtor com atributos os quais s�o utilizados junto com a cria��o de novo objeto
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	//M�todos - Getters e Setters 
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valorTransferido, Conta contaDestino) {
		if (this.saldo >= valorTransferido) {
			this.saldo -= valorTransferido;
			contaDestino.deposita(valorTransferido);
			return true;
		}
		return false;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	//Exemplo de m�todo est�tico.
	public static int getTotal() {
		return Conta.total;
	}
	
}