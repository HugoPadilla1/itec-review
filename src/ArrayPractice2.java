public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int max = findMax(numbers);
        System.out.println("The maximum value is: " + max);
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
