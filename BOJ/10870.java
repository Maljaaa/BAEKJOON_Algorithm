package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int fibo = 0;
		
		if(n >= 0 && n <=20) {
			if(n == 0) {
				System.out.println(0);
			}
			else {
				fibo = recursion(n);
				System.out.println(fibo);
			}
		}
		else
			return;
	} 
	public static int recursion(int n) {
		if(n <= 2)
			return 1;
		return recursion(n-1) + recursion(n-2);
	}
}
