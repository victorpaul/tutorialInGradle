import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommonTest {

    @Test
    public void check_arrays_single_multi_dimensions() throws Exception {
        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 2;

        String we = "hello" + " " + "world";

        if (true) {
            throw new Exception("do not do it");
        }

        for (int i = 0; i < we.length(); i++) {
            System.out.print(we.toCharArray()[i]);
        }

        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};

        String[] statuses = new String[]{"busy", "finished", "started"};

        char[][] house = new char[2][10];

        house[0][0] = 'A';
        house[0][1] = 'B';

        char[][] house2 = new char[][]{
                {'A', 'D'},
                {'B', 'C'},
                {'B', 'C', 'B'},
        };

    }

    @Test
    public void check_loops() {
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};
        String[] statuses = new String[]{"busy", "finished", "started"};

        char[][] house2 = new char[][]{
                {'A', 'D'},
                {'B', 'C'},
                {'B', 'C', 'B'},
        };

        for (int i = 0; i < house2.length; i++) {
            System.out.println("");
            for (int j = 0; j < house2[i].length; j++) {
                System.out.print(house2[i][j] + " ");
            }
        }

        for (String status : statuses) {

        }

        boolean isFIleProcessing = true;
        while (isFIleProcessing) {
            System.out.println("while");
            isFIleProcessing = false;
        }

        do {
            System.out.println("one step");
        } while (false);

    }

    @Test
    public void check_if_else() {
        boolean isFinished = true;
        int k = 0;

        if ((!true || true) && (1 > 2 || true)) {
            k += 1;
        } else {
            k -= 1;
        }

        k = isFinished ? 1 : -1;
    }

    @Test
    public void check_switch() {
        int k = 2;

        switch (k) {
            case 0:
                System.out.print("case 0");
                break;
            case 1:
                System.out.print("case 1");
                break;
            case 2:
            case 3:
                System.out.print("case 2 or 3");
                break;
            default:
                System.out.print("default");
                break;
        }
    }

    @Test
    public void loop_repeating() {
        int nums[] = new int[]{3, 2, 8, 2, 4, 5, 8, 1};

        for (int repeater : nums) {

            for (int i = 0; i < nums.length - 1; i++) {
                int first = nums[i];
                int second = nums[i + 1];
                if (first < second) {
                    nums[i] = second;
                    nums[i + 1] = first;
                }
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        for (int numer : nums) {
            System.out.print(numer + ";");
        }

        for (int numer : nums) {
            if (numer == 4) {
                System.out.print("founded " + numer + ";");
                break;
            }
        }

    }
}
