import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DavesTest {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\temp\\amended.txt"));
		int i = sc.nextInt();
		while (sc.hasNext()) {
			System.out.println(i);
			i = sc.nextInt();
		}
		System.out.println(i);
		sc.close();
	}
}