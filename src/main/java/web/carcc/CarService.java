package web.carcc;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();


    List<Car> getCars(int count);
}
