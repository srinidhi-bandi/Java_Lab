package P1;

class SamePackage 
{
	Protection p = new Protection();
	SamePackage()
	{
		System.out.println("Inside the same package constructor");
		System.out.println("Value of n: "+p.n);
		// System.out.println("Value of n_pri: "+p.n_pri);
		System.out.println("Value of n_pro: "+p.n_pro);
		System.out.println("Value of n_pub: "+p.n_pub);
	}
}