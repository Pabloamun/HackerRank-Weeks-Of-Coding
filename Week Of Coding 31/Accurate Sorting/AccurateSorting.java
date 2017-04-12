package weekOfCoding31;

import java.util.Scanner;

public class AccurateSorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			// Write Your Code Here
			boolean flag = false;
			if (a.length == 1) {
				flag = true;
			} else {
				for (int i = 0; i < n - 2; i++) {
					if (a[i] - a[i + 2] > 1 || a[i] - a[i + 1] > 1) {
						flag = false;
						break;
					} else {
						flag = true;
					}
				}
			}
			System.out.println((flag) ? "Yes" : "No");
		}
		in.close();
	}
}
