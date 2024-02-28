package javaBasics;

public class Example_ABC {
	
	static int p;
	static String s1;
	
	int q;
	String s2;

	public static void show() {
		System.out.println("Show static method");
		p=100;
		s1="Java";
	}
	
	public void test1() {
		System.out.println("Test1 Non static method");
		q=300;
		s2="Selenium";
	}

}
