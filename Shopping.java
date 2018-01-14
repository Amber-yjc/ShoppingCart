package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * <p>Shopping: a driver that use a loop to ask users to buy things.</p>
 *
 * @author Amber(Ying-Ju) Chen
 * @version 2017
 */
public class Shopping {

    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        final int cartSize = 10;
        Transaction shopping = new Transaction(cartSize);
        Scanner scan = new Scanner(System.in);
        final double slipperPrice = 34.50;
        Item love = new Item("VS slippers", slipperPrice);
        shopping.addToCart(love);

        System.out.println("Would you like to shop?(y/n)");
        String answer = "";
        try {
            answer = scan.next();
        } catch (NullPointerException e) {
            System.out.println("Your shopping spree has ended.");
        }
        while (!answer.equalsIgnoreCase("y")) {
            System.out.println("Your shopping spree has ended.");
            break;
        }

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("What is the item name?");
            String itemName = scan.next();
            System.out.println("What is the item price?");
            double itemPrice = scan.nextDouble();
            System.out.println("What is the item quantity?");
            int quantity = scan.nextInt();
            shopping.addToCart(itemName, itemPrice, quantity);

            System.out.println("Shop more? (y/n)");
            try {
                answer = scan.next();
            } catch (NullPointerException e) {
                System.out.println("Your shopping spree has ended.");
            }
        }
        System.out.println(shopping.toString());
        scan.close();

    }

}
