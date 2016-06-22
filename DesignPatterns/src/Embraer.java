// Este é um exemplo de Factory model, usado para criar modelos diferentes

public class Embraer{
	
	public Airplane makeAirplane(String newPlaneModel){
		
		//Airplane newAirplane = null;
		
		if (newPlaneModel.equals("P100")){
			
			return new Phenom100();
			
		} else 
			
		if (newPlaneModel.equals("P200")){
			
			return new Phenom200();
			
		} else 
			
		if (newPlaneModel.equals("E170")){
			
			return new EMB170();
			
		} else 
		
		if (newPlaneModel.equals("E190")){
			
			return new EMB190();
			
		} else return null;
		
	}
	
}