Simple factory design convention car sales lot
==============================================

An implementation of the simple factory convention as applied to a car sales lot.  The Car class is subclassed into specific models of car.  The SimpleCarFactory class holds the createCar method which actually instantiates the individual car objects.  It just cares about returning an object with the Car interface.  The CarLot readyForSale method needs a Car object to work with and return, it uses the SimpleCarFactory createCar method to actually instantiate the object.  This is basic practice with the simple factory design convention.



![UML diagram of project](https://github.com/cugamer/dp_simple_factory_cars/blob/master/dp_simple_factory_cars/dp_simple_factory_cars.png)
