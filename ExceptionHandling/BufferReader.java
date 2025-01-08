import java.io.*;
import java.util.*;

public class BufferReader {
	public static void main(String[] args)throws Exception {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name=br.readLine();
		
		System.out.println("Enter Age");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println(name+" "+age);
		*/
		File f1=new File("Book.txt");
		Scanner sc=new Scanner(f1);
		System.out.println(sc.nextLine());
		
		String s="hello ,I am Prasad \n waehdsaj";
		sc=new Scanner(s);
		System.out.println(sc.nextLine());
		}

}
