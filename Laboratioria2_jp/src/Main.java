import Wyjatek.WyjatekException;
import carUtilities.Car;
import carUtilities.CarCreator;
import carUtilities.CarFinder;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, WyjatekException {

        List<Car> carList = new ArrayList<>();
        CarCreator carCreator = new CarCreator();
        CarFinder carFinder = new CarFinder();

        for(int i = 0; i < Integer.parseInt(args[0]); i++){
            carList.add(carCreator.create());
        }

        WyjatekException wyjatekException = new WyjatekException();
        System.out.println(wyjatekException.wyjatek(args[1],carList).toString());

        System.out.println("What to do?\n1. Find youngest car\n2. Find oldest car\n3. Find cars younger than given year\n4. Find cars older than given year");
        EasyReader reader = new EasyReader(System.in);
        int choice = reader.intInput();

        switch (choice){
            case 1 -> System.out.println(carFinder.findYoungestCar(carList).toString());
            case 2 -> System.out.println(carFinder.findOldestCar(carList).toString());
            case 3 -> {
                System.out.println("What year?");
                choice = reader.intInput();
                System.out.println(carFinder.findCarsYoungerThan(carList, choice).toString());
            }
            case 4 ->{
                System.out.println("What year?");
                choice = reader.intInput();
                System.out.println(carFinder.findCarsOlderThan(carList, choice).toString());
            }
            default -> System.out.println("Wrong choice");
        }
    }
}