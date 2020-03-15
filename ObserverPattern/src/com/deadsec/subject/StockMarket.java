package com.deadsec.subject;

import java.util.ArrayList;

import com.deadsec.observer.Observer;

public class StockMarket implements Subject{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applPrice;
	
	public StockMarket() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		
		observers.add(newObserver);
		
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		
		int index = observers.indexOf(deleteObserver);
		System.out.println("Deleting Observer " + (index+1));
		observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		
		for(Observer observer : observers) {
			observer.update(ibmPrice, applPrice);
		}	
	}
	
	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setAPPLPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

}
