interface NumericFunc
{
	// function not a method as a method has an variable that calls it
	// Only declaring
	int func(int n);
}
class LambdaFactorial
{
	public static void main(String args[])
	{
		NumericFunc factorial = (n) -> 
		{
			int result = 1;
			for(int i = 1; i <= n; i++)
			{
				result = result * i;
			}
			return result;
		};
		System.out.println("Factorial is "+factorial.func(5));
		System.out.println("Factorial is "+factorial.func(6));	
	}
}