package br.com.caelum.contas.modelo;



public class Conta {
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

	public String getTipo() {
		return "Conta";
	}
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

}
