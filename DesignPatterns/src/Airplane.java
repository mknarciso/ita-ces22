
public abstract class Airplane {
	
	private String brand;
	private String name;
	private int model;
	private int seats;
	private double maxSpeed;
	
	public String getBrand() { return brand; }
	public void setBrand(String newBrand) { brand = newBrand; }
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public double getMaxSpeed() { return maxSpeed; }
	public void setMaxSpeed(double newMaxSpeed) { maxSpeed = newMaxSpeed; }
	
	public int getSeats() { return seats; }
	public void setSeats(int newSeats) { seats = newSeats; }
	
	public int getModel() { return model; }
	public void setModel(int newModel) { model = newModel; }
	
	public void airplaneIntro(){
		
		System.out.println("This is the new " + getBrand() + " " + getName() + 
				" " + getModel() + ", it flies at maximum " + getMaxSpeed() + " knots, and takes " + 
				getSeats() + " passengers!"); 
		
	}
	
	public String getAirplaneIntro(){
		
		return ("This is the new " + getBrand() + " " + getName() + 
				" " + getModel() + ", it flies at maximum " + getMaxSpeed() + " knots, and takes " + 
				getSeats() + " passengers!");
		
	}
	
}