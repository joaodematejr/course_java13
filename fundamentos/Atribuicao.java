package fundamentos;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		System.out.println(c);
		
		c += b; //C = C + B;
		c -= a; //C = C - A;
		c *= b; //C = C * B;
		c /= a; //C = C / A;
		c %= 2; //C = C % 2; 0 OU 1
		
		System.out.println(c);
		
		
	}
}
