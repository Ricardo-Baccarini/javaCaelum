package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	Conta conta;
	public void criaConta(Evento evento) {
		this.conta  = new Conta();
		this.conta.setTitular("Batman");
		this.conta.setNumero(1234);
		this.conta.setAgencia("3333");
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	}

}
