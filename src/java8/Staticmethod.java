package java8;

interface NewInterface {



	
	static void hello()
	{
	  System.out.println("Hello, New Static Method Here");
	}



	
	void overrideMethod(String str);
	}



	public class Staticmethod implements NewInterface {



	public static void main(String[] args)
	{
	  Staticmethod interfaceDemo = new Staticmethod();



	  NewInterface.hello();



	 
	  interfaceDemo.overrideMethod("Hello, Override Method here");
	}
	public void overrideMethod(String str)
	{
	  System.out.println(str);
	}
	}