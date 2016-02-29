package course02.prj23Coll;

import java.util.ArrayList;
import java.util.HashMap;

public class SoccerTeam {
	// мапа players. Ключ - номер у команді. Значення - прізвище ігрока.
	HashMap<String, ArrayList<String>> players;

	public SoccerTeam() {
		players = new HashMap<String, ArrayList<String>>();
	}

	public String get(String position) {
		ArrayList<String> names = players.get(position);
		return names.toString();
	}

	public void put(String position, String name) {

		ArrayList<String> names = players.get(position);

		if (names == null) {
			names = new ArrayList<>();
		}

		names.add(name);
		players.put(position, names);

	}

}