package ObserverPattern;

public class ConcreteObserver2 implements Observer{
    private int state;
    private ConcreteObservable observable;

    public ConcreteObserver2(ConcreteObservable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        state = observable.getState();
        System.out.println("ConcreteObserver2.update() state = " + state);
    }
}