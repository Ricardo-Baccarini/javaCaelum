class BalancoTrimestral{
	public static void main(String[] args) {
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		System.out.println(gastoTrimestre);
		double mediaMensal = gastoTrimestre / 3; 
		System.out.println("Valor da media mensal " + mediaMensal);

		//for (int x =0 ; x <= 10; x ++) {
			//System.out.println(x);
		//}

	}
}
