package course02.prj12;
import course02.prj12.ducks.DecoyDuck;
import course02.prj12.ducks.Duck;
import course02.prj12.ducks.MallardDuck;
import course02.prj12.ducks.ModelDuck;
import course02.prj12.ducks.RedHeadDuck;
import course02.prj12.ducks.RubberDuck;
import course02.prj12.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.perfomeQuack();
		mallard.perfomeFly();
		
		Duck rubber = new RubberDuck ();
		rubber.display();
		rubber.perfomeQuack();
		rubber.perfomeFly();
		
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.perfomeQuack();
		decoyDuck.perfomeFly();
		
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.perfomeQuack();
		redHeadDuck.perfomeFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.perfomeFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.perfomeFly();
		
	}

}
