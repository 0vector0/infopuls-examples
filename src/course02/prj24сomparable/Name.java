package course02.prj24сomparable;

public class Name implements Comparable<Name> {
	private final String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String firstName() {
		return firstName;
	}

	public String lastName() {
		return lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public int compareTo(Name n) {
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
}
