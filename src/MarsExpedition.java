import javax.print.DocFlavor;
import java.net.UnknownServiceException;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("INITIATING BOOT...");
        Thread.sleep(1000);
        System.out.println("COMPILING SYSTEM RESOURCES...");
        Thread.sleep(720);
        System.out.println("DRAM: 512MB \n PROCESSOR 0: IBM POWER2 1662MHz 128 KB Cache \n MEMORY: 11027MB \n BIOS VER: 1.23.12c");
        System.out.println("LOADING OS...");
        Thread.sleep(1030);
        System.out.println("\nWelcome, please enter your name...");

        String username = scan.nextLine();
        System.out.println("Welcome back, " + username + " are you ready to explore the new world? Enter Y or N...");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("I'm afraid I cannot let you do that commander, initializing drop sequence...");
        }

        System.out.println("How many crew members will be joining you?");
        int crew = scan.nextInt();
        scan.nextLine();
        if (crew > 2) {
            System.out.println(crew + " is too many, auto-selecting 2.");
            crew = 2;
        } else if (crew < 2) {
            System.out.println(crew + " is too few, auto-selecting 2.");
            crew = 2;
        } else if (crew == 2) {
            System.out.println("Excellent choice");
        } else {
            System.out.println("Invalid Input, auto-selecting 2");
            crew = 2;
        }

        System.out.println("Please enter one(1) snack to bring with you:");
        String snack = scan.nextLine();
        System.out.println(snack + " selected.");

        System.out.println("Select a vehicle from the following options" +
                "\nA. A Toyota Prius" +
                "\nB. A Porsche 911" +
                "\nC. A Mars Rover");
        String vChoice = scan.nextLine();
        if (vChoice.equalsIgnoreCase("a")) {
            vChoice = "Toyota Prius";
        } else if (vChoice.equalsIgnoreCase("b")) {
            vChoice = "Porsche 911";
        } else if (vChoice.equalsIgnoreCase("c")) {
            vChoice = "Mars Rover";
        }

        System.out.println(username + ", you have selected the following options" +
                "\nNumber of crew: " + crew +
                "\nOne(1) snack: " + snack +
                "\nVehicle: " + vChoice +
                "\nIs this information correct? Enter Y or N");
        String infoCheck = scan.nextLine();
        if (infoCheck.equalsIgnoreCase("y")) {
            System.out.println("Excellent, initializing countdown...");
        } else {
            System.out.println("Too bad, initializing countdown...");
        }
        System.out.println("Launching in: 5");
        Thread.sleep(1000);
        System.out.println("Launching in: 4");
        Thread.sleep(1000);
        System.out.println("Launching in: 3");
        Thread.sleep(1000);
        System.out.println("Launching in: 2");
        Thread.sleep(1000);
        System.out.println("Launching in: 1");
        Thread.sleep(1000);
        System.out.println("Launch successful, terminating program.");
    }

}
