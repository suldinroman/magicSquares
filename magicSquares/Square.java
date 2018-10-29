package magicSquares;

import java.awt.Color;

public class Square 
{
	int size;
	
	int x;
	int y;
	
	Color color;
	
	public Square()
	{	
		
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

//	public void classSquareLogic()
//	{
//		this.x++;
//		this.y++;
//	}
}
