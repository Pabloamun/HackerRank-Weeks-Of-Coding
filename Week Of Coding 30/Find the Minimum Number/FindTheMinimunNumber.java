package weekOfCoding30;

import java.util.*;

public class FindTheMinimunNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ref = "min(int, int)";
		StringBuilder sb = new StringBuilder();
		sb.append(ref);
		int index = 0;
		while (n-- > 2) {
			index = sb.lastIndexOf("int");
			sb.replace(index, index + 3, ref);
		}
		System.out.println(sb.toString());
		in.close();
	}
}