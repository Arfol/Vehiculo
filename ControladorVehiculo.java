/*
  * Esta clase se encarga de controlar la información que se le colicita al usuario mediante 
  * un conjunto de opciones, al mismo tiempo permite la counicación entre el modelo y la vista.
*/
import javax.swing.JOptionPane;
public class ControladorVehiculo
{
	RegistroVehiculos registroVehiculos;
	VistaVehiculos vistaVehiculos;
	Vehiculo vehiculo= new Vehiculo();
	int contador;
	int indice=0;

//Metodo Constructor con las instancias definadas de vistaVehiculos y registroVehiculos
public ControladorVehiculo()
	{
		vistaVehiculos=new VistaVehiculos();
		int numVehiculos=Integer.parseInt(vistaVehiculos.input("Digite el número de vehiculos que desea agregar!"));
		registroVehiculos=new RegistroVehiculos(numVehiculos);
		menu();
	}// fin del constructor
	
//Menu
public void menu()
	{
		int opcion=0;
		do
		{
			opcion=Integer.parseInt(vistaVehiculos.input("Seleccione una opcion:\n1-Agregar\n2-Salir"));
			switch(opcion)
			{
				
				case 1:
				//Se agregan los datos de cada vehiculo
				for(int fila=0;fila<registroVehiculos.vehiculosLength();fila++){
					Vehiculo vehiculo=new Vehiculo();
							vehiculo.setMake(vistaVehiculos.input("Digite la marca del vehiculo!"));
							vehiculo.setModel(vistaVehiculos.input("Digite el modelo del vehiculo!"));
							vehiculo.setVehicleType(vistaVehiculos.input("Digite el tipo del vehiculo!"));
							vehiculo.setCostPrice(Integer.parseInt(vistaVehiculos.input("Digite el precio del vehiculo!")));
							vehiculo.setVehicleAgeInYears(Integer.parseInt(vistaVehiculos.input("Digite la edad del vehiculo!")));
							vehiculo.setSerieVehiculo(vistaVehiculos.input("Digite la serie del vehiculo!"));
							registroVehiculos.addVehiculos(vehiculo,fila);
				}
				break;
				
				case 2:
				System.exit(0);
				break;
				
				default:
				vistaVehiculos.output("Opción inválida");
				break;
				
			}//fin del switch
		}while(opcion!=2);
	
}//fin del método menu
}
