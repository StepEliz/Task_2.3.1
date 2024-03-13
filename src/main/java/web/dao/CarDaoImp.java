package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{

    private List<Car> cars;

    public CarDaoImp() {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("Lada", "Y489EB136", "green"));
        cars.add( new Car("Kia", "P346JF013", "white"));
        cars.add( new Car("Opel", "H578MD103", "black"));
        cars.add( new Car("Haval", "J085UF035", "green"));
        cars.add( new Car("Mercedes", "A555AA101", "red"));
        this.cars = cars;
    }
    @Override
    public List<Car> getCar() {
        return cars;
    }

    public List<Car> getCountCar(int count) {
        List<Car> cars = getCar();
        return cars.stream().limit(count).toList();
    }
}
