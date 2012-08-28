package net.designated.aopTest;

/**
 * Spring Bean.
 * 
 * @author Vlad
 *
 */
public class HelloPrinter {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello " + name + "!");
	}
}
