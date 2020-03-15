package com.deadsec.observer;

import com.deadsec.subject.Subject;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double applPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer : " + this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double applPrice) {
		
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices() {
		System.out.println(observerID + "\nIBM : " + ibmPrice +
				"\nAPPLE : " + applPrice);
	}

}
