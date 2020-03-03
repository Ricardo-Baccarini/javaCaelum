class ExercicioX{
	public static void main(String[] args) {
		
    System.out.println("\nNumeros entre 150 e 300");
    for (int numerosEntre150e300 = 150; numerosEntre150e300 < 300; numerosEntre150e300 ++) { 
		  System.out.println(numerosEntre150e300);
    }

    System.out.println("\nSoma de 1 a 1000");
    int soma = 0;
    int x = 1;
    while (x <= 1000) {
       soma += x;
       x++;
    }
    System.out.println(soma);

    int resto = 0;
    System.out.println("\nmultiplo de 3");
		for (int y = 1; y < 100; y ++){
      resto = y % 3;
      if (resto == 0) {
        System.out.println(y);
      }
    }

    System.out.println("\nFatorial"); 
    int fatorial = 10;
		for (int n = 10; n > 1; n--){
      fatorial = fatorial * (n -1);
      System.out.println(fatorial); 
    }   
	}
}
