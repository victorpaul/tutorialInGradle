package cars;

public class Lada implements Car {

    public final static String TYPE_VIP = "vip";
    public final static String TYPE_POOR = "poor";
    public final static String TYPE_FBR = "fbr";

    public CarType type;

    public Lada(CarType type) {
        this.type = type;
    }

    @Override
    public void beep() {
        System.out.println("pr pr pr");
    }

    @Override
    public void alarm() {

    }
}

