package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();

		String dataFormadata1 = d1.obterDataFormatada();
		
		System.out.printf(dataFormadata1);
		System.out.printf("\n");
		
		var d2 = new Data(31, 12, 2020);
		String dataFormadata2 = d2.obterDataFormatada();
		System.out.printf(dataFormadata2);
		
	}

}
