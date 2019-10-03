
public class Solution_RomanToInteger {
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        int sum = 0;
        int more = 0;
        for (int i = 0; i < length; ++i) {
            if (c[i] == 'M') {
                if (i > 0 && c[i - 1] == 'C') {
                    sum += 900;
                    more += 100;
                } else {
                    sum += 1000;
                }
            } else if (c[i] == 'D') {
                if (i > 0 && c[i - 1] == 'C') {
                    sum += 400;
                    more += 100;
                } else {
                    sum += 500;
                }
            } else if (c[i] == 'C') {
                if (i > 0 && c[i - 1] == 'X') {
                    sum += 90;
                    more += 10;
                } else {
                    sum += 100;
                }
            } else if (c[i] == 'L') {
                if (i > 0 && c[i - 1] == 'X') {
                    sum += 40;
                    more += 10;
                } else {
                    sum += 50;
                }
            } else if (c[i] == 'X') {
                if (i > 0 && c[i - 1] == 'I') {
                    sum += 9;
                    more++;
                } else {
                    sum += 10;
                }
            } else if (c[i] == 'V') {
                if (i > 0 && c[i - 1] == 'I') {
                    sum += 4;
                    more++;
                } else {
                    sum += 5;
                }
            } else if (c[i] == 'I') {
                sum += 1;
            }
        }
        sum -= more;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
