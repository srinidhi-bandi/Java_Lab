class Box
{
	double height;
	double width;
	double depth;
	Box()
	{
		height = 20;
		width = 30;
		depth = 40;
	}
	double volume()
	{
		return height*width*depth;
	}
}

class BoxDemo2
{
	public static void main(String args[])
	{
		Box obj = new Box();
		System.out.println(obj.volume());
	}
}
