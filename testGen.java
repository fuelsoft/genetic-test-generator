//Nick Wilson
//generate random 'genetic' strings
//usage: java testGen <length> <filename>

import java.util.Random;
import java.io.PrintWriter;
import java.io.File;

public class testGen{
	static char[] validChars = {'A', 'C', 'G', 'T'};
	public static void main(String[] args) {
		Random r = new Random();
		String b = "";
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			b += validChars[r.nextInt(validChars.length)];
		}
		File f = new File(args[1]+".txt");
		try {
			PrintWriter w = new PrintWriter(f);
			w.print(b);
			w.close();
		} catch (Exception e) {
			System.err.println("Error with file "+args[1]+".txt");
		}
	}
}