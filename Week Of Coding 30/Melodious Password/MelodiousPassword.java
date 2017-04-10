package weekOfCoding30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MelodiousPassword {
	final static char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k',
			'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };
	final static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		switch (n) {
		case 1:
			password_N1();
			break;
		case 2:
			password_N2();
			break;
		case 3:
			password_N3();
			break;
		case 4:
			password_N4();
			break;
		case 5:
			password_N5();
			break;
		case 6:
			password_N6();
			break;
		}
		in.close();
	}

	public static void password_N1() {
		Set<String> passwordsN1 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			passwordsN1.add("" + vowels[i]);
		}
		for (int i = 0; i < consonants.length; i++) {
			passwordsN1.add("" + consonants[i]);
		}
		passwordsN1.forEach(password -> System.out.println(password));

	}

	public static void password_N2() {
		Set<String> passwordsN2 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				passwordsN2.add("" + vowels[i] + consonants[j]);
			}
		}
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				passwordsN2.add("" + consonants[i] + vowels[j]);
			}
		}
		passwordsN2.forEach(password -> System.out.println(password));
	}

	public static void password_N3() {
		Set<String> passwordsN3 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				for (int k = 0; k < vowels.length; k++) {
					passwordsN3.add("" + vowels[i] + consonants[j] + vowels[k]);
				}
			}
		}
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				for (int k = 0; k < consonants.length; k++) {
					passwordsN3.add("" + consonants[i] + vowels[j]
							+ consonants[k]);
				}
			}
		}
		passwordsN3.forEach(password -> System.out.println(password));
	}

	public static void password_N4() {
		Set<String> passwordsN4 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				for (int k = 0; k < vowels.length; k++) {
					for (int h = 0; h < consonants.length; h++) {
						passwordsN4.add("" + vowels[i] + consonants[j]
								+ vowels[k] + consonants[h]);
					}
				}
			}
		}
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int h = 0; h < vowels.length; h++) {
						passwordsN4.add("" + consonants[i] + vowels[j]
								+ consonants[k] + vowels[h]);
					}
				}
			}
		}
		passwordsN4.forEach(password -> System.out.println(password));
	}

	public static void password_N5() {
		Set<String> passwordsN5 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				for (int k = 0; k < vowels.length; k++) {
					for (int h = 0; h < consonants.length; h++) {
						for (int g = 0; g < vowels.length; g++) {
							passwordsN5.add("" + vowels[i] + consonants[j]
									+ vowels[k] + consonants[h] + vowels[g]);
						}
					}
				}
			}
		}
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int h = 0; h < vowels.length; h++) {
						for (int g = 0; g < consonants.length; g++) {
							passwordsN5
									.add("" + consonants[i] + vowels[j]
											+ consonants[k] + vowels[h]
											+ consonants[g]);
						}
					}
				}
			}
		}
		passwordsN5.forEach(password -> System.out.println(password));
	}

	public static void password_N6() {
		Set<String> passwordsN6 = new HashSet<>();
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				for (int k = 0; k < vowels.length; k++) {
					for (int h = 0; h < consonants.length; h++) {
						for (int g = 0; g < vowels.length; g++) {
							for (int p = 0; p < consonants.length; p++) {
								passwordsN6.add("" + vowels[i] + consonants[j]
										+ vowels[k] + consonants[h] + vowels[g]
										+ consonants[p]);
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				for (int k = 0; k < consonants.length; k++) {
					for (int h = 0; h < vowels.length; h++) {
						for (int g = 0; g < consonants.length; g++) {
							for (int p = 0; p < vowels.length; p++) {
								passwordsN6.add("" + consonants[i] + vowels[j]
										+ consonants[k] + vowels[h]
										+ consonants[g] + vowels[p]);
							}
						}
					}
				}
			}
		}
		passwordsN6.forEach(password -> System.out.println(password));
	}
}
