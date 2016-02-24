package course02.prj21LinkList;

public class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {

		return (first == null);

	}

	public void inserFirst(Bus bus) {
		Link newLink = new Link(bus);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List (first-->last): ");
		Link curretn = first;
		while (curretn != null) {
			curretn.displayLink();
			curretn = curretn.next;
		}
		System.out.println("");
	}

	public Link find(int numberBus) {
		Link current = first;
		while (current.bus.numberBus != numberBus) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;

	}

	public Link delete(int numberBus) {

		Link current = first;
		Link previous = first;
		while (current.bus.numberBus != numberBus) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}

		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

}
