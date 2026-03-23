import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add bogie-capacity pairs
        map.put("Sleeper", 72);
        map.put("AC Chair", 60);
        map.put("First Class", 24);

        // Iterate and display
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}