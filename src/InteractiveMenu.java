import javax.swing.*;

public class InteractiveMenu {
    public static void menu(){

        String selector = JOptionPane.showInputDialog("Select:\n" +
                "1.To sum\n" +
                "2.To subtract\n" +
                "3.To multiplication\n" +
                "4.Division");
        float number1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter number one"));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter number 2"));

        switch (selector){
            case "1":
                JOptionPane.showMessageDialog(null, "Enter in sum selector");
                JOptionPane.showMessageDialog(null, number1 + " + " + number2 +" = "+ (number1+number2));
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Enter in subtract selector");
                JOptionPane.showMessageDialog(null, number1 + " - " + number2 +" = "+ (number1-number2));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Enter in multiplication selector");
                JOptionPane.showMessageDialog(null, number1 + " * " + number2 +" = "+ (number1*number2));
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Enter in division selector");
                if (number1==0 || number2==0){
                    JOptionPane.showInputDialog(null, "One number is equal to 0");
                } else {
                    JOptionPane.showMessageDialog(null, number1 + " / " + number2 +" = "+ (number1 + number2));
                } break;
            default:
                JOptionPane.showInputDialog(null, "Select a correct option");
                break;
        }
    }
}
