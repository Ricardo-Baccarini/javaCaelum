class UsaConta{
  public static void main(String [] args){
  	Conta c1 = new Conta();
  	c1.titular = "Mané";
  	c1.numero = 98082;
  	c1.agencia = "333";
  	c1.saldo = 50.99;
  	c1.dataDeAbertura = "04/03/2020";
  	System.out.println(c1.titular + " saldo " + c1.saldo);
  	c1.deposita(153.85);
  	System.out.println(c1.titular + " saldo " + c1.saldo);
  	c1.calculaRendimento();
  	System.out.println(c1.recuperaDadosParaImpressao());
  	
  	Conta c2 = new Conta();
  	c2.titular = "Ricardo";
  	c2.saldo = 90;
  	
  	Conta c3 = new Conta();
  	c3.titular = "Ricardo";
  	c3.saldo = 90;
  	
  	if (c1 == c2){
  		System.out.println("iguais");
  	} else {
  	  System.out.println("diferentes");
  	}
 
  	Conta c4 = new Conta();
  	c3.titular = "ERERE";
  	c3.saldo = 90;
  	
  	c2 = c3;
  	if (c1 == c2){
  		System.out.println("iguais");
  	} else {
  	  System.out.println("diferentes");
  	}
  }
}
