package course01.prj10;

public class ITuniver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create groups
		Group grJava = new Group(3);
		
		// input data of students from group
		grJava.inputData();
		
		// exam groups
		grJava.exam();
		
		// print information(data) of groups
		grJava.print();
		
		//sort
		grJava.sort();
		//print
		grJava.print();

	}

}
