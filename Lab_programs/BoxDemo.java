class Box
{
	// class variables or instance variables
	double height;
	double width;
	double depth;	
}
class BoxDemo
{
	public static void main(String args[])
	{
		// Box() is implicit constructor
		Box obj = new Box();
		obj.height = 200;
		obj.width = 100;
		obj.depth = 15;
		double volume1;
		volume1 = obj.width * obj.height * obj.depth;
		System.out.println("Volume1: "+volume1);
		Box obj2 = new Box();
		obj2.height = 20;
		obj2.width = 100;
		obj2.depth = 15;
		double volume2;
		volume2 = obj2.width * obj2.height * obj2.depth;
		System.out.println("Volume2: "+volume2);
	}
}