import java.util.*;
import java.util.stream.Collectors;

// Bogie class with type
class Bogie {
    String name;
    String type;
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class GroupBogiesUC9 {
    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 60));
        bogies.add(new Bogie("First Class", "Passenger", 40));
        bogies.add(new Bogie("Cargo", "Goods", 100));
        bogies.add(new Bogie("Parcel", "Goods", 80));

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped result
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}