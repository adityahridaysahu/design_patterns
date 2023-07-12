import ObserverPattern.*;

public class Main{
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        ConcreteObserver1 observer1 = new ConcreteObserver1(observable);
        ConcreteObserver2 observer2 = new ConcreteObserver2(observable);
        ConcreteObserver2 observer3 = new ConcreteObserver2(observable);
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.notifyObservers();
        observable.removeObserver(observer2);
        observable.setState(2);
    }
}
