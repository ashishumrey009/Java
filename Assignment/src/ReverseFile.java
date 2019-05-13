import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class ReverseFile {
public static void main(String[] args) throws FileLockInterruptionException,IOException {
	Scanner sc = new Scanner(new File("C:/test/ash.txt")).useDelimiter("\\Z");
	String contents = sc.next();
	System.out.println("Original String : " + contents);
	contents = new StringBuffer(contents).reverse().toString();
	System.out.println("Reversed String : " + contents);
	FileWriter fstream = new FileWriter("C:/test/ash.txt");
	BufferedWriter out = new BufferedWriter(fstream);
	out.write(contents);
	out.close();
	
}
}
