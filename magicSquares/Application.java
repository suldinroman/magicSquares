package magicSquares;

import java.util.concurrent.TimeUnit;

public class Application 
{
	public static int numSquares = 100000;
	public static int numThreads = 20;
	
	public static void main(String[] args) 
	{
		Square[] arrSquares = new Square[numSquares];
		for(int i = 0; i < numSquares; ++i)
				arrSquares[i] = new Square();
	
		Window mainWindow = new Window(arrSquares);
		mainWindow.setVisible(true);
		
		for(int j = 0; ; ++j)
		{
			long beginTimeMoving = System.currentTimeMillis();
			
			MagicThread[] waySquareThread = new MagicThread[numThreads];
			initThreads(arrSquares, waySquareThread, false);
			
			for(int i = 0; i < numThreads; ++i)
				waySquareThread[i].start();

			waitingForThreads(waySquareThread);
			
			long endTimeMoving = System.currentTimeMillis(), beginTimeInteraction = endTimeMoving;			
			
			MagicThread[] interSquareThread = new MagicThread[numThreads];
			initThreads(arrSquares, interSquareThread, true);
			
			for(int i = 0; i < numThreads; ++i)
				interSquareThread[i].start();
		    
			waitingForThreads(interSquareThread);
			
			long endTimeInteraction = System.currentTimeMillis();
			
			System.out.printf("Main thread finished (numCycle %3d):\n", j);	
			System.out.printf("      Calculate way: %5d millisecond\n", endTimeMoving - beginTimeMoving);
			System.out.printf("      Interaction:   %5d millisecond\n\n", endTimeInteraction - beginTimeInteraction);

			appPause(5);
			clearScreen();
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
	
	public static void waitingForThreads(MagicThread[] currThreads)
	{
		for(int i = 0; i < numThreads; ++i)
		{
			try
			{
				currThreads[i].join(); 
			}
			catch(InterruptedException e)
			{
				System.out.printf("%s has been interrupted", currThreads[i].nameThread);
			}
		}
	}
	
	public static void initThreads(Square[] arrSquares, MagicThread[] interSquareThread,boolean isInteraction)
	{
		int halfCounter = 0;
		for(int i = 0; i < numThreads; ++i)
		{
			interSquareThread[i] = new MagicThread("waySquareThread", i, arrSquares, halfCounter, halfCounter + numSquares/numThreads, isInteraction);
			halfCounter += numSquares/numThreads;
		}
	}
	
	public static void clearScreen()
	{
		
	}  
}
