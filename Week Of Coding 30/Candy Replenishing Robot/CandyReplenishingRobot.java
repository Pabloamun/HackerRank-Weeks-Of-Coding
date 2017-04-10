package weekOfCoding30;

import java.util.*;

public class CandyReplenishingRobot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] c = new int[t];
		for (int c_i = 0; c_i < t; c_i++) {
			c[c_i] = in.nextInt();
		}
		int count = 0;
		int b;
		int candyleft = n;
		for (int i = 0; i < t - 1; i++) {
			b = candyleft - c[i];
			if (b < 5) {
				count += n - b;
				candyleft = n;
			} else {
				candyleft = b;
			}
		}
		System.out.println(count);
		in.close();
	}
}