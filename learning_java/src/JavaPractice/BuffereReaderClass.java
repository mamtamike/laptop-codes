package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffereReaderClass {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter N");

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		int i = 1;
		while (i <= 10) {
			System.out.println(N + " x " + i + " = " + (N * i));
			i++;
		}
		bufferedReader.close();
	}

}
