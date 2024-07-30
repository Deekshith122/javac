class ApplicationRunner
{
	public static void main(String[]args){
		
		System.out.println("start main in Application");
	Application application= new Application();
	String name=application.name;
	int estblishYear=application.estblishYear;
	String logo=application.logo;
	System.out.println("application:"+name);
	System.out.println("application:"+estblishYear);
	System.out.println("application:"+logo);
	System.out.println("end main in Application");
	}
}