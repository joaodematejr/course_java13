package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//INFORMAÇÕES DO FUNCIONARIOS
		
		//TIPOS NUMÉRICOS INTEIROS 
		byte anosDeEmpresa = 23;
		short numerosDevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//TIPOS NUMÉRICOS REAIS
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//TIPOS BOOLEANO
		boolean estaDeFerias = false;
		
		//TIPOS CARACTERE
		char status = 'A';
		
		//DIAS DE EMPRESA 
		System.out.println(anosDeEmpresa * 365);
		//NÚMEROS DE VIAGENS
		System.out.println(numerosDevoos / 2);
		//PORNTOS POR REAL
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
