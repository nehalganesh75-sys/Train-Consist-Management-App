import java.util.ArrayList;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("Bogies after adding: " + bogies);

        // Remove a bogie
        bogies.remove("AC Chair");

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists");
        }

        // Final list
        System.out.println("Final bogies: " + bogies);
    }
}
