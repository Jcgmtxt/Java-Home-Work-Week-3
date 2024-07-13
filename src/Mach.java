import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class Mach {
    public static void Array () {
        String rawText = JOptionPane.showInputDialog(null, "Enter a text");
        String text = rawText.toLowerCase();
        String[] textArray = text.split(" ");
        String match = "A mach was found in the position: ";
        String wordToSear = JOptionPane.showInputDialog(null, "Enter the word what to sear");
        if (textArray.length != 0){
            for (int i = 0 ; i < textArray.length ; i++){
                if (textArray[i].equals(wordToSear)){
                    match += String.format("%d ",(i+1));
                }
            }
        }
        if (textArray.length == 0){
            JOptionPane.showMessageDialog(null, "No matches found.");
        } else {
            JOptionPane.showMessageDialog(null, match);
        }
    }
}
