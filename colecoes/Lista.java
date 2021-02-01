package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Ana"));
		
		System.out.println(lista.get(1).nome);
		
		lista.remove(0); //PELO INDICE
		lista.remove(new Usuario("Ana")); // REMOVER PELO NOME
		var a = lista.contains(new Usuario("Carlos"));
		System.out.println(a); // BOOLEAN SE POSSUI
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}
}
