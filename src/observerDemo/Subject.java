package observerDemo;

//主题
public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
