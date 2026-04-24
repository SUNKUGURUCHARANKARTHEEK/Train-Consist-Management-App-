import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class SafetyComplianceUC12 {
    public static void main(String[] args) {

        // Create collection of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety compliance check: Cylindrical bogies can only carry Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // Other types are allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("Train is safety compliant.");
        } else {
            System.out.println("Train is NOT safety compliant!");
        }
    }
}