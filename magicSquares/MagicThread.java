package magicSquares;

public class MagicThread extends Thread
{
	String nameThread;
	int numThread;
	
	Square[] arrSquares;
	int beginArr;
	int endArr;
	
	boolean isInteraction;
	
	MagicThread(String nThread, int nuThread, Square[] aSquares, int bArr, int eArr, boolean iInteraction){
		this.nameThread = nThread;
		this.numThread = nuThread;
		
		this.arrSquares = aSquares;
		this.beginArr = bArr;
		this.endArr = eArr;
		
		this.isInteraction = iInteraction;
	}
	
	public void run() 
	{
		//System.out.printf("numThread %2d started\n", this.numThread);
		
		if(this.isInteraction)
		{
			for(int i = beginArr; i < endArr; ++i)
				for(int j = beginArr; j < endArr; ++j)
					if(i != j)
						arrSquares[i].interSquare(arrSquares[j]);
		}
		else
		{
			for(int i = beginArr; i < endArr; ++i)
				arrSquares[i].waySquare();
		}
        	
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException excep)
        {
           System.out.printf("Thread %s (%2d) has been interrupted\n", this.nameThread, this.numThread);
        }
        
        //System.out.printf("numThread %2d finished\n", this.numThread);
	}	
}
