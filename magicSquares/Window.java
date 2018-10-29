package magicSquares;

import javax.swing.*;

public class Window extends JFrame
{
	SquareGraphics sgSquare;
	
	public Window(Square[] ptrSquares)
	{
		super("Magic Squares");
		setBounds(0, 0, 800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sgSquare = new SquareGraphics(ptrSquares);
		add(sgSquare);	
	}	
}

