package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(val);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println("test" + arr[(str.charAt(i) - 48)]);
			arr[(str.charAt(i) - 48)]++;
		}
		
		for(int v : arr) {
			System.out.println(v);
		}
	}
}
