package my.epam;

public class Child extends Base {
	
	@Override
	public int secondMethod() {
		System.out.println("Child second has called. ");
		return 3;
	}
}
