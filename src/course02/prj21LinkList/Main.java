package course02.prj21LinkList;

public class Main {

	public static void main(String[] args) {

		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		Bus bus4 = new Bus(4);
		Bus bus5 = new Bus(5);
		Bus bus6 = new Bus(6);

		LinkList depoList = new LinkList();

		depoList.inserFirst(bus1);
		depoList.inserFirst(bus2);
		depoList.inserFirst(bus3);
		depoList.inserFirst(bus4);
		depoList.inserFirst(bus5);
		depoList.inserFirst(bus6);

		depoList.displayList();

		depoList.delete(4);

		depoList.displayList();
	}

}
