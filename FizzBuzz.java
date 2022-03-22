
import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList values = new ArrayList();
        int value = 0;
        while (true) {
            String result = input.nextLine();
            if (result.equals("exit")) {
                break;
            }
            values.add(result);
        }

        for (int i = 0; i < values.size(); i++) {
            try {
                value = Integer.parseInt(String.valueOf(values.get(i)));
                if (value % 3 == 0 && value % 5 == 0) {
                    System.out.println("FizzBuzz\n");
                } else if (value % 3 == 0) {
                    System.out.println("Fizz\n");
                } else if (value % 5 == 0) {
                    System.out.println("Buzz\n");
                } else {
                    System.out.println("Divided " + value + " by 3\n");
                    System.out.println("Divided " + value + " by 5\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Item\n");
            }
        }
    }
}






