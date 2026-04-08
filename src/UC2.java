import java.util.ArrayList;

public class PassengerBogiesUC2 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie
        bogies.remove("AC Chair");
        System.out.println("Bogies after removal: " + bogies);

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final bogie list: " + bogies);
    }
}