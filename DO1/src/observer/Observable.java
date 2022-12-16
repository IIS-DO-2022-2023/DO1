package observer;

public interface Observable {
	void addObservers(Observer observer);
	
	void removeObservers(Observer observer);
	
	void notifyObservers();

}
