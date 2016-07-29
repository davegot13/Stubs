package rrd.services;

/**
 * Represents an attachment/document that will be sent to document storage
 */
public class Attachment
{
	/**
	 * The unique identifier for the attachment
	 */
	public String attachmentId;
	/**
	 * The file name
	 */
	public String fileName;
	/**
	 * Order/Estimate identifier, might not be known at time of initial upload
	 */
	public String orderId;
}
