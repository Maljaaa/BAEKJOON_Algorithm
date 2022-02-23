package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] n = new int[10];
		int[] t = new int[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			n[i] = Integer.parseInt(br.readLine());
			t[(n[i] % 42)]++;
		}
		
		for(int j = 0; j < 42; j++) {
			if(t[j] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
