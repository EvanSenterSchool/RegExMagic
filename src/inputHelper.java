import java.util.Scanner;

public class inputHelper {
    /*
     *Loops through until the user enters a valid int value
     * Displays error message and asks user to try again until valid input received
     */

    public static int getInt(Scanner scan, String prompt) {
        int num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                done = true;

            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static int getPositiveNonInt(Scanner scan, String prompt) {
        int num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num > 0) {
                    done = true;
                }
                else {
                    System.out.println("please enter a positive Integer");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= min && num <= max) {
                    done = true;
                }
                else {
                    System.out.println("please enter a Integer between " + min + "-" + max);
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }

    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        String input; //Stores String input by the user
        boolean done = false;
        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.matches(regExPattern)) {
                done = true;
            }
            else {
                System.out.println("Sorry your String does not match the pattern. Please try again");
            }
        } while (!done);
        return input;
    }
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String input; //Stores String input by the user
        boolean done = false;
        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.length() > 0) {
                done = true;
            } else {
                System.out.println("Sorry your String is not long enough. Please try again");
            }
        } while (!done);
        return input;
    }
    public static double getDouble(Scanner scan, String prompt) {
        double num = 0.0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                done = true;

            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (!done);
        return num;
    }
    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                if (num >= min && num <= max) {
                    done = true;
                }
                else {
                    System.out.println("please enter a double between " + min + "-" + max);
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (!done);
        return num;

    }
    public static Boolean getYNConfirm(Scanner scan, String prompt) {
        String input;
        boolean yesNo = false;
        boolean complete = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.equalsIgnoreCase("y")) {
                yesNo = true;
                complete = true;
            } else if (input.equalsIgnoreCase("n")) {
                yesNo = false;
                complete = true;

            } else {
                System.out.println("Error please enter only Y or N");
            }
        } while (!complete);
        return yesNo;
    }

}