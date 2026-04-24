import java.util.HashMap;
import java.util.Map;

public class BogieCapacityUC6 {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display all bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}