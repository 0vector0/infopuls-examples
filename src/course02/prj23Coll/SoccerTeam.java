package course02.prj23Coll;

import java.util.HashMap;

public class SoccerTeam {
	// мапа players. Ключ - номер у команді. Значення - прізвище ігрока.
	HashMap<String, String> players;

	public SoccerTeam() {
		players = new HashMap<String, String>();
	}

	public String get(String position) {
		String name = players.get(position);
		return name;
	}

	public void put(String position, String name) {
		players.put(position, name);
	}
}