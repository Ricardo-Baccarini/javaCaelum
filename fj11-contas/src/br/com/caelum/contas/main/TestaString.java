package br.com.caelum.contas.main;

public class TestaString {
	
	public static void main(String[] args) {
		String s = "fj11";
		s.replaceAll("1", "2");
		System.out.println(s);

		for (int i=0;  i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println();
	
		TrazParaFrente();
	}

	public static void TrazParaFrente() {
		String s = "Socorram-me";
		String x = "";
		System.out.println(s);
		System.out.println();
		System.out.println();
		
		for (int i=(s.length() -1);  (i > -1) ; i--) {
			x += s.charAt(i);
		}
		
		System.out.println(x);

	}
}
