/*
 * Exercise 1-1
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4};
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 3, 9};
        int[] array3 = {1, 1, 1, 1};
        showNonDuplicateArray(array1);
        showNonDuplicateArray(array2);
        showNonDuplicateArray(array3);
    }

    /*
     * Remove duplicate elements in an array
     * and print it in the standard output
     * @param a the input array
     */
    public static void showNonDuplicateArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[j] == a[i] && i != j) {
                    break;
                }
                else if(j==i){
                    System.out.print(a[i]);
                    break;
                }
            }
        }
        System.out.print("\n");
    }
}