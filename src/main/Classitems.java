package main;

public class Classitems extends Order{
	//ITEMS DATA
	private int itemnumber;
    private String itemname;
    private int quantity;
    private double totalitems;
    
    public Classitems(){
        orderid = null;
        itemnumber = 0;
        itemname = null;
        quantity = 0;
        totalitems = 0;
    }
    
    public Classitems(String orderid, int itemnumber, String itemname, int quantity, double totalitems){
        this.orderid = orderid;
        this.itemname = itemname;
        this.quantity = quantity;
        this.itemnumber = itemnumber;
        this.totalitems = totalitems;
    }
    
    //ACCESSOR
    public int getitemnumber() {
    	return itemnumber;
    }
    
    public String getitemname(){
        return itemname;
    }
    
    public int getquantity(){
        return quantity;
    }
    
    public String getorderid(){
        return orderid;
    }
    
    public double gettotalitems() {
    	return totalitems;
    }
}
