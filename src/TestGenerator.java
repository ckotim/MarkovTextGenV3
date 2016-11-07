
public class TestGenerator {

	public static void main(String[] args) {
		String a = "aawdwa";
		String b = "aawdwa";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.hashCode() % 31);
		System.out.println(b.hashCode() % 31);

	}

}
