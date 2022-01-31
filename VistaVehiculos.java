import javax.swing.JOptionPane;
public class VistaVehiculos{
	//Se define metodo de salida de datos
	public void output(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}
	//Se define metodo de entrada de datos
	public String input(String mensaje){
		return JOptionPane.showInputDialog(mensaje);
	}
	
	}//fin de la clase
