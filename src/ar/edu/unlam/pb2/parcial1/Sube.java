package ar.edu.unlam.pb2.parcial1;

public class Sube {

	private Integer codigo;
	private Double saldo;
	private Double topeSaldo;
	private Double saldoDeGracia;
	private Usuario titular;
		
	public Sube(Integer codigo, Double saldo) { 
		super();
		this.codigo = codigo;
		this.saldo = saldo;
		this.topeSaldo = 1500.00;
		this.saldoDeGracia=200.0;
		this.titular= titular;
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

	public Double cargarSaldo(Double saldo2) {
		this.saldo+=saldo2;
		return this.saldo;
	}

	public void pagarBoleto(Double double1) {
		this.saldo-=double1;
		
	}
	
	
	
	

}
