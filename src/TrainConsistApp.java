import java.util.HashSet;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs
        bogieIDs.add("B1");
        bogieIDs.add("B2");
        bogieIDs.add("B3");
        bogieIDs.add("B2"); // Duplicate (ignored)

        // Display unique bogies
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}
