class Conta {
  private String titular;
  private int numero;
  private String agencia;
  private Double saldo;
  private String dataDeAbertura;
  private int contador;
  private static int indentificador; 
  
  Conta() {
    indentificador ++;
    contador = indentificador;
  }

  Conta(String titular){
    indentificador ++;
    contador = indentificador;
    this.setTitular(titular);
  }

        public int getContador()
	{
	  return contador;
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
  public String getDataDeAbertura(){
    return dataDeAbertura;
  }
  
  public void setDataDeAbertura(String data){
    this.dataDeAbertura = data;
  }
    
  public void saca(double valor){
    this.saldo -= valor;
  }
  
  public void deposita(double valor){
  	this.saldo += valor;
  }
  
  public double calculaRendimento(){
    double rendimento = this.getSaldo() * 0.1;
    this.saldo += rendimento;
    return getSaldo();
  }
  
  public String recuperaDadosParaImpressao(){
    String dados = "Titular " + this.getTitular();
    dados += "\nNúmero: " + this.getNumero() + " agência " + this.getAgencia();
    dados += "\nData de abetura " + this.getDataDeAbertura();
    dados += "\nSaldo " + this.getSaldo(); 
    return dados; 
  }

  public void transfere(double valor, Conta destino){
    this.saldo -= valor;
    destino.saldo += valor;
  }
}
