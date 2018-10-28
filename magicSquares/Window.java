package magicSquares;

import java.awt.Graphics;

import javax.swing.*;

public class Window extends JFrame
{
	Square wSquares;
	SquareGraphics gSquare;
	
	public Window()
	{
	}
	
	public Window(Square pSquares)
	{
		super("Magic Squares");
		setBounds(0, 0, 800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		wSquares = pSquares;
		gSquare = new SquareGraphics();
		add(gSquare);
	}
	
	public void updateWindow()
	{
		Graphics g= getGraphics();

		gSquare.setA(200);
		gSquare.setB(300);
		
		gSquare.paintComponent(g);
	}
}

