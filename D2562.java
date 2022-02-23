package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int n = 0;
		int index = 0;
		int max = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[n] = Integer.parseInt(br.readLine());
			if(arr[n] > max) {
				max = arr[n];
				index = n;
				System.out.println(index);
			}
			n++;
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
