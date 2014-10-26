import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Menu extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//componentes de mi jframe
	JMenuBar barra;
	JMenu menu1;
	JMenuItem item1;
	JButton bretroceder,bavanzar;
	JLabel etiqueta,nEstacion;
	JPanel panel;
	String path;
	
	public Menu(){
		this.setTitle("Tren");
		  /**permite iniciar las propiedades de los componentes*/ 
		    Dimension d = new Dimension();//objeto para obtener el tamaño de la pantalla     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
	        setResizable(false);//quita la opcion de cambiar tamanño
	        setLocation((int) ((d.getWidth()/2)+200), 50);//ubicacion donde se muestra la ventana (x, y)
	        setSize(1000, 630);//tamaño de la ventana (ancho, alto)
	        iniciarComponentes();
	        
		}
	private void iniciarComponentes() {
		contenedor=getContentPane();/**instanciamos el contenedor*/
		  /**se define los tamaños y posicion
		   * de los componentes*/
		  contenedor.setLayout(null);
		//agrego el boton retroceder
		  bretroceder= new JButton();
		  bretroceder.setText("Retroceder");
		  bretroceder.setBounds(350, 520, 130, 35);
		  bretroceder.addActionListener(this);
		//agrego boton avanzar
		  bavanzar= new JButton();
		  bavanzar.setText("Avanzar");
		  bavanzar.setBounds(500, 520, 130, 35);
		  bavanzar.addActionListener(this);
		//agrego el Menu
		  barra = new JMenuBar();
		  menu1 = new JMenu("File"); 
		  item1 = new JMenuItem("Cargar");
		  menu1.add(item1);
		  barra.add(menu1);
		  setJMenuBar(barra);
		  item1.addActionListener(this);//escuchador
		  
		  etiqueta = new JLabel();
		  etiqueta.setText("Estacion: ");
		  etiqueta.setBounds(10, 520, 130, 35);
		  
		  nEstacion = new JLabel();
		  nEstacion.setText("id");
		  nEstacion.setBounds(72, 520, 130, 35);
		  panel= new JPanel(); 
	          panel.setBounds(45, 45, 750, 400); 
	          panel.setBackground(Color.gray); 
	          panel.setLayout( new GridLayout()); 
	          panel.add(canvas, BorderLayout.CENTER ); 
	         // contenedor.add(panel);
		  contenedor.add(bretroceder);
		  contenedor.add(bavanzar);
		  contenedor.add(etiqueta);
		  contenedor.add(nEstacion);
	}
	
	}
