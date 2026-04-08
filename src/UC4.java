import java.util.LinkedList;

public class TrainConsistUC4 {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial train consist: " + train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("After adding Pantry Car: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("Final train consist: " + train);
    }
}