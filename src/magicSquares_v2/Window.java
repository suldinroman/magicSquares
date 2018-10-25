import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Window{
  public static void main(String[] args) {
 
	//Заголовок
	JFrame window=new JFrame("Window");
	//Размеры
	window.setSize(1400, 700);
 
	//Закрытие окна при нажатии на крестик
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
/*	Менеджер определяет
 *  каким образом в окне расположены объекты.*/
	window.setLayout(new BorderLayout(50,50));

	Canvas canv=new Canvas();
	window.add(canv);		
	window.setVisible(true);		
  }
}

/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent{
 
	int[]X = {0, 600, 50, 1000, 200};
	int[]Y = {0, 180, 90, 270, 360};
	int[]len = {50, 100, 120, 75, 20};
	boolean[]EndX = {true, false, false, true, false};
	boolean[]EndY = {true, true, false, false, false};
	boolean var = false;
/*Метод, перерисовывающий элемент внутри окна
 *при обновлении*/
  public void paintComponent(Graphics g){
	super.paintComponents(g);		
	Graphics2D g2d=(Graphics2D)g;
 
	if(!var) {
		g2d.setPaint(Color.BLUE);
		var = true;
	}
	else{
		g2d.setPaint(Color.RED);
		var = false;
	}
	
/* 	Рисует текущим цветом прямоугольник	*/	
	for(int i = 0; i < 5; i++) {
		g2d.drawRect(X[i], Y[i], len[i], len[i]);
		
		//Граничные условия
		if(X[i] < 0) {
			EndX[i] = true;
		}
		if(X[i]+len[i] > 1300) {
			EndX[i] = false;
		}
		if(Y[i] < 0) {
			EndY[i] = true;
		}
		if(Y[i]+len[i] > 600) {
			EndY[i] = false;
		}
		
		//Новая координата
		if(EndX[i]) {
			X[i] += 1;
		}
		else {
			X[i] -= 1;
		}
		
		if(EndY[i]) {
			Y[i] += 1;
		}
		else {
			Y[i] -= 1;
		}
		
		//Пересекания квадратов 
		for(int j = 0; j < 5; j++) {
			if (i == j) {
				continue;
			}
			
			if(X[i] == X[j] && ((Y[j] > Y[i] && Y[j] < (Y[i] + len[i])) || Y[j] + len[j] > Y[i] && Y[j] + len[j] < (Y[i] + len[i]))) {
				len[i] +=len[i]/2;
				len[j] +=len[j]/2;
			}
		}
		
	}
	
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	
		
	//Вызывает обновление себя после завершения рисования
	super.repaint();
  }	
}