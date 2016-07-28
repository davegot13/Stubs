package rrd.services;
import java.util.List;

/**
 * This is a representation of an end customer's view of an order
 *
 */
public class Order
{
	/**
	 * The master order number
	 */
	public String orderNumber;
	/**
	 * The list of items on an order which can consist of multiple suppliers
	 */
	public List<OrderLine> lineItems;
}
