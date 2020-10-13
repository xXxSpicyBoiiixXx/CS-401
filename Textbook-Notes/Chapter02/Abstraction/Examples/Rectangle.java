public class Rectangle implements FigureInterface 
{
	protected double length, width;
	
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	public double perimeter()
	{
		return(2 * (length + width));
	}

	public double area()
	{
		return(length * width);
	}
}
