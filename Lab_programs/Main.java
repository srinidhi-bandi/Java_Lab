class Main
{
	public static void main(String args[])
	{
		// SingletonDemo obj1 = new SingletonDemo();
		SingletonDemo obj1 = SingletonDemo.getInstance();
		obj1.showMessage();
		SingletonDemo obj2 = SingletonDemo.getInstance();
		obj2.showMessage();
		System.out.println("Are both the objects same: "+(obj1 == obj2));
	}
}