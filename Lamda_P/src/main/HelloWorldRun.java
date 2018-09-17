package main;

public class HelloWorldRun {

	public static void main(String[] args) {
		HelloWorld hw =(name) ->"Hellow" + name;
		
		String h = hw.sayHello("Shorno");
		System.out.println(h);
	}

}
