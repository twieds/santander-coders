package santander;

public class ContaPoupanca extends Conta{
	private final double taxaDeJuros = 0.05;
	
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}

	public void recolherJuros() {
		super.depositar(getSaldo() *  taxaDeJuros);
	}
}