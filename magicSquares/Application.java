package magicSquares;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Application 
{
	public static void main(String[] args) 
	{
		int numSquares = 2;
		Square[] arrSquares = new Square[numSquares]; 
		arrSquares[0] = new Square(0, 0, 50, Color.BLUE);
		arrSquares[1] = new Square(40, 80, 90, Color.GREEN);
		Window mainWindow = new Window(arrSquares);
		
		mainWindow.setVisible(true);
		
		for( ; ; )
		{
			//System.out.println("x[]= " + mainWindow.gSquare.getX() + ", getX= " + arrSquares.getX());
			//System.out.println("y[]= " + mainWindow.gSquare.getY() + ", getY= " + arrSquares.getY());
			
			appPause(100);
			
			arrSquares[0].classSquareLogic();
			arrSquares[1].classSquareLogic();
		}
	}
	
	public static void appPause(int pauseTime)
	{
		try
		{
			TimeUnit.MILLISECONDS.sleep(pauseTime);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
