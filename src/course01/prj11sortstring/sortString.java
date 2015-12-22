package course01.prj11sortstring;

public class sortString {

	static int myCompareTo(String aaa, String bbb) {

		int correctLenght;
		boolean findBigger = false;
		if (aaa.length() < bbb.length()) {
			correctLenght = aaa.length();
		} else {
			correctLenght = bbb.length();
		}
		for (int i = 0; i < correctLenght; i++) {
			if (aaa.charAt(i) > bbb.charAt(i)) {
				System.out.println("aaa bigger" + aaa.charAt(i));
				findBigger = true;
				return 1;
			} else {
				if (aaa.charAt(i) < bbb.charAt(i)) {
					System.out.println("bbb bigger in " + bbb.charAt(i));
					findBigger = true;
					return -1;
				} else {
					System.out.println("equal " + aaa.charAt(i));
				}
				// System.out.println();
			}
		}
		if (!findBigger) {
			if (aaa.length() < bbb.length()) {
				System.out.println("bbb bigger lenght");
				return -1;
			} else 
				if (aaa.length() > bbb.length()) {
				System.out.println("aaa biiger");
				return 1;
			} else
				System.out.println("equal string");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] masStr = { "Vasya", "Petya", "Dasha", "AA", "AB", "b", "B" };
		// char []cstr = {'a', 'b', 'c'};
		// String aa = null;
		// aa.valueOf(cstr);

		String aaa = "aaabbb";
		String bbb = "aaabbbb";
		
		System.out.println(myCompareTo("aaa", "aaa"));

	}
}
