public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 2;
        int num4 = 3;
        int max = num1;
        int min = num1;

        if (num2 > max)
            max = num2;
        else if (num2 < min)
            min = num2;
        if (num3 > max)
            max = num3;
        else if (num3 < min)
            min = num3;
        if (num4 > max)
            max = num4;
        else if (num4 < min)
            min = num4;
        System.out.println("The smallest of the given 4 number is:" + min);

    }
}
