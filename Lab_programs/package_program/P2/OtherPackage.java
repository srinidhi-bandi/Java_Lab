package P2;
class OtherPackage
{
	OtherPackage()
	{
		P1.Protection pro = new P1.Protection();
		System.out.println("This is OtherPackage Class");
		// System.out.println("Value of n: "+pro.n);
		// System.out.println("Value of n_pri: "+pro.n_pri);
		// System.out.println("Value of n_pro: "+pro.n_pro);
		System.out.println("Value of n_pub: "+pro.n_pub);
	}
}‎