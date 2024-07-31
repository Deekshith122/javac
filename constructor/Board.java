class Board{
	String boardtype;
	String size;
	double weight;
	
	
	 Board(String boardtype1,String size1,double weight1){ 
		 boardtype=boardtype1;
		 size=size1;
		 weight=weight1;

		 System.out.println("boardtype updated :"+boardtype);
		 System.out.println("size updated:"+size);
		 System.out.println("weight updated:"+weight);
		 System.out.println("create Board");
	}
}