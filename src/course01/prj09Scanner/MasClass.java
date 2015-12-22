package course01.prj09Scanner;

import java.util.Scanner;

public class MasClass {
    static int [] resize(int []mas){
   	int []bigmas= new int[mas.length+5];
	for (int i = 0; i < mas.length; i++) bigmas[i]=mas[i];
	return bigmas;
    }
  static int enterSizeOfMas(int [] mas,Scanner sc){
    	System.out.println("Enter num elem mas");
		while(!sc.hasNextInt()){
			System.out.println("data not int, please enter corret data");
			System.out.println(sc.nextLine());
		}
		return sc.nextInt();
 
    }
   static void enterDataInMas(int [] mas,Scanner sc){
    	System.out.println("Enter elem mas");
		for (int i = 0; i < mas.length; i++) {
			System.out.println("elem "+i);
			while(!sc.hasNextInt()){
			System.out.println("data not int, please enter corret data");
			System.out.println(sc.nextLine());
		}
		mas[i]=sc.nextInt();
		}
    }
  static void printElemMas(int [] mas ){	   		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+", ");
		}
   }  
  static int menu(Scanner sc){
	  System.out.println("---------MENU----------");
			System.out.println("1. Enter size of mas");
			System.out.println("2. Enter data to mas");
			System.out.println("3. print mas");
			System.out.println("0. exit");	
			while(!sc.hasNextInt()){
				System.out.println("data not int, please enter corret data");
				System.out.println(sc.nextLine());
			}
	  return sc.nextInt();
  }
	public static void main(String[] args) {
		int [] mas = null;
		Scanner sc =new Scanner(System.in);
		do{						
			switch(menu(sc)){
			case 1:{
				    int n=enterSizeOfMas(mas, sc);
			        mas=new int [n];break;
			        }
			case 2:if (mas!=null)enterDataInMas(mas, sc);
				   else System.out.println("enter 1");break;
			case 3:if (mas!=null)printElemMas(mas);
			       else System.out.println("enter 1");break;
			case 0: {
				System.out.println("Exit");
				sc.close();
				return ;
				}
			}		
		}while(true);		
	}
 
}
