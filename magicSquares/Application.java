package magicSquares;

import java.awt.Color;

public class Application 
{
	public static void main(String[] args) 
	{
		Square aSquares = new Square(80, 80, 50, Color.BLUE);
		Window mainWindow = new Window(aSquares);
		
		mainWindow.setVisible(true);
//		int numSquares = 3;
		
//		Square[] aSquares = new Square[numSquares];
//		for(int i = 0; i < numSquares; ++i)
//			aSquares[i] = new Square(20*i+10,5*i+10, 50, Color.BLACK);
		
		
//		Window mainWindow = new Window(aSquares);
		
//		mainWindow.setVisible(true);
//		for(int i = 0; ; ++i)
//		{
//			for(int j = 0; j < numSquares; ++j)
//			{
//				aSquares[j].classSquareLogic();
//				mainWindow.updateWindow(j);
//			}
//		}
	}
}
