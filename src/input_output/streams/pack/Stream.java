package input_output.streams.pack;

import java.io.InputStreamReader;

public class Stream {

	public static void main(String[] args) {
		System.out.println("Print Stream Object & out is static variable");
		System.err.println("Print Stream Object & out is static variable");
	}
	
	public void getInput() {
		new InputStreamReader(System.in);
		System.out.println("Input Stream Object & in is static variable");
	}
}
