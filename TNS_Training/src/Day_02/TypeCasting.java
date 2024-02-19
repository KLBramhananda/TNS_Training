package Day_02;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 78.8884;
		float f = (float)d;
		
		System.out.println(d);
		
		
		char ch = 'a';
		int a = ch;
		System.out.println(a);

		//explicit Type casting //narrowing
		double f1 = 10.65d;
		float f2 = (float) f1;
		System.out.println(f2);

		char r = 'b';
		byte e = (byte)r;
		System.out.println(e);
	}

}
