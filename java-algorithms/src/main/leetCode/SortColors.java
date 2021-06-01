package main.leetCode;

public class SortColors {

    public static int[] sortColors(int[] nums) {
        int[] occurs = new int[3];

        for(int num: nums) {
            occurs[num]++;
        }

        int iter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < occurs[i]; j++) {
                nums[iter++] = i;
            }
        }

        return nums;
    }
}
