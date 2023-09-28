class Product
{

	int id,price,qty;
	String name;
	
	//setter
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
   
   //Constructor 
   
   public Product(int id,String name,int price,int qty)
   {
	   this.id=id;
	   this.name=name;
	   this.price=price;
	   this.qty=qty;
   }

  public Product()
  {
	  
  }
  
        
  //Getter
  
  public int getId()
  {
	  return id;
  }
  
  public String getName()
  {
	  return name;
  }
  
  public int getPrice()
  {
	  return price;
  }
  
  public int getQty()
  {
	  return qty;
  }



}