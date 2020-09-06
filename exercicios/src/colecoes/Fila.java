package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//OFFER E ADD -> ADICIONAR ELEMENTOS NA FILA
		//DIFERENÇA É O COMPORTAMENTO QUANDO A FILA ESTÁ CHEIA!
		fila.add("Ana"); //RETORNA FALSE
		fila.offer("Bia"); // LANÇA UMA EXCEÇÃO
		fila.offer("Ana");
		fila.offer("Rafa");
		fila.offer("Gui");
		
		//PEEK E ELEMENT -> OBTER O PRÓXIMO ELEMENTOS DA FILA
		//DIFERENÇA É O COMPORTAMENTO OCORRE QUANDO A FILA ESTÁ VAZIA!
		System.out.println(fila.peek()); //RETORNA NULL
		System.out.println(fila.element()); // LANÇA UMA EXCEÇÃO
		
		//fila.clear();
		//fila.isEmpty();
		//POLL E REMOVE -> OBTER O PRÓXIMO ELEMENTOS DA FILA E REMOVE
		//DIFERENÇA É O COMPORTAMENTO OCORRE QUANDO A FILA ESTÁ VAZIA!
		System.out.println(fila.poll()); //RETORNA NULL
		System.out.println(fila.poll()); //LANÇA UMA EXCEÇÃO
		System.out.println(fila.remove());
		
		//fila.contains()
	}

}
