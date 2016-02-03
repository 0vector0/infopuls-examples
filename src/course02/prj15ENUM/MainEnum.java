package course02.prj15ENUM;

import course02.prj15ENUM.Season;


public class MainEnum {

	public static void main(String[] args) {

		Season s1 = Season.WINTER;
		Season s2 = Season.SPRING;

		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		Season.Month.Jan.name();
		String str = "WINTER";
		for (Season s : Season.values()) {
			if (s.name().equals(str)) {
				System.out.println(s.getValue() + ", " + s.ordinal());
			}
		}
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());

	}

}

