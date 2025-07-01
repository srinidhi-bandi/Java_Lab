class Gen<T>
{
	T ob; // placeholder
	Gen(T o)
	{
		ob = o;
	}
	T getOb()
	{
		return ob;
	}
	void showType()
	{	
		System.out.println("The type of T is: "+ob.getClass().getName());
	}
}

class GenDemo
{
	public static void main(String args[])
	{
		Gen<Integer> iob;
		iob =  new Gen<Integer>(88);
		Gen<Float> fob = new Gen<Float>(88.5f);
		Gen<Double> dob = new Gen<Double>(88.9);
		Gen<String> sob = new Gen<String>("Dhoni is the Best Captain");

		int a = iob.getOb();
		float b = fob.getOb();
		double c = dob.getOb();
		String str = sob.getOb();

		System.out.println("The value is (String): "+str);
		System.out.println("The value is (Integer): "+a);
		System.out.println("The value is (Float): "+b);
		System.out.println("The value is (Double): "+c);


		iob.showType();
		sob.showType();
		fob.showType();
		dob.showType();
	}
}