import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f1 =new File("book.txt");
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.length());
//		System.out.println(f1.renameTo());
	}

}
