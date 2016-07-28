package rrd.services;
import java.util.List;

public class OrderLine 
{
	/**
	 * The unique identifier for the order line
	 */
	public String orderLineId;
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
	/**
	 * The external order number associated with this line
	 */
	public String ExternalOrderNumber;
	/**
	 * Attachments/documents associated to the order line
	 */
	public List<Attachment> attachments;
}
