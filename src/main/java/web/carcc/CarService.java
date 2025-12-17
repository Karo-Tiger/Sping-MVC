package web.carcc;

import web.model.Car;

import java.util.List;

public interface CarService {
    // Метод для получения всех машин
    List<Car> getAllCars();

    // Метод для получения указанных n машин
    List<Car> getCars(int count);
}
