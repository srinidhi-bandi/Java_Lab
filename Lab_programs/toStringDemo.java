class Box
{
	double height,width,depth;
	Box(double h,double w,double d)
	{
		height = h;
		width = w;
		depth = d;
	}
	
	public String toString()
	{
		return "The dimensions are: "+height+" by "+width+" by "+depth+".";
	}
}

class toStringDemo
{
	public static void main(String args[])
	{
		Box b = new Box(10,12,14);	
		// b is the reference of class box
		String s = "The dimensions of the box are: "+b;
		System.out.println(b);
		System.out.println(s);

		String s2 = "Face the failure until failur fails to face you";
		int start = 4; 
		int end = 27;
		
		char buf[] = new char[end-start];
		s2.getChars(start,end,buf,0);
		System.out.print("String buffer: ");
		System.out.println(buf);
		int index = 1;
		System.out.println("The number of arguments: "+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Argument "+index+": "+args[i]);	
			index++;
		}
	}
}
