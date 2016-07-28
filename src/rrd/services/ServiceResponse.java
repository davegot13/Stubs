package rrd.services;

/**
 * Web Service response
 */
public class ServiceResponse 
{
	/*
	 * Error Code
	 */
	public String errorCode;
	/*
	 * Error message
	 */
	public String errorMessage;
	/*
	 * The unique identifier from the target system (e.g. Salesforce)
	 */
	public String sourceIdentifier;
	/*
	 * The identifier for the created record of the target system (e.g. Custom Buy)
	 */
	public String targetIdentifier;
}
