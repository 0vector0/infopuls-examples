package course02.prj14;


public interface Subject {

	public void registerObserver(Observer_old o);

	public void removeObserver(Observer_old o);

	public void notifyObserver();

}
