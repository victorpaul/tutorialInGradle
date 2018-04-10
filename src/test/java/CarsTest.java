import baby.BabyYear4;
import cars.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarsTest {

    @Test
    public void test_Cars() {
        List<Car> list = new ArrayList<>();

        BabyYear4 baby = new BabyYear4();

        BaseCar basecar = new BmwImpl();

        Lada lada = new Lada(CarType.POOR);

        String stringValue = lada.type.toString();

        switch (lada.type) {
            case FBR:
                // do something
                break;
            case VIP:
                // do something
                break;
            case POOR:
                // do something
                break;
        }

        Map<Car,CarType> carTypes = new HashMap<>();

        carTypes.put(new BmwImpl(),CarType.VIP);


    }
}
