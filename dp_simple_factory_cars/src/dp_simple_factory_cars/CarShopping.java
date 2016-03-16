package dp_simple_factory_cars;

public class CarShopping {
	public static void main(String[] args) {
		SimpleCarFactory carFactory = new SimpleCarFactory();
		CarLot carLot = new CarLot(carFactory);
		System.out.println("Car lot is open.");
		
		Car car1 = carLot.readyForSale("Mercedes", 42);
		System.out.println(car1.formattedCarDescription());
		
		Car car2 = carLot.readyForSale("Ford", 57);
		System.out.println(car2.formattedCarDescription());
		
		Car car3 = carLot.readyForSale("Chevrolet", 1);
		System.out.println(car3.formattedCarDescription());

	}

}
