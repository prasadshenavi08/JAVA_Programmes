import java.util.Scanner;
class switchDemo2{
	public static void main(String [] args){
		String taste;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which taste you like");
		System.out.println("Select your taste 1 sweet ,2 spicy");
		taste = sc.next();
		switch(taste){
			case "sweet" : System.out.println("You select gulab jamun , basundi, shrekhand");
			break;
			case "spicy": System.out.println("You select mirchi,maagi,chill");
			break;
			default: System.out.println("Invalid");
		}
	}	
}