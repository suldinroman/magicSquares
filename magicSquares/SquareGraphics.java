package magicSquares;

import java.awt.*;
import javax.swing.*;

public class SquareGraphics extends JComponent
{
	int a;
	int b;
	
	public void paintComponent(Graphics gSquare)
	{
		gSquare.setColor(Color.GREEN);	
		gSquare.drawRect(10, 10, a, b);
		//gSquare.set
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public void setB(int b) 
	{
		this.b = b;
	}
}
