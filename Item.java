package ca.bcit.comp1510.lab10;

/**
 * <p>Item: stores three pieces of data.</p>
 * <li>name of item</li>
 * <li>price of item</li>
 * <li>quantity of item being purchased</li>
 *
 * @author Amber(Ying-Ju) Chen
 * @version 2017
 */
public class Item {
    /**
     * The name of item.
     */
    private final String itemName;
    /**
     * The price of item.
     */
    private final double itemPrice;
    /**
     * The quantity of item being purchased.
     */
    private final int quantity;

    /**
     * Constructs an object of type Item.
     * 
     * @param itemName
     *            the name of item
     * @param itemPrice
     *            the price of item
     * @param quantity
     *            quantity of item purchased
     */
    public Item(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    /**
     * Constructs an object of type Item.
     * 
     * @param itemName
     *            the name of item
     * @param itemPrice
     *            the price of item
     */
    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = 1;
    }

    /**
     * Returns the itemName for this Item.
     * 
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Returns the itemPrice for this Item.
     * 
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Returns the quantity for this Item.
     * 
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /*
     * @see java.lang.Object#toString()
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Item [itemName=" + itemName + ", itemPrice=" 
        + itemPrice + ", quantity=" + quantity + "]";
    }

}
