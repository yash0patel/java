package OopuEx;

public class Dog {
//	2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//	Create two instances of the "Dog" class, 
//	set their attributes using the constructor and 
//	modify the attributes using the setter methods and print the updated values.
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name = name;
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
