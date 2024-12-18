class Dowhile3{
	public static void main(String [] args){
		int no=1;
		do{
			if(no%5==0){
				System.out.println(no);
			}
			no++;
		}while(no<=100);
	}
}