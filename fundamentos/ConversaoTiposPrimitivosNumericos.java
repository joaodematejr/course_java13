package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; //IMPLÍCITA
		System.out.println(a);
		
		float b = (float) 1.123457891011; //EXPLÍCITA (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //EXPLÍCITA (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
