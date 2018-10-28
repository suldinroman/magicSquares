package magicSquares;

import java.awt.Color;

public class Square 
{
	int size;
	
	int x;
	int y;
	
	Color color;
	
	public static int counter = 0;
	
	public Square()
	{
		this.size = 20;
		this.x = 0;
		this.y = 0;
		this.color = Color.RED;
		Square.counter++;
	}
	
	public Square(int x, int y, int size, Color color)
	{
		this.size = size;
		this.x = x;
		this.y = y;
		this.color = color;
		Square.counter++;
	}

	public int getSize()
	{
		return size;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setSize(int size) 
	{
		this.size = size;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}

}
