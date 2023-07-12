package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable{
    private List<Observer> observers;
    private int state;

    public void setState(int state){
        this.state = state;
        notifyObservers();
    }

    public int getState(){
        return state;
    }

    public ConcreteObservable(){
        this.observers = new ArrayList<>();
        state = 0;
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
