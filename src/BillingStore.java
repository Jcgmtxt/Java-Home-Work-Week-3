import javax.swing.*;

public class BillingStore {
    public static float billing(){
        String [] products = {"Potatoes", "Tomatoes", "Water", "Bread"};
        float [] prices = {10,20,30,40};
        int [] quantityProducts = new int[4];
        float totalPrice = 0;

        for (int i = 0; i < products.length; i++) {
            String input = JOptionPane.showInputDialog(null,
                    "Products: " + products[i] + "\nPrices: $" + prices[i] + "\n\nEnter the desired amount:",
                    "Selección de productos",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                quantityProducts[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                quantityProducts[i] = 0; // Si el usuario no ingresa un número válido, asumimos 0
            }
            System.out.println("product: " + products[i] + ". Quantity: " + quantityProducts[i] + ". Price: " + (prices[i] * quantityProducts[i]));
            totalPrice += (quantityProducts[i] * prices[i]);
        }
        System.out.println("Total price: " + totalPrice);
        return totalPrice;
    }

    public static void CalculatorDiscount (float totalPrice){
        double [] discounts = {1 , 0.9, 0.85, 0.8 , 0.75 };
        if (totalPrice >= 1000){
            JOptionPane.showMessageDialog(null, String.format("Your count is : %.2f\n Your discount is: %.0f Percent \nTotal to pay: %.2f",
                    totalPrice,((1-discounts[4])*100), (totalPrice*discounts[4])));
        } else if (totalPrice >= 500 ) {
            JOptionPane.showMessageDialog(null, String.format("Your count is : %.2f\n Your discount is: %.0f Percent \nTotal to pay: %.2f",
                    totalPrice, ((1-discounts[3])*100), (totalPrice*discounts[3])));
        } else if (totalPrice >= 300){
            JOptionPane.showMessageDialog(null, String.format("Your count is : %.2f\n Your discount is: %.0f Percent \nTotal to pay: %.2f",
                    totalPrice, ((1-discounts[2])*100), (totalPrice*discounts[2])));
        } else if (totalPrice >= 200 ) {
            JOptionPane.showMessageDialog(null, String.format("Your count is : %.2f\n Your discount is: %.0f Percent \nTotal to pay: %.2f",
                    totalPrice,((1-discounts[1])*100), totalPrice*discounts[1] ) );
        } else {
            JOptionPane.showMessageDialog(null, String.format("You don't have discount.\n Total to pay: %.0f",totalPrice));
        }
    }
}
