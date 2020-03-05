class UsaConta{
  public static void main(String [] args){
  	Conta c1 = new Conta();
  	c1.setTitular("Mané");
  	c1.setNumero(98082);
  	c1.setAgencia("333");
  	c1.setSaldo(50.99);
  	c1.setDataDeAbertura("04/03/2020");
  	System.out.println(c1.getTitular() + " saldo " + c1.getSaldo());
  	c1.deposita(153.85);
  	System.out.println(c1.getTitular() + " saldo " + c1.getSaldo());
  	c1.calculaRendimento();
  	System.out.println(c1.recuperaDadosParaImpressao());
  	
        System.out.println("Identificador " +  c1.getContador());
	Conta cIdentificador = new Conta("ricardo");
        System.out.println("Identificador " +  cIdentificador.getContador());
        System.out.println("Identificador " +  c1.getContador());

  	System.out.println("endereco da variavel de referencia c1  ");
  	System.out.println(c1);
  	
  	//Comentario
  	/*
  	System.out.println("");
  	Conta c2 = new Conta();
  	c2.titular = "Ricardo";
  	c2.saldo = 90;
  	
  	Conta c3 = new Conta();
  	c3.titular = "Ricardo";
  	c3.saldo = 90;
  	
  	System.out.println("Verificando igualdade entre c1 e c2");
  	if (c1 == c2){
  		System.out.println("iguais");
  	} else {
  	  System.out.println("diferentes");
  	}
 
  	Conta c4 = new Conta();
  	c3.titular = "ERERE";
  	c3.saldo = 90;
  	
  	System.out.println("Saldo c2 " + c2.saldo + " saldo c3 " + c3.saldo);
  	c2.transfere(100, c3);
  	System.out.println("Saldo c2 " + c2.saldo + " saldo c3 " + c3.saldo);

  	System.out.println("Verificando igualdade entre c2 e c3");
  	c2 = c3;
  	if (c1 == c2){
  		System.out.println("iguais");
  	} else {
  	  System.out.println("diferentes");
  	}

		if (c2.equals(c3)) {
		  System.out.println("Equals");
		}
		*/
		
/*
		Conta novoConstrutor = new Conta("fumaca");
		System.out.println(novoConstrutor.getTitular());

*/
  }
}
