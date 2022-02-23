package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		int[] score = new int[n];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(br.readLine());
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					sum += 1;
					score[i] += sum;
					//System.out.println(sum);
				}
				else if(arr[i].charAt(j) == 'X') {
					sum = 0;
					//System.out.println(sum);
				}
			}
			sum = 0;
		}
		for(int v : score) {
			System.out.println(v);
		}
	}
}
