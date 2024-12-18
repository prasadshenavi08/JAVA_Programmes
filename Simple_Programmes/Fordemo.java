class Fordemo{
	public static void main(String [] args){
		for(int i = 1; i<=10;i++){
			System.out.println(i);
		}
	}	
}


class Fordemo{
	public static void main(String [] args){
		int i = 1;
		for(;;){
			System.out.println(i);
			if( i<=10){
				break;
			}
		}
	}	
}