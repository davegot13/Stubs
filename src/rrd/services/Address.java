package rrd.services;

/**
 * Represents an address
 */
public class Address 
{
	/**
	 * Either BillTo or ShipTo 
	 */
	public String addressType;
	/**
	 * Country
	 */
	public String country;
	/**
	 * Street
	 */
	public String street;
	/**
	 * City
	 */
	public String city;
	/**
	 * State
	 */
	public String state;
	/**
	 * Postal Code
	 */
	public String postalCode;
}
