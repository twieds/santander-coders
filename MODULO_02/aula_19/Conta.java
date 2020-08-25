package santander;

public class Conta {
	private Cliente cliente;
	private Double saldo;

	public Conta() {	};
	
	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if (saldo - valor >= 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Você não possui saldo suficiente.");
		}		
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	
	
	

}
