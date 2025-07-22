class Box
{
	double width,height,depth;
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*depth*height;
	}
}

class BoxWeight extends Box
{
	double weight;
	BoxWeight(BoxWeight ob)
	{
		super(ob);
		ob.weight = weight;
	}
	BoxWeight(double w, double h, double d, double m)
	{
		super(w,h,d);
		weight = m;
	}
	BoxWeight()
	{
		super();
		weight=-1;
	}
	BoxWeight(double len, double m)
	{
		super(len);
		weight=m;
	}
}
 

class Shipment extends BoxWeight
{
	double cost;
	Shipment(Shipment ob)
	{
		super(ob);
		ob.cost = cost;		
	}
	Shipment(double w, double h, double d, double m, double c)
	{
		super(w,h,d,m);
		cost = c;
	}
	Shipment()
	{
		super();
		cost=-1;
	}
	Shipment(double len, double m, double c)
	{
		super(len,m);
		cost=c;
	}
}



class DemoShipment
{
	public static void main(String args[])
	{
		System.out.println("Details of first ship: ");
		Shipment shipment1 = new Shipment(10,20,15,10,3.41);
		double vol = shipment1.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Weight of shipment: "+shipment1.weight);
		System.out.println("Cost of shipment: "+shipment1.cost);
		System.out.println();
		System.out.println("Details of second ship: ");
		Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);		
		xdouble vol2 = shipment2.volume();
		System.out.println("Volume is "+vol2);
		System.out.println("Weight of shipment: "+shipment2.weight);
		System.out.println("Cost of shipment: "+shipment2.cost);
		
	}
}