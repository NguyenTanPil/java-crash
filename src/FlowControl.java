public class FlowControl {
    public static void main(String[] args) {
        // for-each
        int[] numbers = {3, 9, 5, -5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);

        // while loop
        System.out.println("while loop");
        int i = 1, n = 5;
        while(i <= n) {
            System.out.println(i);
            i++;
        }

        // do-while
        System.out.println("do while");
        int j = 1, m = 5;
        do {
            System.out.println(j);
            j++;
        } while(j <= m);

        // break statement
        System.out.println("break statement");
        for (int k = 1; k < 10; k++) {
            if(k == 5) {
                break;
            }

            System.out.println(k);
        }

        first:
        for( int x = 1; x < 5; x++) {
            System.out.println("Loop " + x);
            // the for loop is labeled as second
            second:
            for(int y = 1; y < 3; y ++ ) {
                System.out.println("x = " + x + "; y = " + y);

                // the break statement breaks the first for loop
                if (x == 2)
                    break first;
            }
        }

        // continue statement
        System.out.println("continue statement");
        for (int a = 1; a <= 10; ++a) {

            // if value of i is between 4 and 9
            // continue is executed
            if (a > 4 && a < 9) {
                continue;
            }
            System.out.println(a);
        }

        // switch statement
        System.out.println("switch statement");
        int firstNumber = 44;
        String size;
        switch (firstNumber) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            default:
                size = "Extra Large";
        }

        // Another way
//        String size = switch (firstNumber) {
//            case 29 -> "Small";
//            case 42 -> "Medium";
//            case 44 -> "Large";
//            default -> "Extra Large";
//        };

        System.out.println("Size: " + size);

        // Note: The Java switch statement only works with:
        // Primitive data types: byte, short, char and int
        // Enumerated types
        // String Class
        // Wrapper Classes: Character, Byte, Short, and Integer
    }
}
