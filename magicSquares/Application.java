package magicSquares;

import java.util.concurrent.TimeUnit;

public class Application 
{
	public static int numSquares = 4;
	
	public static void main(String[] args) 
	{
		Square[] arrSquares = new Square[numSquares];
		for(int i = 0; i < numSquares; ++i)
				arrSquares[i] = new Square();
	
		Window mainWindow = new Window(arrSquares);
		mainWindow.setVisible(true);
		
		for( ; ; )
		{
			for(int i = 0; i < numSquares; ++i)
				arrSquares[i].waySquare();
			
			for(int i = 0; i < numSquares; ++i)
				for(int j = 0; j < numSquares ; ++j)
					if(i != j)
						arrSquares[i].interSquare(arrSquares[j]);
			
			appPause(25);
		}
	}
	
	public static void appPause(int pauseTime)
	{
		try
		{
			TimeUnit.MILLISECONDS.sleep(pauseTime);
		} 
		catch (InterruptedException excep) 
		{
			
		}
	}
}
