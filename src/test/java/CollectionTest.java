import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void check() {
        int[] nums = new int[]{1, 2, 3, 4};

        List<String> integers = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();


        integers.add("word");
        integers.get(0);
        integers.add(0, "hello");
        integers.clear();
        integers.indexOf("work");

        Iterator<String> iterator = integers.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
        }

        set.add(1);
        set.clear();
        set.contains(1);

        map.put("width", "100px");
        map.put("width", "120px");

        map.put(null, "110px");
        String width = map.get("width");
        String nullValue = map.get(null);
        System.out.print(nullValue);

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        map.remove("width");


    }

}
