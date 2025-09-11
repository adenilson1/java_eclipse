package apliacation;

public class Program04 {

	public static void main(String[] args) {
		int x = 20; // tipo valor(primitivo)
		Object obj = x; // tipo objeto
		Integer objeInteger = x;
		
		
		System.out.println(obj); // boxing

		
		int y = (int)obj;
		int y1 = objeInteger * 2;
		System.out.println(y); // unboxing
		System.out.println(y1);
		
	}

}
