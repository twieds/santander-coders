package santander;

import java.util.Date;

public class Cheque {

	private Double valor;
	private String banco;
	private Date dataPagameto;
	
	public Cheque() {	}
	
	public Cheque(Double valor, String banco, Date dataPagameto) {
		this.valor = valor;
		this.banco = banco;
		this.dataPagameto = dataPagameto;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public Date getDataPagameto() {
		return dataPagameto;
	}
	
	public void setDataPagameto(Date dataPagameto) {
		this.dataPagameto = dataPagameto;
	}

}
