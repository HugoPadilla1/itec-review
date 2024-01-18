import java.sql.SQLOutput;
import java.util.Arrays;

public class CodingBatHugoPadilla {
    public static void main(String[] args) {
        int[] array1 = {15, 20, 25, 30 ,35};
        System.out.println(sumDigits(245)); // 11
        System.out.println(factorial(14)); // 87178291200
        System.out.println(isLeapYear(2002)); //  false
        System.out.println(countOccurrences("Hello, world!", 'o')); // 2
        System.out.println(countVowels("hello")); // 2
        System.out.println(Arrays.toString(reverseArray(array1)));
    }
    public static int[] reverseArray(int[] nums) {
        int length = nums.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = nums[length - 1 - i];
        }
        return reversedArray;
    }
    public static int countVowels(String str) {
        int count = 0;
        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char currentChar = lowerCaseStr.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    public static  long factorial(int n){
        if (n == 0 ) {
            return 1;
        }
        long result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
