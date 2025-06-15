package OopuEx;

public class DogCall {
//	2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//	Create two instances of the "Dog" class, 
//	set their attributes using the constructor and 
//	modify the attributes using the setter methods and print the updated values.
	public static void main(String[] args) {
		Dog d1 = new Dog("xyz","abc");
		Dog d2 = new Dog("asd","pqr");
		
		d1.setName("zyx");
		d1.setBreed("pqr");
		
		System.out.println("name : "+d1.name);
		System.out.println("breed : "+d1.breed);
	}
}
