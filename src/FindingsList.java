import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome back commander, let us begin the expedition.");

        ArrayList<String> rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        Thread.sleep(500);
        System.out.println("Expedition complete commander, here is what rocks we found: " + rocks);
        System.out.println("It seems there has been an error, we have included a non-rock, removing item...");
        rocks.remove("not rock");
        System.out.println("Error corrected, updated list: " + rocks);

        System.out.println("Compiling fossil data...");
        Thread.sleep(1000);
        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Compilation complete, which of the fossils (Bird, Fish, Tooth) would you like to know more about?");
        String fChoice = scan.nextLine();

        if (fChoice.equalsIgnoreCase("bird")) {
            Thread.sleep(400);
            System.out.println(fossils.get("Bird Fossil"));
        } else if (fChoice.equalsIgnoreCase("fish")) {
            Thread.sleep(400);
            System.out.println(fossils.get("Fish Fossil"));
        } else if (fChoice.equalsIgnoreCase("tooth")) {
            Thread.sleep(400);
            System.out.println(fossils.get("Tooth Fossil"));
        } else {
            System.out.println("Invalid input");
        }

        HashSet<String> exSupplies = new HashSet<>();
        exSupplies.add("Cheetos");
        exSupplies.add("Doritos");
        exSupplies.add("Fritos");

        System.out.println("Embarking on a new expedition, here are our supplies: " + exSupplies);
        System.out.println("Mission in progress...");
        Thread.sleep(3000);

        exSupplies.remove("Cheetos");

        System.out.println("Here are our supplies after the mission: " + exSupplies);
    }

}
