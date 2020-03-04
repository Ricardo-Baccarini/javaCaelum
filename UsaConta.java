class UsaConta{
  public static void main(String [] args){
  	Conta c = new Conta();
  	c.titular = "Mané";
  	c.numero = 98082;
  	c.agencia = "333";
  	c.saldo = 0.99;
  	System.out.println(c.titular + " " + c.saldo);
  	
  	Conta c1 = new Conta();
  	System.out.println(c1); // aqui imprime o endereço de memória
  	
  	c1 = c;
  	System.out.println(c1.titular + " " + c1.saldo);
  }
}
