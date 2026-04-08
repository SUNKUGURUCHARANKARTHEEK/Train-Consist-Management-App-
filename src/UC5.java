import java.util.LinkedHashSet;

public class TrainFormationUC5 {
    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // محاولة إضافة عنصر مكرر (duplicate)
        train.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("Train formation (in insertion order): " + train);
    }
}