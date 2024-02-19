package Day_04;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();

		obj.setAge(23);
		obj.setCity("Bangalore");
		obj.setName("kumar");

		System.out.println(obj);

		Base obj2 = new Base();

		obj2.varPublic = 100;
		obj2.methodPublic();
	}

}
