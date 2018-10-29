package magicSquares;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Window extends JFrame
{
	SquareGraphics gSquare;
	
	public Window()
	{
	}
	
	public Window(Square pSquares)
	{
		super("Magic Squares");
		setBounds(0, 0, 800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gSquare = new SquareGraphics(pSquares);
		add(gSquare);
		
	}
	
	public void updateWindow(Square pSquares)
	{
		
	}
	
}

