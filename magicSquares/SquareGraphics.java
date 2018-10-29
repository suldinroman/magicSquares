package magicSquares;

import java.awt.*;
import javax.swing.*;

public class SquareGraphics extends JComponent
{	
	Square[] graphSquare;
	
	public SquareGraphics(Square[] ptrSquare)
	{
		graphSquare = ptrSquare;
	}
	
	public void paintComponent(Graphics gSquare)
	{
		super.paintComponents(gSquare);
		
		for(int i = 0; i < Application.numSquares; ++i)
		{
			gSquare.setColor(graphSquare[i].getColor());	
			gSquare.drawRect(graphSquare[i].getX(), graphSquare[i].getY(), graphSquare[i].getSize(), graphSquare[i].getSize());
		}
		
		super.repaint();
	}
}
