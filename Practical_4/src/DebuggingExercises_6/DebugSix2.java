package DebuggingExercises_6;

// DebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
// Or my much better way which displays
public class DebugSix2 {
    public static void main(String args[]) {
        char letter;
        int a;
        final int MIN = 65;
        final int MAX = 122;
        final int STOP_LINE_1 = 90;
        final int STOP_LINE_chars = 96;
        final int STOP_LINE_2 = 122;
        for (a = MIN; a <= MAX; a++) {
            letter = (char) a;

            System.out.print("  " + letter);

            if ((a == STOP_LINE_1) || (a== STOP_LINE_chars) || (a == STOP_LINE_2))
                System.out.println();
        }
        System.out.println("\nEnd of application");
    }
}