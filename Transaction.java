package ca.bcit.comp1510.lab10;

import java.text.NumberFormat;

/**
 * <p>Transaction: stores three pieces of data.</p>
 * <li>an array of Item</li>
 * <li>total price</li>
 * <li>item count</li>
 *
 * @author Amber(Ying-Ju) Chen
 * @version 2017
 */
public class Transaction {
    /**
     * Size of the shopping cart.
     */
    private int arraySize;
    /**
     * The cart containing items.
     */
    private Item[] cart;
    /**
     * The total price of purchases.
     */
    private double totalPrice;
    /**
     * The amount of items purchased.
     */
    private int itemCount;
    
    /**
     * Constructs an object of type Transaction.
     * @param arraySize the size of the cart
     */
    public Transaction(int arraySize) {
        this.arraySize = arraySize;
        cart = new Item[this.arraySize];
        this.totalPrice = 0;
        this.itemCount = 0;
    }
    /**
     * Adding item to cart.
     * @param itemName the name of the item
     * @param itemPrice the price of the item
     * @param quantity the quantity of item
     */
    public void addToCart(String itemName, double itemPrice, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, itemPrice, quantity);
        totalPrice += itemPrice * quantity;
        itemCount++;
    }
    /**
     * Adding a new item to cart.
     * @param newItem the new item that is being added
     */
    public void addToCart(Item newItem) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = newItem;
        totalPrice += newItem.getItemPrice() * newItem.getQuantity(); 
        itemCount++;
    }
    /**
     * Increasing the size of the cart by 3.
     */
    public void increaseSize() {
        Item[] biggerCart = new Item[cart.length + (2 + 1)];

        for (int item = 0; item < cart.length; item++) {
            biggerCart[item] = cart[item];
        }

        cart = biggerCart;
    }
    /**
     * Returns the totalPrice for this Transaction.
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    /**
     * Get the number of type of items.
     * @return the count of different items
     */
    public int getCount() {
        return cart.length;
    }
    /**
     * Print out the items inside the cart, and its total price. 
     * @return the list of items
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String cartList = "";
        try {
        for (Item item : cart) {
            cartList += item.toString() + "\n";
        }
        } catch (NullPointerException e) {
            
        }
        cartList += "Total price of transaction: " + fmt.format(totalPrice);
        return cartList;
    }
    

}
