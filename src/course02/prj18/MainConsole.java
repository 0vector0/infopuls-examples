package course02.prj18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainConsole {
	public static void main(String[] args) {
		int[] masInt = new int[20];
		// Scanner sc = new Scanner(System.in);
		BufferedReader r = null;
		try {
			r = new BufferedReader(new FileReader(new File("c:\\in\\1.txt")));
			boolean flagInCorrectInput = false;
			// for ( j < masInt.length; j++)
			String str = null;
			int j = 0;
			try {
				while (r.ready()) {

					do {
						try {
							System.out.println("Enter int value in mas[" + j + "]");
							str = r.readLine();
							// if(sc.hasNextInt()) sc.nextInt();else
							// flagInCorrectInput=true;
							masInt[j] = Integer.parseInt(str);
							flagInCorrectInput = false;
						} catch (Exception e) {
							// sc.nextLine();
							flagInCorrectInput = true;
							System.err.println("incorrect value");
							throw e;
						}
					} while (flagInCorrectInput);
					j++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (r != null)
					r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < masInt.length; i++) {
			System.out.println(masInt[i]);
		}
	}
}
