package Novem17;

public class Program5 {
	public static double AreaOfCircle(int r)
	{
		System.out.println("perimeter of the circle="+2*3.14*r);
		return 3.14*r*r;
	}
	public static double AreaOfSquare(int a)
	{ 
		System.out.println("perimeter of the square="+4*a);
		return a*a;
	}
	public static double AreaOfTriangle(int b,int h)
	{
		System.out.println();
		return (0.5)*b*h;
	}
	
	public static void main(String[] args) 
	{
		double areaOfcicle= AreaOfCircle(12);
		System.out.println(areaOfcicle);
		double areaOfSquare= AreaOfSquare(12);
		System.out.println(areaOfSquare);
		double areaoftriangle= AreaOfTriangle(12,24);
		System.out.println(areaoftriangle);
	}

}
