import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number:");
        int a = input.nextInt();

        System.out.println("Input the first number:");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

    }
}