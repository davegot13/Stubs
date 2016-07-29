package rrd.services;
import java.util.List;

/**
 * Contains the web service calls
 */
public class OrderServices 
{

	/**
	 * Will submit an order for creation in the target system (e.g. Custom Buy)
	 * @param submittedOrder the order to submit
	 * @return the response returned from the target system
	 */
	public List<ServiceResponse> createOrder(Order submittedOrder)
	{
		return null;
	}
	
	/**
	 * Will upload multiple attachments to the DAS
	 * @param attachments the list of attachments to upload
	 * @return the response returned from DAS
	 */
	public List<ServiceResponse> uploadToDAS(List<Attachment> attachments)
	{
		return null;
	}
}
