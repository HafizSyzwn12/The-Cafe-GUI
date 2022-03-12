package main;

import java.util.ArrayList;
import java.awt.Color;

public class Main {
	static ArrayList<Customerclass> customers = new ArrayList<Customerclass>();
	static ArrayList<Itemsclass> listofitems = new ArrayList<Itemsclass>();
	static ArrayList<Ordersclass> listoforders = new ArrayList<Ordersclass>();
	static ArrayList<Paymentclass> listofpayment = new ArrayList<Paymentclass>();
	
	//CONFIGURATION
	static private Double memberdiscount = 0.05;
	static private String applicationname = "The Cafe";
	static private String contributors = "hafizsyazwan,batisha,famiza,izzat";
	
	static public String getappname() 
	{
		return applicationname;
	}
	
	static public String getcontributor() 
	{
		return contributors;
	}
    
	static public double getdiscountvalue()  
	{
			return memberdiscount;
    }

	public static ArrayList<Customerclass> getcustomer() 
	{
		return customers;
	}

	public static ArrayList<Itemsclass> getitems() 
	{
		return listofitems;
	}
	
	public static ArrayList<Ordersclass> getorders() 
	{
		return listoforders;
	}
	
	public static ArrayList<Paymentclass> getpayment()
	{
		return listofpayment;
	}

	public static void main(String[] args) {
		Welcomeframe welcomeframe;
		Cashierframe cashier;

		try {
			welcomeframe = new Welcomeframe();
			welcomeframe.getContentPane().setForeground(new Color(0, 0, 0));
			cashier = new Cashierframe();

			welcomeframe.setVisible(true);
			Thread.sleep(2000);
			welcomeframe.progressBar.setVisible(true);
			try {
				for (int i = 0; i <= 100; i += 4) {
					Thread.sleep(20);
					welcomeframe.progressBar.setValue(i);
					welcomeframe.lblNewLabel_3.setText("Welcome! Starting up " + i + "%");
				}
				Thread.sleep(1000);
				welcomeframe.setVisible(false);
				cashier.setVisible(true);
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}