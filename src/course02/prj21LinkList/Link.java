package course02.prj21LinkList;

public class Link {

	public Bus bus;
	public Link next;

	public Link(Bus bus) {
		this.bus = bus;
	}

	public void displayLink() {
		System.out.println(bus.numberBus + " " + bus.fio + " " + bus.numberM);
	}

}
