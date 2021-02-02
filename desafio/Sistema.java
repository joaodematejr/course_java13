package ambiente;

public class Sistema {

	public static void main(String[] args) {

		Compra compra = new Compra();
		compra.adicionarItem("Caneta", 1, 100);
		compra.adicionarItem(new Produto("Notebook", 100), 2);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 1000), 1);
		
		Cliente cliente = new Cliente("Maria Julia");
		
		cliente.adicionarCompra(compra);
		cliente.adicionarCompra(compra1);
		
		System.out.print(cliente.oberValorTotal());
		

	}

}
