package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(500);
		System.out.println(conta.getSaldo());

		Conta contaNovoTitular = new Conta("Novo titular");
		System.out.println("Identificadores");

		System.out.println(Conta.getContador());
		System.out.println(contaNovoTitular.getIdentificador());

	}
}
