package com.deadsec.test;

import com.deadsec.observer.StockObserver;
import com.deadsec.subject.StockMarket;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockMarket stockMarket = new StockMarket();
		
		StockObserver observer1 = new StockObserver(stockMarket);
		
		stockMarket.setIBMPrice(197.00);
		stockMarket.setAPPLPrice(250.00);
		
		StockObserver observer2 = new StockObserver(stockMarket);
		
		stockMarket.setIBMPrice(198.10);
		stockMarket.setAPPLPrice(251.02);
		
	}
}
