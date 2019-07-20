import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int input1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int input2 = scanner.nextInt();
        System.out.println("The Sum of given two numbers is :"+(input1+input2));
    }

}
