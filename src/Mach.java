import javax.swing.*;
import java.util.Locale;

public class Mach {
    public static void Array () {
        String text = JOptionPane.showInputDialog(null, "Enter a text").toLowerCase(Locale.ROOT);
        String[] textArray = text.split(" ");
        String wordToSear = JOptionPane.showInputDialog(null, "Enter the word what to sear");
        if (textArray.length != 0){
            for (int i = 0 ; i < textArray.length ; i++){

            }
        }
    }
}
