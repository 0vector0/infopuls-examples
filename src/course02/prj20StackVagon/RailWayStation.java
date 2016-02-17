package course02.prj20StackVagon;

public class RailWayStation {

	public static void main(String[] args) {

		StackSostav poezd = new StackSostav(5);
		StackSostav sostavGruz = new StackSostav(10);
		StackSostav sostavPas = new StackSostav(10);

		poezd.fillSostav();
		// System.out.println(poezd.size());

		for (int i = 0; i < poezd.size(); i++) {
			System.out.println(poezd.getVagonType(i));
		}

		while (poezd.size() > 0) {
			if (poezd.getVagonType(poezd.size() - 1) == 0) {
				sostavGruz.push(poezd.pop());
				System.out.println("gruz");
			} else {
				sostavPas.push(poezd.pop());
				System.out.println("pass");
			}
		}
		System.out.println("Gruzzzzzz");
		for (int i = 0; i < sostavGruz.size(); i++) {
			System.out.println(sostavGruz.getVagonType(i));
		}
		System.out.println("passsssss");
		for (int i = 0; i < sostavPas.size(); i++) {
			System.out.println(sostavPas.getVagonType(i));
		}
	}
}
