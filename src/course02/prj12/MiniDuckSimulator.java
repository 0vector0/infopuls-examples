package course02.prj12;

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
