package vehiclesystem;



public class Bikeinh extends Vehicleinh{
	
	Bikeinh(int vehicleId, String brand, float rentPerday){
		super(vehicleId, brand, rentPerday);
	}
		
	
	
    void calculateRental(int days) {
    	float totalrent=(rentPerday*days);
    	System.out.println("your total rent on renting " + brand + " for " +days+ " days is Rs." +totalrent );
    	
		
		
	}
}
