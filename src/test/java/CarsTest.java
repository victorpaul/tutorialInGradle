import baby.BabyYear4;
import cars.BaseCar;
import cars.BmwImpl;
import cars.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {

    @Test
    public void test_Cars() {
        List<Car> list = new ArrayList<>();

        BabyYear4 baby = new BabyYear4();

        BaseCar basecar = new BmwImpl();
    }
}
