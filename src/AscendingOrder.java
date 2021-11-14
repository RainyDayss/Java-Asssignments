import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sortAsc(num);
    }

    public static void sortAsc(int num) {


        int sortedNumber = 0;
        for (int i = 0; i <= 9; i++) {
            int tmpNumber = num;
            while (tmpNumber > 0) {
                // get the digit
                int digit = tmpNumber % 10;
                // check for the smallest digit in the given number
                if (digit == i) {
                    // build the sortedNumber value
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                // reduce the loop variable
                tmpNumber /= 10;
            }
        }
        System.out.println("The Ascending order of the given number is" + sortedNumber);
        //  return sortedNumber;
    }
}
