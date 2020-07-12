package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
				
		//BYTE
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 1000;
		Long l = 1000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.45678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
	
		Character c = '#'; // CHAR
		System.out.println(c + "...");
		
		
		
	}

}
