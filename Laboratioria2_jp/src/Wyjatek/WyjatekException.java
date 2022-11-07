package Wyjatek;

import carUtilities.Car;

import java.util.List;
import java.util.Objects;

public class WyjatekException extends Exception {

    public WyjatekException() {
    }

    private WyjatekException(String argument){
        System.out.println("Wystapil wyjatek, bledny argument wejsciowy: " + argument);
    }

    private WyjatekException(List<Car> carList){
        System.out.println("Wystapil wyjatek");
        System.out.println(carList.toString());
    }

    public List<Car> wyjatek(String argument, List<Car> carList) throws WyjatekException {
        if(Objects.equals(argument, "W")){
            throw new WyjatekException(carList);
        }
        else if(Objects.equals(argument, "R")){
            return carList;
        }
        else{
            throw new WyjatekException(argument);
        }
    }
}
