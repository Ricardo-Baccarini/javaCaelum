class Conta {
  String titular;
  int numero;
  String agencia;
  double saldo;
  String dataDeAbertura;

  void saca(double valor){
    saldo -= valor;
  }
  
  void deposita(double valor){
  	saldo += valor;
  }
  
  double calculaRendimento(){
    double rendimento = saldo * 0.1;
    saldo += rendimento;
    return saldo;
  }
  
  String recuperaDadosParaImpressao(){
    String dados = "Titular " + this.titular;
    dados += "\nNúmero: " + this.numero + " agência " + this.agencia;
    dados += "\nData de abetura " + this.dataDeAbertura;
    dados += "\nSaldo " + this.saldo; 
    return dados; 
  }
}
