package ar.edu.unlam.pb2.parcial1;

public class Sube {

	private Integer codigo;
	private Double saldo;
	private Double topeSaldo;

	public Sube(Integer codigo, Double saldo) { 
		super();
		this.codigo = codigo;
		this.saldo = saldo;
		this.topeSaldo = 500.00;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getTopeSaldo() {
		return topeSaldo;
	}

	public void setTopeSaldo(Double topeSaldo) {
		this.topeSaldo = topeSaldo;
	}

}
