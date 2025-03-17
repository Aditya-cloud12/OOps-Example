package aditya.it;

import java.io.*;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		/*
		FileWriter fw = new FileWriter("abx.txt");
		fw.write("Hii, I am aditya");
		fw.write("\n");
		fw.write("How are you");
		fw.write("\n");
		fw.write("Where are you From");
		fw.flush();
		fw.close();
		*/
		 
		FileWriter fw = new FileWriter("aby.txt");
		fw.write("Hii, I am kumar");
		fw.write("\n");
		fw.write("How are you");
		fw.write("\n");
		fw.write("i am From Bihar");
		fw.flush();
		fw.close();

		FileReader fr = new FileReader("aby.txt");
		BufferedReader br = new BufferedReader(fr);
		String Line = br.readLine();
		while (Line != null) {
			System.out.println(Line);
			Line = br.readLine();

		}

	}

}
