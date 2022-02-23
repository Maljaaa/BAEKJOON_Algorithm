package Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1546_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		float[] num = new float[n];
		
		float max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 0;
		while(st.hasMoreTokens()) {
			num[index] = Integer.parseInt(st.nextToken());
			if(num[index] > max)
				max = num[index];
			index++;
		}
		float sum = 0;
		
		for(int j = 0; j < n; j++) {
			num[j] = (num[j] / max) * 100;
			sum += num[j];
		}
		
		System.out.println(sum / n);
	}
}
