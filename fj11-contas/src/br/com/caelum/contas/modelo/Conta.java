package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	private int identificador;
	private static int contador;

	public Conta() {
		contador++;
		identificador = contador;
	}

	public abstract String getTipo();

	public Conta(String titular) {
		contador++;
		identificador = contador;
		this.setTitular(titular);
	}

	public static int getContador() {
		return contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + titular + ",numero=" + numero + 
				", agencia=" + agencia + "]";
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && 
				this.agencia.equals(outraConta.agencia);
	}

}
