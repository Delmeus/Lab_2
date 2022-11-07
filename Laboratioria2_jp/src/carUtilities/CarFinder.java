package carUtilities;

import java.util.ArrayList;
import java.util.List;

public class CarFinder {

    public Car findYoungestCar(List<Car> carList){
        Car youngestFound = new Car(0);
        for (Car car : carList) {
            if (car.getYear() > youngestFound.getYear()) youngestFound = car;
        }
        return youngestFound;
    }

    public Car findOldestCar(List<Car> carList){
        Car oldestFound = new Car(2023);
        for (Car car : carList) {
            if (car.getYear() < oldestFound.getYear()) oldestFound = car;
        }
        return oldestFound;
    }

    public List<Car> findCarsOlderThan(List<Car> carList, int year){
        List<Car> foundList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() <= year) foundList.add(car);
        }
        return foundList;
    }

    public List<Car> findCarsYoungerThan(List<Car> carList, int year){
        List<Car> foundList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() >= year) foundList.add(car);
        }
        return foundList;
    }
}
