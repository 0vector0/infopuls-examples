package course02.prj23Coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Freq {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> m = new HashMap<String, Integer>();

		BufferedReader text = new BufferedReader(new FileReader("sonet.txt"));
		String textStr = "";
		while (text.ready()) {
			textStr = textStr + text.readLine() + " ";
		}
		String[] strWords = textStr.split("\\s");
		for (String a : strWords) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}
