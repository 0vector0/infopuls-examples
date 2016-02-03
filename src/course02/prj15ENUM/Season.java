package course02.prj15ENUM;

public enum Season {
	WINTER(1) {

	},
	SPRING(2) {

	};
	Season(int value) {
		this.value = value;
	}

	enum Month {
		Jan, Feb;
		enum Day {
		}
	}

	private int value;

	public int getValue() {
		return value;
	}
}
