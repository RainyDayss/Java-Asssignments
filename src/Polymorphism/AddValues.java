import java.util.Scanner;

public class AddValues {
    public void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("The sum of two numbers are " + sum);
    }

    public void add(String word1, String word2) {
        String wholdWord = word1 + word2;
        System.out.println("The concatenated word is " + wholdWord);
    }

    public static void main(String[] args) {
        AddValues addValues = new AddValues();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = sc.nextLine();
        System.out.println("Enter the second word");
        String word2 = sc.nextLine();
        addValues.add(word1, word2);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        addValues.add(num1, num2);


    }
}
