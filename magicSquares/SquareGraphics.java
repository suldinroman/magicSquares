package magicSquares;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class SquareGraphics extends JComponent
{	
	int x;
	int y;
	
	int size;
	Color color;
	
	public SquareGraphics()
	{
		
	}
	
	public SquareGraphics(Square pSquare)
	{
		this.x = pSquare.getX();
		this.y = pSquare.getY();
		
		this.size = pSquare.getSize();
		this.color = pSquare.getColor();
	}
	
	public void paintComponent(Graphics gSquare)
	{
		super.paintComponents(gSquare);
		gSquare.setColor(color);	
		gSquare.drawRect(x, y, size, size);
		
		try
		{
			TimeUnit.MILLISECONDS.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		super.repaint();
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}
	////////////////////////
	////////////////////////
//	public int getX() 
//	{
//		return this.x;
//	}

//	public int getY() 
//	{
//		return this.y;
//	}
}
