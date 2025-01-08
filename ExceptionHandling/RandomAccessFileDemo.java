import java.io.*;

public class RandomAccessFileDemo {
	public static void main(String[] args)throws Exception {
		RandomAccessFile f1 =new RandomAccessFile("Book.txt","rw");//rw =read & write
		f1.seek(3);//moves pointer to specified position
		System.out.println((char)f1.read());
		f1.seek(21);
		f1.write('t');
	}

}
