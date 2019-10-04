public class Solution_Sqrt {
    private static int sqrt(int x) {
        int left=1, right=x;
        while(left < right){
            int mid = (left + right + 1) >> 1;
            if(mid <= x/mid) left = mid;
            else right = mid-1;
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(8));
        System.out.println(sqrt(9));
        System.out.println(sqrt(2147395600));
    }
}
