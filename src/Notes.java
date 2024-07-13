import javax.swing.*;

public class Notes {
    private static final int TOTAL_NOTES = 8;
    private static final float MINIMUM_PASSING_AVERAGE = 76.0f;
    public static void qualificationsNeedToPass() {
        float[] yourNotes = new float[TOTAL_NOTES];
        int notesEntered = 0;
        float sumOfNotes = 0;

        for (int i = 0; i < yourNotes.length; i++) {
            String input = JOptionPane.showInputDialog(null,
                    "Enter your note for subject " + (i + 1) + " (0-100)\n" +
                            "Or enter 'q' to quit and calculate the average needed.");

            if (input == null || input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                float note = Float.parseFloat(input);
                if (note < 0 || note > 100) {
                    throw new IllegalArgumentException("Note must be between 0 and 100");
                }
                yourNotes[i] = note;
                sumOfNotes += note;
                notesEntered++;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                i--; // Retroceder para volver a pedir esta nota
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                i--; // Retroceder para volver a pedir esta nota
            }
        }

        int remainingNotes = TOTAL_NOTES - notesEntered;

        if (remainingNotes == 0) {
            float average = sumOfNotes / TOTAL_NOTES;
            if (average >= MINIMUM_PASSING_AVERAGE) {
                JOptionPane.showMessageDialog(null, String.format("Congratulations! You've already passed the course with an average of %.2f", average));
            } else {
                JOptionPane.showMessageDialog(null, String.format("Unfortunately, you've failed the course with an average of %.2f", average));
            }
        } else {
            float requiredSum = MINIMUM_PASSING_AVERAGE * TOTAL_NOTES;
            float remainingSum = requiredSum - sumOfNotes;
            float requiredAverage = remainingSum / remainingNotes;

            if (requiredAverage > 100) {
                JOptionPane.showMessageDialog(null, "It's not possible to pass the course with the current grades.");
            } else {
                JOptionPane.showMessageDialog(null, String.format(
                        "You need an average of %.2f in the remaining %d notes to pass the course.",
                        requiredAverage, remainingNotes));
            }
        }
    }
}
