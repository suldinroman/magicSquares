package magicSquares;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Application 
{
	public static void main(String[] args) 
	{
		Square arrSquares = new Square(0, 0, 50, Color.BLUE);
		Window mainWindow = new Window(arrSquares);
		
		mainWindow.setVisible(true);
		
		for( ; ; )
		{
			System.out.println("x[]= " + mainWindow.gSquare.getX() + ", getX= " + arrSquares.getX());
			System.out.println("y[]= " + mainWindow.gSquare.getY() + ", getY= " + arrSquares.getY());
			
			appPause(1000);
			
			arrSquares.classSquareLogic();
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
