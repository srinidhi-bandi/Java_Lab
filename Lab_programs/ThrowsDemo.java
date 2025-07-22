class ThrowsDemo
{
	// throws contains the list of exceptions that are thrown inside that particular method
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throwOne");
		// On-purpose exception using throw keyword
		throw new IllegalAccessException("Srinidhi");
	}
	public static void main(String args[])
	{
		try
		{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Illegal Access Exception "+e);
		}
		// Last execution
		finally
		{
			System.out.println("At the end of the program");
		}	
	}
}