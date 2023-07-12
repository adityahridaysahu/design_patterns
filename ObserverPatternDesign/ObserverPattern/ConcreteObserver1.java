package ObserverPattern;

public class ConcreteObserver1 implements Observer{
    private int state;
    private ConcreteObservable observable;

    public ConcreteObserver1(ConcreteObservable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        state = observable.getState();
        System.out.println("ConcreteObserver1.update() state = " + state);
    }
}
