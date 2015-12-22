package course01.prj09;


class Cat {
	int ves;
	int year;
	String fio;

	Cat(int ves, int year, String fio) {
		this.ves = ves;
		this.year = year;
		this.fio = fio;
	}
}

public class MasClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat []masCat = new Cat[3];
		masCat[0] = new Cat(1,2,"Vasik");
		masCat[1] = new Cat(2,3,"Basik");
		masCat[2] = new Cat(4,5,"Kobasik");
		
		if (masCat[0].ves> masCat[1].ves) {
			System.out.println();
			};
	}

}
