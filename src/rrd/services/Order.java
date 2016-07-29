package rrd.services;
import java.util.Date;
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
	/**
	 * Bill To address 
	 */
	public Address billTo;
	/**
	 * Ship To address
	 */
	public Address shipTo;
	/**
	 * The effective order date
	 */
	public Date orderDate;
	/**
	 * Description of the order
	 */
	public String orderDescription;
	/**
	 * WCSS Corporate Number
	 */
	public String WCSSCororatepNumber;
	/**
	 * WCSS Corporate Name
	 */
	public String WCSSCorpName;
	/**
	 * WCSS Bill To Number
	 */
	public String WCSSBillToNumber;
	/**
	 * WCSS ECP Number
	 */
	public String WCSSECPNumber;
}
