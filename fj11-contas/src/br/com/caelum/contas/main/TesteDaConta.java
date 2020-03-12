package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(500);
		System.out.println(conta.getSaldo());

		Conta contaNovoTitular = new ContaCorrente();
		System.out.println("Identificadores");

		System.out.println(Conta.getContador());
		System.out.println(contaNovoTitular.getIdentificador());
        System.out.println();
	}
}
