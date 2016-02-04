package course02.prj15pizza;
import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare(){
		
	}
	
	void bake(){
		
	}
	
	void cut(){}
	
	void box(){}
	
	public String getName() {
		return name;
	}
}
