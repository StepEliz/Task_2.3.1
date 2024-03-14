package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceIml implements CarService {
    private final List<Car> cars;

    public CarServiceIml() {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("Lada", "Y489EB136", "green"));
        cars.add( new Car("Kia", "P346JF013", "white"));
        cars.add( new Car("Opel", "H578MD103", "black"));
        cars.add( new Car("Haval", "J085UF035", "green"));
        cars.add( new Car("Mercedes", "A555AA101", "red"));
        this.cars = cars;
    }
    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
