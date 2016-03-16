package dp_simple_factory_cars;

public class SimpleCarFactory {
	public Car createCar(String carType) {
		Car car;
		
		if(carType.equals("Mercedes")){
			car = new Mercedes();
		}else if(carType.equals("Ford")){
			car = new Ford();
		}else if(carType.equals("Chevrolet")){
			car = new Chevrolet();
		}else{
			car = new Car();
		}
		
		return car;
	}
}
