package carUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarCreator {

    private final List<String> makes = new ArrayList<>();
    private final Random random = new Random();

    public CarCreator() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("src/resources/makes.txt"));
        while(reader.hasNextLine()){
            makes.add(reader.nextLine());
        }
        reader.close();
    }

    public Car create(){
        return new Car
                (makes.get(random.nextInt(makes.size())),
                random.nextInt(25000 - 500) + 500,
                random.nextInt(2022 - 1960) +1960);
    }
}
