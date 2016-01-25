package course02.prj12;

import course02.prj12.turkey.DuckAdapter;
import course02.prj12.turkey.Turkey;

public class TurkeyAdapter implements DuckAdapter {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void perfomeFly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

	@Override
	public void perfomeQuack() {
		turkey.gobble();
	}



}
