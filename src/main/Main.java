package main;

import java.util.ArrayList;
import java.awt.Color;

public class Main {
	static ArrayList<Customer> customers = new ArrayList<Customer>();
	static ArrayList<Classitems> listofitems = new ArrayList<Classitems>();
	static ArrayList<Order> listoforders = new ArrayList<Order>();
	static ArrayList<Payment> listofpayment = new ArrayList<Payment>();
	
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

	public static ArrayList<Customer> getcustomer() 
	{
		return customers;
	}

	public static ArrayList<Classitems> getitems() 
	{
		return listofitems;
	}
	
	public static ArrayList<Order> getorders() 
	{
		return listoforders;
	}
	
	public static ArrayList<Payment> getpayment()
	{
		return listofpayment;
	}

	public static void main(String[] args) {
		WelcomePage welcomeframe;
		Cashier cashier;

		try {
			welcomeframe = new WelcomePage();
			welcomeframe.getContentPane().setForeground(new Color(0, 0, 0));
			cashier = new Cashier();

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