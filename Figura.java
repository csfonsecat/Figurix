package geometria;
import javax.swing.*;
//Clase principal del programa llamada Figura

public class Figura extends JFrame {
	//Creo constructor llamado Figura
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	
	public Figura() {
		setLayout(null);
		etiqueta1 = new JLabel("FIGURIX 1.0");
		etiqueta1.setBounds(10,20,300,30);
		add(etiqueta1);
		
		etiqueta2 = new JLabel("SISTEMA DE FIGURAS GEOMETRICAS");
		etiqueta2.setBounds(10,100,300,30);
		add(etiqueta2);
	}
	// Metodo principal de la clase principal 
	public static void main (String Args[]) {
			//Creamos el objeto para el frame principal
		//Se  define un objeto de tipo Figura(es decir como se llama la clase princ, se nombra como frame1, y se inicializa con new=Figura)
		Figura frame1 = new Figura();
		// Establecemos las coordenadas del objeto
		frame1.setBounds(400,50,580,720);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		
			//creamos el objeto para la primer etiqueta 
		
		}
	
	//Defino el metodo Desplazar
	public static void Desplazar() {
		
	}
	
	//Defino el metodo CalcularArea
	public static void CalcularArea(){
		
	}
}
