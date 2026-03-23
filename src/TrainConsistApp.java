import java.util.LinkedHashSet;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // Ignored

        // Display final formation
        System.out.println("Train Formation: " + train);
    }
}