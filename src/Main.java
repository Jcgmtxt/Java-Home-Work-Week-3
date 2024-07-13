import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            String selector = JOptionPane.showInputDialog("Select one option:\n"+
                    "1.Interactive menu.\n" +
                    "2.Billing of a store.\n" +
                    "3.Semana3.Notes from a course.\n" +
                    "4.Discount calculator.\n" +
                    "5.Search for words.\n" +
                    "6.Search by coincidence in arrays.\n" +
                    "7.Transposition of a Matrix.\n" +
                    "8.Verify Symmetric Matrix.\n" +
                    "9.Count matches in an Array.\n" +
                    "10.Invert an Array.\n" +
                    "11.Exit");

            switch (selector){
                case "1":
                    System.out.println("You are select option number one");
                    InteractiveMenu.menu();
                    break;
                case "2":
                    BillingStore.billing();
                    break;
                case "3":
                    Notes.qualificationsNeedToPass();
                    break;
                case "4":
                    float totalPrice = BillingStore.billing();
                    BillingStore.CalculatorDiscount(totalPrice);
                    break;
                case "5":
                    Mach.Array();
                    break;
                case "6":
                    System.out.println("aaa");
                    break;
                case "7":
                    System.out.println("aaa");
                    break;
                case "8":
                    System.out.println("aaa");
                    break;
                case "9":
                    System.out.println("bbb");
                    break;
                case "10":
                    System.out.println("aaaa");
                    break;
                case "11":
                    System.out.println("Bye Bye");
                    flag = false;
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Select a correct option");
            }
        }
    }
}