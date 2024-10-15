package bikeproject;

public class MountainBike extends Bike implements MountainParts {
	//---fields and methods of a class---
	private String suspension, type;
	private int frameSize;
    
	public void printDescription() {
		super.printDescription();
		System.out.println("This mountain bike is a " + this.type + " bike and has a " + this.suspension + " suspension and a frame size of " + this.frameSize + "inches.");
		
	}
	//---implementation to the interface---
	private String Suspension = "";
	public String getSuspension() {
		return Suspension;
	}
	public void setSuspension(String suspension) {
		this.Suspension = suspension;
	}

	private String Type = "";
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	//---constructors---
	public MountainBike() {
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}

	public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
						String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}
}
