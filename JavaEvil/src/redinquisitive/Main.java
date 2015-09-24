package redinquisitive;

import java.io.IOException;

public class Main {

	//Make it look like i contributed
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
		for(int position = 0; position <= 100; position++) {
			System.out.print("[");
			for(int left = 0; left < position; left++) {
				System.out.print("=");
			}
			System.out.print(">");
			for(int right = position; right < 100; right++) {
				System.out.print(" ");
			}
			System.out.print("] " + position + "\r");
			try {
			    Thread.sleep(100);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		} 
	}
}