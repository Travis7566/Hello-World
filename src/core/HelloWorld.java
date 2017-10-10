package core;

//testing Git
//change made here for test branchGrades(String, int[])
//here's another change for test branch
//adding something else to the code
//added something here
public class HelloWorld {

	public HelloWorld() {
		//init variables for HelloWorld Class if we had them.
		System.out.println("Constructor called");
	}
	/**
	 * prints hello world
	 */
	public void printHelloWorld() {
		System.out.println("Hello World!");
		System.out.println("Wolrd, Hello.");
	}
	
	public static int somethingNew(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		//instantiate the hello world object
		HelloWorld hwObject = new HelloWorld();
		
		//call the print hello world method
		hwObject.printHelloWorld();
		System.out.println(somethingNew(4,5));
	}

}
