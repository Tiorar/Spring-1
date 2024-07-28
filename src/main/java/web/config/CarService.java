package web;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry"));
        cars.add(new Car(2, "Honda", "Accord"));
        cars.add(new Car(3, "Ford", "Mustang"));
        cars.add(new Car(4, "Chevrolet", "Malibu"));
        cars.add(new Car(5, "Nissan", "Altima"));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}

