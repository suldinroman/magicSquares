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
		
	}
	
	public Square(int x, int y, int size, Color color)
	{
		this.x = x;
		this.y = y;
		this.size = size;
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
	
	public Color getColor() 
	{
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

	public void classSquareLogic()
	{
		this.x++;
		this.y++;
	}
}
