package magicSquares;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Application 
{
	public static int numSquares = 2;
	
	public static void main(String[] args) 
	{

		Square[] arrSquares = new Square[numSquares];
		for(int i = 0; i < numSquares; ++i)
				arrSquares[i] = new Square(); //arrSquares[i] = new Square(100*i, 10*i, 50, Color.GREEN);
	
		Window mainWindow = new Window(arrSquares);
		
		mainWindow.setVisible(true);
		
		for( ; ; )
		{
			for(int i = 0; i < numSquares; ++i)
			{
				//arrSquares[i].classSquareLogic();
			}
			
			appPause(100);
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
