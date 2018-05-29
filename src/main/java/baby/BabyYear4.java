package baby;

public class BabyYear4 extends BabyYearTwo {

    @Override
    public String cry() {
        return "hnuk";
    }

    @Deprecated
    public void run() {

    }

    public Boolean run(int speed) {
        if(speed > 10) {
            return false;
        }
        return true;
    }

    public void run(int speed, int time) {

    }
}
