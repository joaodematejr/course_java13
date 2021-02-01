package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//LER NUM 1;
		//LER NUM 2;
		// + OR - OR / OR * %
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe a operação: + ou - ou * ou /");
		String op = entrada.next();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();

		
		System.out.println(op);
		
		//LOGICA 
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
				
	
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}
}
