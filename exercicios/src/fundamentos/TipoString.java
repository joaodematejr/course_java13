package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("Boa Tarde"));
		
		var nome = "João";
		var sobrenome = "Dematé";
		var idade = 23;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha RS %.2f.", nome, sobrenome, idade, salario);
		
	}
}
