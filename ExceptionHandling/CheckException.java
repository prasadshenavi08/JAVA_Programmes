import java.io.FileWriter;
import java.io.IOException;

public class CheckException {
	public static void main(String[] args)throws IOException {
		FileWriter f1 = new FileWriter("sample.txt");
		f1.write("hello. A sample file is created through my project");
		f1.close();
	}
}
