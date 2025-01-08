import java.io.*;
public class ConsoleDemo {

	public static void main(String[] args) {
		//Console c1 =new Console(); it is not possible because console does not have default constructor
		Console c1=System.console();
		System.out.println("Enter UserName");
		String uname=c1.readLine();
		
		System.out.println("Enter Password");
		char[]p=c1.readPassword();
		String pwd=new String(p);
		
		if (uname.equals("tejas") && pwd.equals("123")) {
			System.out.println("Congrachulation! Login Successful..!");
		} else {
			System.out.println(" Enter Valid Username & pass");
		}
		
		}

}