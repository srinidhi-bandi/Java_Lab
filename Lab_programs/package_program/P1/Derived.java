package P1;
class Derived extends Protection
{
	Derived()
	{
		System.out.println("This is the derived class constructor");
		System.out.println("Value of n: "+n);
		// System.out.println("Value of n_pri: "+n_pri);
		System.out.println("Value of n_pro: "+n_pro);
		System.out.println("Value of n_pub: "+n_pub);
	}
}