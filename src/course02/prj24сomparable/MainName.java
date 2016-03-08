package course02.prj24сomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainName {
	public static void main(String[] args) {
		Name nameArray[] = { new Name("Іван", "Іванов"), new Name("Нестор", "Сидоров"), new Name("Лев", "Макаренко"), };
		List<Name> names = Arrays.asList(nameArray);

		// сортировка
		Collections.sort(names);
		System.out.println(names);

		// сортировка в обратном порядке
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
	}
}
