package bikeproject;

public class RoadBike extends Bike implements RoadParts {
	//---fields and methods of a class---
	private int  tyreWidth, postHeight;
	
	public void printDescription() {
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}
	//---implementation to the interface---
	private String TyreWidth = "";
	public String getTyreWidth() {
		return TyreWidth;
	}
	public void setTyreWidth(String TyreWidth) {
		this.TyreWidth = TyreWidth;
	}

	private String PostHeight = "";
	public String getPostHeight() {
		return PostHeight;
	}
	public void setPostHeight(String PostHeight) {
		this.PostHeight = PostHeight;
	}
	//---constructors---
	public RoadBike() {
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}

	public RoadBike(int postHeight) {
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}

	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
					int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}
}
