package course01.prj10;
 
import java.util.Scanner;
 
class Student {
 private String fio;
 private int numGroup;
 private int []marks;
 
 public String getFio(){return this.fio;}
 public void setFio(String fio){this.fio=fio;}
 
 public void setNumGroup(int numGroup) {
	this.numGroup = numGroup;
 }
 public void setMarks(int numMarks) {
	this.marks = new int[numMarks];
 }
 public int getMarks() {
	return marks.length;
}
 public void setMark(int mark, int i){
	 this.marks[i]=mark;
 }
 public int getMark(int i) {
	return this.marks[i];
}
 
 Student(String fio,int numGroup,int numMarks){
	 this.fio=fio;
	 this.numGroup=numGroup;
	 marks=new int[numMarks];
 }
 Student(String fio, int numGroup){
	 this.fio=fio;
	 this.numGroup=numGroup;
	 this.marks=new int[5];		 
 }
 Student(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter params of Student");
	System.out.println("enter fio");
	this.fio=sc.nextLine();
	System.out.println("enter group");
	//TODO: proverky na vvod
	this.numGroup=sc.nextInt();
	System.out.println("enter number marks");
	this.marks=new int[sc.nextInt()];
	//sc.close();
 }
 //@Override
	public String toString() {
	 String marksStr="";
	    for (int i = 0; i < marks.length; i++) {
			marksStr=marksStr+marks[i]+", ";
		}
		return "student : fio= "+fio+" numgroup= "+numGroup+
				"marks= "+marksStr;
	}
	void print(){
		System.out.println(this.toString());
	}
}