package dp_simple_factory_cars;

public class Car {
	protected String make;
	protected String model;
	protected int year;
	protected boolean hasCarFaxReport = false;
	protected boolean hasRustProofiing = true;
	protected int lotPosition;
	
	public Car(){
		this.make = "Unknown make.";
		this.model = "Unknown model.";
		this.year = -1;
	}
	
	public String formattedCarDescription(){
		String yearString;
		if(year > 0){
			yearString = Integer.toString(year);
		}else{
			yearString = "Unknown year";
		}
		
		String output = "Make: " + make + "\n" +
						"Model: " + model + "\n" +
						"Year: " + yearString + "\n";
		return output;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	public void applyRustCoating() {
		this.hasRustProofiing = true;
		System.out.println("Adding rust proofing to " + make);
	}
	
	public void printCarFaxReport() {
		this.hasCarFaxReport = true;
		System.out.println("Printing CarFax report for " + make);
	}
	
	public void placeInLot(int position){
		this.lotPosition = position;
		System.out.println(make + " has been placed on the lot in position " + position);
	}
}
