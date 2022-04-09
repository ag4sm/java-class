/*William "Josh" Scoville
 * Feb 23, 2017 */

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//creates 2 instances of the Invoice object and assigns values
		Invoice invoice1 = new Invoice("1001","Roofing Hammer" , 19.99);
		Invoice invoice2 = new Invoice("1002","Staple Gun" , 14.99);
		
		invoice1.setQty(12); // sets the quantity for the invoice1 instance
		invoice2.setQty(14); // sets the quantity for the invoice2 instance
		
		// prints initial information to the user and gets the data from the Inovoice methods for invoice1
		System.out.printf("Your invoice is below: %n%nItem No.: %s\t\tQty.: %s\tPart: %s\tPrice: $%s",
				invoice1.getProductID(), 
				invoice1.getQty(), 
				invoice1.getPartDesc(),
				invoice1.getItemPrice());

		System.out.println(); // blank space
		
		System.out.printf("Your total is:  $%.2f" , invoice1.getInvoiceAmount()); // gives the total amount
		
		System.out.println(); // blank space
		System.out.println(); // blank space

		// prints output from the get methods for invoice2
		System.out.printf("Item No.: %s\t\tQty.: %s\tPart: %s\tPrice: $%s",
				invoice2.getProductID(), 
				invoice2.getQty(), 
				invoice2.getPartDesc(),
				invoice2.getItemPrice());

		System.out.println(); // blank space
		
		System.out.printf("Your total is:  $%.2f" , invoice2.getInvoiceAmount()); // gives the total amount
		
	}

}

/*
Your invoice is below: 

Item No. 1001		Qty. 5	Part Roofing Hammer	Price $19.99
Your total is:  $99.95

Item No. 1002		Qty. 7	Part Staple Gun	Price $14.99
Your total is:  $104.93



Your invoice is below: 

Item No.: 1001		Qty.: 12	Part: Roofing Hammer	Price: $19.99
Your total is:  $239.88

Item No.: 1002		Qty.: 14	Part: Staple Gun	Price: $14.99
Your total is:  $209.86
*/

