package web.carcc;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    private static final  List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Mersedes",2020,"Bleck"));
        cars.add(new Car("Mistang",2022,"Red"));
        cars.add(new Car("BMW",2023,"Blue"));
        cars.add(new Car("Reng-Rover",2024,"Red"));
        cars.add(new Car("Volva",2024,"Blue"));
    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }


    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
