public class CommitCafe {

    private static String barista = "Edward"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String nickname = "edcho1012";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups += 1;
        System.out.println("Brewing " + drink + "...Total cups: " + cups);
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("By " + nickname + "-" + barista);
        if(cups >= 10) {
            System.out.println("Machine needs cleaning!");
        }
    }   

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}