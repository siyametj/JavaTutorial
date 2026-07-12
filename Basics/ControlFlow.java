// ControlFLow.java 

public class ControlFlow {
    public static void main(String[] args) {
        // --------------- Basic If-Else & Else-If 
        // A marks for use 
        int marks = 10;
        // A initial for assign result from condition
        String grade; 

        if (marks >= 80) {
            grade = "A+";
        } else if (marks >= 33) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("Marks: " + marks + " | Grade: " + grade);

        // --------------- Logical Operator 
        int age = 16;
        boolean hasID = false;

        if (age >= 18 && hasID) {
            System.out.println("Welcome to the club"); // this block not run
        } else if (age >= 18 || !hasID) {
            System.out.println("A ID required for enter in club"); // this block run successfully
        } else {
            System.out.println("You are not eligible for enter in club"); // this block not run
        }

        // -------------- Ternary Operator 
        int siyamAge = 17;
        String devName = "Siyam";
        String status = (age <= 18 && devName == "Siyam") ? "Siyam is an minor" : "Siyam is an adult";
        System.out.println("DEV Name: " + devName + "\nAGE: " + age + "\nStatus: " + status);
        
        // -------------- Switch-Case 
        String myName = "Siyam";
        switch (myName) {
            case "Siyam":
                System.out.println("Name is siyam");
                break;

            case "Aria":
                System.out.println("Name is Aria");
                break;

            case "Ava":
                System.out.println("Name is Ava");
                break;

            default:
                System.out.println("Unknown Name");
        }

    }
}
