
public class DataTypesDemo {

	public static void main(String[] args) {
		
		//widening
		int a = 10;
		float f = a;
		
		System.out.println("value of a = "+a);
		System.out.println("value of f = "+f);

		//narrowing or typecasting
		float f1 = 10.5f;
		int a1 = (int)f1;
		
		System.out.println("value of a1 = "+a1);
		System.out.println("value of f1 = "+f1);

		//overflow
		int a2 = 1200;
		byte b = (byte)a2;
		
		System.out.println("value of byte b = "+b);
		System.out.println("value of a2 = "+a2);

		//adding lower type
		byte b1 = 10;
		byte b2 = 5;
		byte c2 = (byte)(b1+b2);
		//byte c2 = b1+b2; will throw an error
		
		System.out.println("value of b1+b2 = "+c2);
		//System.out.println("value of f = "+f);

		
	}

}
