
public class Person {

	String name;
	int age; 
	String gender;
	
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Person() {
		name = "None";
		age = 0;
		gender = "None";
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void introduce()
	{
		System.out.println("I am a resident of this village");
	}
	
}
