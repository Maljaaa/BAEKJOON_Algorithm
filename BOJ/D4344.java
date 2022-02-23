package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			arr = new int[num];
			
			double sum = 0;
			
			for(int j = 0; j < num; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			
			double avg = sum / num;
			double count = 0;
			
			for(int k = 0; k < num; k++) {
				if(arr[k] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count / num) * 100);
		}
	}
}
