enum Apple { Jonathan, GoldenDel, RedDel, Winesap, Cortland }

class EnumDemo
{
	public static void main(String args[])
	{
		Apple ap;
		ap = Apple.RedDel;
		System.out.println("The favourite apple is "+ap);
		ap = Apple.GoldenDel;
		if (ap == Apple.GoldenDel)
		{
			System.out.println("Values are matching");
		}
		switch(ap)
		{
			case Jonathan : 
			System.out.println("Value unmatched");
			break;

			case GoldenDel:
			System.out.println("Value matched");
			break;

			case RedDel:
			System.out.println("Value unmatched");
			break;

			case Cortland:
			System.out.println("Value unmatched");
			break;
		}
	}
}