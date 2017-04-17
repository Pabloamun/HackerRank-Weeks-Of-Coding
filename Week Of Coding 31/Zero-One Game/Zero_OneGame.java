package weekOfCoding31;

import java.util.*;

public class Zero_OneGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int[] s = new int[n];
			int start = -1;
			for (int i = 0; i < n; i++) {
				s[i] = in.nextInt();
			}
			int ans = 0;
			for (int i = 0; i < n - 1; i++) {
				if (start == -1) {
					if (s[i] == 0)
						start = i;
				} else {
					if (s[i] == 1 && s[i + 1] == 1) {
						ans += Math.max(0, i - start - 2);
						start = -1;
					}
				}
			}
			if (start != -1) {
				ans += Math.max(n - start - 2 - s[n - 1], 0);
			}
			System.out.println((ans % 2 == 0) ? "Bob" : "Alice");
		}
		in.close();
	}
}
