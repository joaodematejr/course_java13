package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 01;
		//ano = 01;
		//ano = 1970;
		this(1, 1, 1970);
		
		// BYTE, SHORT, INT, LONG => 0;
		// FLOAT, DOUBLE => 0.0;
		// BOOLEAN => FALSE;
		// CHAR => '\u0000'
		
		//OBJETOS => NULL;
		// String s = null;
		
		int a;
		a = 0;
		System.out.println(a);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	final String formato = "%d/%d/%d";
	
	String obterDataFormatada() {
		
		return String.format(formato, dia, mes, ano);
		
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}

}
