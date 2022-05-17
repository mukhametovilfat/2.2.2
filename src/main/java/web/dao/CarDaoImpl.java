package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("kia", "blue", 160));
        allCars.add(new Car("bmw", "red", 220));
        allCars.add(new Car("audi", "silver", 180));
        allCars.add(new Car("lada", "molin", 140));
        allCars.add(new Car("Hyundai", "blue", 160));
        return allCars;
    }
}
