package Day_04;

public class PrivateConstrutorDemo {

	public static void main(String[] args) {
	

		// Can't create object with private constructor
		// MyClass m1=new MyClass();
		
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
	}

}