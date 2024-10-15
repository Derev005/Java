package bikeproject;

public class Bike implements BikeParts {
	//---fields and methods of a class---
	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}
	//---implementation to the interface---
	public String getManufacturingCompanies() {
		return BikeParts.ManufacturingCompanies;
	}
	//---constructors---
	public Bike() {
		this.make = "Oracle Cycles";
	}

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		this.NumGears = numGears;
		this.make = "Oracle Cycles";
	}
}
