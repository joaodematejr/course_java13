package fundamentos;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("João");
		sb.append(",").append("Junior");
		sb.append("Legal");
		
		System.out.println(sb.toString());
		
		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1,3));
		System.out.println(sb.toString());
	}
}
