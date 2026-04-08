import java.util.HashSet;

public class UniqueBogieIDsUC3 {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");

        // Attempt to add duplicate IDs
        bogieIDs.add("B102"); // duplicate
        bogieIDs.add("B101"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}