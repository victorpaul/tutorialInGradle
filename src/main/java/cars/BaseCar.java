package cars;

public abstract class BaseCar implements Car {

    @Override
    public void beep() {
        System.out.println("HALT");
    }

    abstract public void doubleBeep();

    public void tripleBeep() {
        doubleBeep();
        beep();
    }
}
