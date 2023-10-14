package school.mjc.stage0.conditions.task1;

public class ConditionalFalsePrinter {
    public static void main(String[] args) {
        boolean condition = false;

        if (condition) {
            // This block won't be executed because the condition is false.
            System.out.println("true");
        } else {
            // This block will be executed because the else part is triggered when the condition is false.
            System.out.println("false");
        }
    }
}