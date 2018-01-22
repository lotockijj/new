package my.epam;


/**Exercise 10: (3) Create a base class with two methods. In the first method, call the
second method. Inherit a class and override the second method. Create an object of the
derived class, upcast it to the base type, and call the first method. Explain what happens
*/

public class Base {
    
	public int firstMethod() {
		System.out.println("Base first has called. ");
		secondMethod();
		return 1;
	}
	
	public int secondMethod() {
		System.out.println("Base second has called. ");
		return 2;
	}
}
