package weekOfCoding31;
import java.util.*;

public class BeautifulWord {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		String vowels = "aeiouy";
		boolean flag = false;
		char index = w.charAt(0);
		for (int i = 1; i < w.length(); i++) {
			if (w.charAt(i) == index) {
				flag = false;
				break;
			} else if (vowels.indexOf(index) > 0
					&& vowels.indexOf(w.charAt(i)) > 0) {
				flag = false;
				break;
			} else {
				index = w.charAt(i);
				flag = true;
			}
		}
		String ans = (flag) ? "Yes" : "No";
		System.out.println(ans);
		in.close();
	}
}
