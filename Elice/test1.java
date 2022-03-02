package Elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String b = br.readLine();
		
		int bomb = 0, lazer = 0;
		
		if(b.length() >= 2 && b.length() <= 50) {
			for(int i = 0; i < b.length(); i++) {
				System.out.println(b.charAt(i));
				if(b.charAt(i) == '(') {
					bomb++;
				}
				else if(b.charAt(i) == ')'){
					lazer++;
				}
			}
		}
		else {
			return;
		}
		
		
		if((bomb - lazer) > 0 || (bomb - lazer) < 0) {
			System.out.println("NO");
		}
		else if((bomb - lazer) == 0) {
			System.out.println("YES");
		}
	}
}
