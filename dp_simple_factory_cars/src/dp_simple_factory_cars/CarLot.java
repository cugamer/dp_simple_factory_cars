package dp_simple_factory_cars;

public class CarLot {
	SimpleCarFactory carFactory;
	
	public CarLot(SimpleCarFactory carFactory) {
		this.carFactory = carFactory;
	}
	
	public Car readyForSale(String carType, int position){
		Car car = this.carFactory.createCar(carType); 
		
		car.applyRustCoating();
		car.printCarFaxReport();
		car.placeInLot(position);
		
		return car;
	}
}
