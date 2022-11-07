package carUtilities;

public class Car {
    private final String make;
    private final int price;
    private final int year;

    public Car(String make, int price, int year) {
        this.make = make;
        this.price = price;
        this.year = year;
    }

    public Car(int year){
        this.make = "DEFAULT";
        this.price = 0;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "\nmake: " + make
                +", price: " + price
                +", year: " + year;
    }
}
