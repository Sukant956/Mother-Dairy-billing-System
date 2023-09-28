import java.util.*;
class MotherDairy
{
	public static void main(String st[])
	{
		
		System.out.println("#############################");
		System.out.println("## WELCOME TO MOTHER DAIRY ##");
		System.out.println("#############################\n");
		
		ArrayList<Product> list=new ArrayList<Product>();
		
		Scanner sc=new Scanner(System.in);
		int choice=123;
		
		while(!(choice==0))
		{
			System.out.println("Press 1 for Add Product\nPress 2 for Find Product\nPress 3 for Sale Product\nPress 4 for Read All Product\nPress 0 for Exit");
			
			choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.print("Enter Product ID: ");
				int id=sc.nextInt();
				System.out.print("Enter Product Price: ");
				int price=sc.nextInt();
				System.out.print("Enter Product Quantity: ");
				int qty=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Product Name: ");
				String name=sc.nextLine();
                  
				Product obj=new Product(id,name,price,qty);
                list.add(obj);
				System.out.println("\nProduct Added Successfully!\n");
			}
			else if(choice==2)
			{
				System.out.print("Enter Product ID: ");
				int id=sc.nextInt();
				
				System.out.println("#############################");
				System.out.println("ID\tNAME\tPRICE\tQTY");
				System.out.println("#############################");
				
				Iterator<Product> itr=list.iterator();
				
				while(itr.hasNext())
				{
					
				  Product obj = itr.next();	
					
					if(obj.getId()==id)
					{
					System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getQty());	
					}
				}
				
				System.out.println("\n#############################\n");
				
			}
			else if(choice==3)
			{
				System.out.print("Enter Product ID: ");
				int id=sc.nextInt();
				
				System.out.print("Enter Product Qty: ");
				int qty=sc.nextInt();
				
				System.out.println("SN\tProduct\tPRICE\tQTY\tTOTAL");
				
				Iterator<Product> itr=list.iterator();
				
				while(itr.hasNext())
				{
					
				  Product obj = itr.next();	
					
					if(obj.getId()==id)
					{
						int total=qty*obj.getPrice();
					System.out.println("1"+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+qty+"\t"+total);
                      double gst=total*18/100;
                       System.out.print("\t\tGST: "+gst+"\n");

                     System.out.print("Net Payable Amount is:- "+(total+gst)+"/-");	
					 int actualQty=obj.getQty()-qty;
					 obj.setQty(actualQty);				   

 					
					}
				}
				
				System.out.println("\n#############################\n");
				
			}
			
			
			
			
			
			
		}	
	}
}