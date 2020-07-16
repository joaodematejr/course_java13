package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TRABALHO NA TERÇA (V OU F)
		// TRABALHO NA QUINTA (V OU F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		System.out.println("Comprou sorvete ? " + comprouSorvete);
		
		//OPERADOR UNÁRIO
		System.out.println("Mais saudavel " + !comprouSorvete);
	}
}
