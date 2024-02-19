package Day_04;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		
		System.out.println("Enter Person Details");
		name = sc.nextLine();
		city =sc.next();
		age = sc.nextInt();
		
		Person obj = new Person();
	
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		
		System.out.println(obj);
	}

}
