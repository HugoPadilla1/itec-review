import java.util.Scanner;

public class MethodPractice {
    public static int calculateSquare(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to be squared: ");
        int n = input.nextInt();
        int b = n * n;
        System.out.println(b);
        return b;
    }

    public static String printName(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a given name: ");
        String name = input2.nextLine();

    }

    public static void main(String[] args) {
        calculateSquare();
    }
}
