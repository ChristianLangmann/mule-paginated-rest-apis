package de.codecentric.mule;

import java.util.Vector;

public class PageCollector {

	private String continuationToken;
	private Vector<Object> collectedElements = new Vector<Object>();
	
	public PageCollector(String firstPageToken) {
		continuationToken = firstPageToken;
	}
	
	public String getContinuationToken() {
		return continuationToken;
	}
	
	public Object[] getCollectedElements() {
		return collectedElements.toArray();
	}
	
	public void setContinuationToken(String token) {
		continuationToken = token;		
	}
	
	public void addElements(Object[] pageElements) {
		for (Object object : pageElements) {
			collectedElements.add(object);			
		}
	}
}
