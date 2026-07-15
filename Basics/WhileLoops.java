// WhileLoops.java 

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("Loop start");

        while (isRunning) {
            System.out.println("Write 'exit' if you want to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                isRunning = false;
                System.out.println("Loop close successfully!");
            } else {
                System.out.println("You said: " + input);
            }

        }
        scanner.close();
    }
}
