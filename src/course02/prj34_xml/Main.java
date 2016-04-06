package course02.prj34_xml;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worldmap worldmap = new Worldmap();
		worldmap.loadFromFile("map");
		// System.out.println(worldmap.countCountries());
		worldmap.printCountries();
	}

}
