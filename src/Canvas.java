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
		for(int i=0;i<tercera;i++){
		if(i==0){
			esp = 100;
			g.setColor(Color.blue); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.black);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}else{
			esp = esp + 70;
			g.setColor(Color.blue); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.black);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
		}
		for(int j=0;j<primera;j++){
			esp = esp + 70;
			g.setColor(Color.red); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.black);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
        for(int z=0;z<carbon;z++){
        	esp = esp + 70;
			g.setColor(Color.CYAN); 
			g.fillRect(esp,200,40, 40);
			g.setColor(Color.black);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
		}
        for(int k=0;k<locomotora;k++){
        	esp = esp + 70;
        	g.setColor(Color.orange); 
			g.fillRect(esp,200,45, 40);
			g.setColor(Color.black);
			g.fillOval(esp+2,230, 15, 15);
			g.fillOval(esp+22,230, 15, 15);
			g.setColor(Color.darkGray);
			g.fillArc(esp+9, 215,70,50,0,90);
			g.fillRect(esp+26,180,10, 20);
        }
 } 

	
	

}
