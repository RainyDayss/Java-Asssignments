import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet : ");
        char alphabet = sc.next().charAt(0);
        if (alphabet >= 'A' && alphabet <= 'Z')
            System.out.println(alphabet + " is an Uppercase letter");
        else if (alphabet >= 'a' && alphabet <= 'z')
            System.out.println(alphabet + " is a Lowercase letter");
        else
            System.out.println(alphabet + " is not a alphabet");
    }

}
