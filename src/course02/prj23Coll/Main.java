package course02.prj23Coll;

public class Main {

	public static void main(String[] args) {

		SoccerTeam soccerTeam = new SoccerTeam();

		soccerTeam.put("1", "петро");
		soccerTeam.put("2", "микола");
		soccerTeam.put("3", "іван");
		soccerTeam.put("1", "петро #2");

		System.out.println(soccerTeam.players.toString());

	}

}
