package santander;

public class ContaCorrente extends Conta {
	private Double limiteChequeEspecial = 200.0;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}

	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}

	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;

		if (limite + limiteChequeEspecial >= 0) {
			super.sacar(valor);
			
			if (limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial - limite;
			}
			
		} else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}

}
