public class Solution_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int length = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                while (j < nums.length) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        length++;
                        break;
                    }
                    j++;
                }
                j = ++i;
            } else {
                i++;
                j++;
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 2, 3};
        int[] test2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(test1, 3));
        for (int i : test1)
            System.out.print(i);
        System.out.println();
        System.out.println(removeElement(test2, 2));
        for (int i : test2)
            System.out.print(i);
        System.out.println();
    }
}
