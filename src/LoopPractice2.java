import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =  0;
        System.out.println("Enter a number: ");
        while(true){
            int num = input.nextInt();
            if (num < 0){
                break;
            }
            sum += num;
        }
        System.out.println("Sum of positive numbers entered: " + sum);
    }
}
