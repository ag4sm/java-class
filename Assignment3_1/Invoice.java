/*William "Josh" Scoville
 * Feb 23, 2017
 * 
 * Create a class called Invoice that a hardware store 
 * might use to represent an invoice for an item sold at the store. 
 * An Invoice should include four pieces of information as instance 
 * variables, a part number (type String), a part description 
 * (type String), a quantity of the item being purchased (type int) 
 * and a price per item (double). Your class should have a constructor 
 * that initializes the four instance variables. Provide a set and a get 
 * method for each instance variable. In addition, provide a method named 
 * getInvoiceAmount that calculates the invoice amount (i.e., multiplies 
 * the quantity by the price per item), then returns the amount as a double 
 * value. If the quantity is not positive, it should be set to 0. 
 * If the price per item is not positive, it should be set to 0.0. 
 * Write a test app named InvoiceTest that demonstrates class 
 * Invoice's capabilities. */

public class Invoice {

	public String productID;
	public String partDesc;
	public int qty;
	public Double itemPrice;
		
	public Invoice(String productID, String partDesc, Double itemPrice) {
		this.productID = productID;
		this.partDesc = partDesc;
		this.itemPrice = itemPrice;
	}
	
	public Invoice(int qty) {
		this.qty = qty;
	}
	
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	public String getProductID() {
		return productID;
	}
	
	public void setQty(int qty) {
		if (qty >= 0) {
			this.qty = qty;
		}
		else {
			this.qty = 0;
		}
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	public String getPartDesc() {
		return partDesc;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public Double getItemPrice() {
		if (itemPrice > 0.00) {
		return itemPrice;
		} else {
			return itemPrice = 0.0;
		}
	}
	
	public Double getInvoiceAmount() {
		double total = qty * itemPrice;
		return total;
	}
	
}