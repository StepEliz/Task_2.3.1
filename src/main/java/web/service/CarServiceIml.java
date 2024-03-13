package web.service;

import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceIml implements CarService{
    @Override
    public List<Car> getCar(int count) {
        CarDaoImp carDaoImp = new CarDaoImp();
        return carDaoImp.getCountCar(count);
    }
}
