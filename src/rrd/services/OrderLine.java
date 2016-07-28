package rrd.services;

public class OrderLine 
{
	/**
	 * The product on the order line
	 */
	public Product item;
	/**
	 * The unit price of the item
	 */
	public double unitPrice;
	/**
	 * The number of units
	 */
	public double quantity;
	/**
	 * The total price
	 */
	public double totalPrice;
}
