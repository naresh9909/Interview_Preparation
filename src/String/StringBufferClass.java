package String;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		sb.append(" Naresh");
		sb.append(" HOW ARE YOU"); 
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());

	}

}
