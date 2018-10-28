package magicSquares;

import java.awt.Color;

public class Application {

	public static void main(String[] args) 
	{
		Square aSquares = new Square(10, 10, 20, Color.YELLOW);
		Window mainWindow = new Window(aSquares);
		
		mainWindow.setVisible(true);
		mainWindow.updateWindow();
		
	}
}
