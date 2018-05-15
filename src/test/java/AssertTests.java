import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AssertTests {


    private int calculation() {
        return 2 + 2;
    }

    @Test
    public void check() {

        Assert.assertEquals(calculation(), 4);
        Assert.assertTrue(calculation() == 4);
        Assert.assertFalse(calculation() == 5);

        String s1 = "qwe";
        String s2 = "qwe";

        User user1 = new User();
        user1.email = "e1";
        List<User> users = new ArrayList<>();
        users.add(user1);
        Assert.assertEquals(users.size(),1);
        Assert.assertEquals(users.get(0).email,"e1");

        user1.email = "e2";

        Assert.assertEquals(users.size(),1);
        Assert.assertEquals(users.get(0).email,"e2");

    }

}
