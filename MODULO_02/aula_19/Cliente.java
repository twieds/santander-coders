package santander;

public class Cliente {
	private Integer nroCliente;
	private String sobrenome;
	private String cpf;
	private Integer rg;

	public Cliente() {}

	public Cliente(Integer nroCliente, String sobrenome, String cpf, Integer rg) {
		this.nroCliente = nroCliente;
		this.sobrenome = sobrenome;
		this.cpf= cpf;
		this.rg= rg;
	}

	public Integer getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
	

}
