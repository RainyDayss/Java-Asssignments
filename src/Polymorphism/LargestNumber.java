import java.util.Scanner;

public class LargestNumber {

    void largeNumber(int num1, int num2) {

        if (num1 > num2)
            System.out.println("The Largest number is " + num1);
        else
            System.out.println("The Largest number is " + num2);

    }

    void largeNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest Number");

        else
            System.out.println(num3 + " is the largest Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int num3 = sc.nextInt();
        LargestNumber largeNo = new LargestNumber();
        largeNo.largeNumber(num1, num2);
        largeNo.largeNumber(num1, num2, num3);
    }

}