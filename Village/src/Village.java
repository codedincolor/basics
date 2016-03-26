
public class Village {

	public static void main(String[] args) {
		
		Person jenny = new Person();
		Person son = new Person("Son", 22, "Male");
		Mage jessica = new Mage("Jessica", 21, "Female");
		
		System.out.println("Default constructor says Jenny's name is: " + jenny.getName());
		System.out.print("Introduce method made with Person superclass: ");  
		son.introduce();
		System.out.print("Introduce method made with Mage subclass: ");
		jessica.introduce();
		jessica.setName("Sophia");
		System.out.println("Changed Jessica's name to: " + jessica.getName());

	}

}
