package redinquisitive;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.print("Start: ");
		String read = "";
		while(!(read.contains("\n"))) {
			try {
				read += (char)(System.in.read());
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		System.out.print(read);
	}
}