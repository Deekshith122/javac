class  MatrimonyRunner
{
	
	public static void main(String[]args){
		
	System.out.println("Start main in matrimony");	
	
	Matrimony matrimony = new Matrimony();
	int age=matrimony.age;
	String gender=matrimony.gender;
	long mobileno=matrimony.mobileno;
	System.out.println("matrimony age:"+age);
	System.out.println("matrimony gender:"+gender);
	System.out.println("matrimony mobileno:"+mobileno);
	matrimony.age=21;
	matrimony.gender="male";
	matrimony.mobileno=7656467582L;
	System.out.println("matrimony is updated:"+matrimony.age);
	System.out.println("matrimony is updated:"+matrimony.gender);
	System.out.println("matrimony is updated:"+matrimony.mobileno);
	System.out.println("end main in matrimony");
	}
}