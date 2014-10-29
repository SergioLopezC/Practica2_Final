import javax.swing.JPanel;
import java.awt.Color; 
import java.awt.Graphics; 

public class Canvas extends JPanel  {
	private static final long serialVersionUID = 1L;
	int carbon;
	int primera;
	int tercera;
	int esp;
	int locomotora;
	Color color;
	public Canvas(){
		carbon=0;
		primera=0;
		tercera=0;
		locomotora=1;
	}
	
	public Canvas(int carbon,int primera,int tercera){
	this.carbon=carbon;
	this.primera=primera;
	this.tercera=tercera;
	locomotora=1;
	}
	public void limpiar(){
		carbon=0;
		primera=0;
		tercera=0;
		locomotora=1;
	}

	public void setdatos(int primera,int tercera,int carbon){
		this.primera=primera;
		this.tercera=tercera;
		this.carbon=carbon;
	}
	public void paint(Graphics g) {  
		g.setColor(Color.red); 
		g.fillRect(68,6,30, 30);
		g.setColor(Color.blue); 
		g.fillRect(371,6,30, 30);
		g.setColor(Color.CYAN); 
		g.fillRect(671,6,30, 30);
		g.setColor(Color.ORANGE);
		g.fillRoundRect(626, 195, 18, 50, 2, 2);
		g.setColor(Color.green);
		g.fillOval(590, 170, 70, 40);
		g.fillOval(623, 170, 70, 40);
		g.fillOval(610, 150, 50, 70);
		g.fillOval(610, 170, 50, 60);
		g.setColor(Color.ORANGE);
		g.fillRoundRect(566, 195, 18, 50, 2, 2);
		g.setColor(Color.green);
		g.fillOval(530, 170, 70, 40);
		g.fillOval(563, 170, 70, 40);
		g.fillOval(550, 150, 50, 70);
		g.fillOval(550, 170, 50, 60);
		for(int i=0;i<tercera;i++){
		if(i==0){
			esp = 100;
			g.setColor(Color.blue); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.cyan);
			g.fillRect(esp+6, 204, 35, 18);
			g.draw3DRect(esp+6, 204, 10, 18, false);
			g.draw3DRect(esp+17, 204, 10, 18, false);
			g.draw3DRect(esp+28, 204, 10, 18, false);
			g.setColor(Color.black);
			g.fillOval(esp+17, 209, 12, 12);
			g.drawLine(esp+40,235,esp+70,235);
			g.drawLine(esp+40,236,esp+70,236);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}else{
			esp = esp + 70;
			g.setColor(Color.blue); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.cyan);
			g.fillRect(esp+6, 204, 35, 18);
			g.draw3DRect(esp+6, 204, 10, 18, false);
			g.draw3DRect(esp+17, 204, 10, 18, false);
			g.draw3DRect(esp+28, 204, 10, 18, false);
			g.setColor(Color.black);
			g.fillOval(esp+17, 209, 12, 12);
			g.drawLine(esp+40,235,esp+70,235);
			g.drawLine(esp+40,236,esp+70,236);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
		}
		for(int j=0;j<primera;j++){
			g.setColor(Color.red); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.cyan);
			g.fillRect(esp+6, 204, 35, 18);
			g.draw3DRect(esp+6, 204, 10, 18, false);
			g.draw3DRect(esp+17, 204, 10, 18, false);
			g.draw3DRect(esp+28, 204, 10, 18, false);
			g.setColor(Color.black);
			g.fillOval(esp+17, 209, 12, 12);
			g.drawLine(esp+40,235,esp+70,235);
			g.drawLine(esp+40,236,esp+70,236);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
        for(int z=0;z<carbon;z++){
        	esp = esp + 70;
			g.setColor(Color.CYAN); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.black);
			g.drawLine(esp+40,235,esp+70,235);
			g.drawLine(esp+40,236,esp+70,236);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
        for(int k=0;k<locomotora;k++){
        	esp = esp + 70;
        		g.setColor(Color.black);//5
        		g.drawLine(52,243,800,243);
			g.drawLine(52,244,800,244);//5
			g.fillArc(esp+1, 215,70,50,0,90);
			g.fillRect(esp+26,180,10, 20);
        		g.setColor(Color.orange); 
			g.fillRect(esp,200,45, 40);
			g.draw3DRect(esp, 200, 45, 40, false);//5
			g.setColor(Color.darkGray);
			g.setColor(Color.cyan);
			g.fillRect(esp+6, 204, 35, 18);
			g.draw3DRect(esp+6, 204, 10, 18, false);
			g.draw3DRect(esp+17, 204, 10, 18, false);
			g.draw3DRect(esp+28, 204, 10, 18, false);
			g.setColor(Color.black);
			g.fillOval(esp+17, 209, 12, 12);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
			
        }
 } 

	
	

}
