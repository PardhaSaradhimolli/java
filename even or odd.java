import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the number");
        int num = reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + "number is even");
        else
            System.out.println(num + "number is not even");
    }
}