/*
 * Esta clase se encarga de los metodos para agregar y buscar un vehiculo.
 */
import javax.swing.JOptionPane;
public class RegistroVehiculos{
	
	private Vehiculo listaVehiculos[];
	private int matrizVehiculos[][];
	private int tamanio;
	//Se define el metodo constructor
	public RegistroVehiculos(int tamanno){
		listaVehiculos=new Vehiculo[tamanno];
		matrizVehiculos=new int[4][tamanno];
		this.tamanio=tamanno;
	}
	
	
	public int vehiculosLength(){
		return listaVehiculos.length;
	}
	    //Metodo addVehiculos donde sea -1 el vehiculo se agrega, sino ya se encuentra registrado
		public String addVehiculos(Vehiculo vehiculos, int indice){     
		if(vehiculos!=null && indice < listaVehiculos.length){
			if(buscarVehiculos(vehiculos.getSerieVehiculo())==-1){
				listaVehiculos[indice]=vehiculos;
				return "Se agrego correctamente";
			}else{
					return "El candidato ya se encuentra registrado!";
				}
		}else{
			return "El estudiate no se agregó.";
		}
	}
	    //Metodo buscarVehiculos donde si listaVehiculos es igual o diferente de null se procede a buscar serieVehiculo
		public int buscarVehiculos(String serieVehiculo){
		for(int indice=0;indice<listaVehiculos.length;indice++){
			if(listaVehiculos[indice]!=null){
				if(listaVehiculos[indice].getSerieVehiculo().equalsIgnoreCase(serieVehiculo)){
					return indice;
					}
			}
		}
		return -1;
	}
}
