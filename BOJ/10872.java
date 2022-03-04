package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int fact = 0;
		
		if(n >= 0 && n <=12) {
			fact = recursion(n);
			System.out.println(fact);
		}
		else 
			return;
	}
	
	public static int recursion(int n) {
		if(n <= 1)
			return 1;
		return n * recursion(n-1);
	}
}
