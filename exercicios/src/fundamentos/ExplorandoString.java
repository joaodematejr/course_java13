package fundamentos;

public class ExplorandoString {
	
	public static void main(String[] args) {
	
		String nome = "João";
		
		//ALGUNS MÉTODOS
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 2));
		System.out.println(nome.indexOf(2));
		System.out.println(nome.charAt(3));
		System.out.println(nome.equalsIgnoreCase("joão"));
		System.out.println(nome.startsWith("Jo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal").concat("!"));
	}
}
