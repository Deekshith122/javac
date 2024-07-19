class WomenClothing
{
	public static void kurti(String brand , double price)
	{
		System.out.println("running brand and price");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
	}
	public static void tops(String brand ,String color, char size, double price)
	{
		System.out.println("running brand, Color,size, price");
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("size :"+size);
		System.out.println("price :"+price);
	}
	public static void cropTop(String brand , double price , String sleeveType)
	{
		System.out.println("running brand , price , sleeveType");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("sleeveType :"+sleeveType);
	}
	public static void bottomWear(String brand , double price , String type , int size)
	{
		System.out.println("running brand , price ,type,size");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("type :"+type);
		System.out.println("size :"+size);
	}
	public static void dress(String brand , double price , String type ,long itemNo )
	{
		System.out.println("running brand , price , type , itemNo");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("type :"+type);
		System.out.println("itemNo :"+itemNo);
	}
	}class WomenClothingRunner
{
	public static void main (String[] args)
	{
		WomenClothing.kurti("AVAASA" , 1299.29);
		WomenClothing.tops("Levi's" , "BLACK" ,'M' , 2999.99);
		WomenClothing.cropTop("ZUDIO" , 599.78645 , "SLEEVELESS");
		WomenClothing.bottomWear("DNMX" ,999.9999, "MOM-FIT", 34);
		WomenClothing.dress("LOV" ,2149.89 , "A-LINE" , 30096353);
	}
}