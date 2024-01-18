import javax.sound.midi.Soundbank;
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

    public static void printName(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        calculateSquare();
        printName("Hugo");
    }
}
