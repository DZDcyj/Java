import java.util.Arrays;

public class Solution_CountPrimes {
    private static int countPrimes(int n) {
        boolean[] numbers = new boolean[n];             // Instead of using int array, saving memory
        Arrays.fill(numbers, true);                 // We use true to stand for Prime, false to nonPrime
        for (int i = 2; i * i < n; i++)                 // Considering the law of commutation(a*b=b*a), there's no need to check out the left half part
            if (numbers[i])                             // Here we check if number is Prime, as numbers can be multiplied by primes
                for (int j = i * i; j < n; j += i)      // Here we try to find the multiple of the primes, making them false
                    numbers[j] = false;
        int count = 0;
        for (int i = 2; i < numbers.length; i++)        // Now we just need to count the num of Prime numbers
            if (numbers[i])
                count++;
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(100));
        System.out.println(countPrimes(200));
    }
}
