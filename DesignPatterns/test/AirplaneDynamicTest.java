import java.util.Scanner;

public class AirplaneDynamicTest {
	
	public static void main(String[] args){

		// Dynamic test
		Embraer Factory1 = new Embraer();
		Airplane thePlane = null;		
		Scanner userInput = new Scanner(System.in);		
		System.out.print("What model? (P100 / P200 / E190 / E170)");		
		if (userInput.hasNextLine()){			
			String newPlaneModel = userInput.nextLine();		
			thePlane = Factory1.makeAirplane(newPlaneModel);			
			if(thePlane != null){
				thePlane.airplaneIntro();				
			} else System.out.print("Model not in production.");		
		}
	}
}
