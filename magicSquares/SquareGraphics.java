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
	
	Square sgSquare;
	
	public SquareGraphics()
	{
		
	}
	
	public SquareGraphics(Square pSquare)
	{
		sgSquare = pSquare;
		
		this.x = sgSquare.getX();
		this.y = sgSquare.getY();		
		this.size = sgSquare.getSize();
		this.color = sgSquare.getColor();
	}
	
	public void paintComponent(Graphics gSquare)
	{
		super.paintComponents(gSquare);
		
		this.x = sgSquare.getX();
		this.y = sgSquare.getY();
		this.size = sgSquare.getSize();

		gSquare.setColor(sgSquare.getColor());	
		gSquare.drawRect(x, y, size, size);
			
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
//
//	public int getY() 
//	{
//		return this.y;
//	}
}
