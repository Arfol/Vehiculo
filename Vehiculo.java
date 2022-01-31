public class Vehiculo{
	
	//Se definen las variables y sus tipos
	private String make;
	private String model;
	private String vehicleType;
	private double costPrice;
	private int vehicleAgeInYears;
	private String serieVehiculo;
	
	//Se definen los Constructores
	public Vehiculo(){
		
		this.make="";
		this.model="";
		this.vehicleType="";
		this.costPrice=0.0;
		this.vehicleAgeInYears=0;
		this.serieVehiculo="";
		}
		
	public Vehiculo(String make, String model, String vehicleType, double costPrice, int vehicleAgeInYears, String serieVehiculo){
	
		this.make=make;
		this.model=model;
		this.vehicleType=vehicleType;
		this.costPrice=costPrice;
		this.vehicleAgeInYears=vehicleAgeInYears;
		this.serieVehiculo=serieVehiculo;
	}//Se termina los metodos constructores
	
	//Se definen los metodos set y get
	public String getMake(){
		return this.make;
	}
	public void setMake(String serie){
		this.make=make;
	}
	public String getModel(){
		return this.model;
	}
	public void setModel(String model){
		
		this.model=model;
	}
	public String getVehicleType(){
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType){
		this.vehicleType=vehicleType;
	}
	public double getCostPrice(){
		return this.costPrice;
	}
	public void setCostPrice(double costPrice){
		this.costPrice=costPrice;
	}
	
	public int getVehicleAgeInYears(){
		return this.vehicleAgeInYears;
	}
	public void setVehicleAgeInYears(int vehicleAgeInYears){
		this.vehicleAgeInYears=vehicleAgeInYears;
	}
	
	public String getSerieVehiculo(){
		return this.serieVehiculo;
	}
	public void setSerieVehiculo(String serieVehiculo){
		this.serieVehiculo=serieVehiculo;
	}
	
	public String getInformacion(){
		return " Make: "+this.getMake()+", Model: "+this.getModel()+", Vehicle Type: "+this.getVehicleType()+", Cost Price: "+this.getCostPrice()+", Cost Price: "+this.getCostPrice()+", Serie Vehiculo: "+this.getSerieVehiculo();
	}
	
	}//fin clase

