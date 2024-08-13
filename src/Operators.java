public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 12, b = 5;
        // addition operator
        System.out.println("a + b = " + (a + b));
        // subtraction operator
        System.out.println("a - b = " + (a - b));
        // Multiplication operator
        System.out.println("a * b = " + (a * b));
        // Division operator - If one of the operands is a floating => will get a floating number
        System.out.println("a / b = " + (a / b));
        // Modulo operator
        System.out.println("a % b = " + (a % b));

        // Assignment operators
        /*
        * a = b => a = b
        * a += b => a = a + b
        * a -= b => a = a - b
        * a *= b => a = a * b
        * a /= b => a = a / b
        * a %= b => a = a % b
         */

        // Relational operators
        /*
        * 3 == 5 => false
        * 3 != 5 => false
        * 3 > 5 => false
        * 3 < 5 => true
        * 3 >= 5 => false
        * 3 <= 5 => true
         */

        // Logical operators
        /*
        * true && false => false
        * true || false => true
        * !true => false
        */

        // instanceof operator
        String str = "Programmig";
        boolean result = str instanceof String;
        System.out.println("Is str an object of String? => " + result);

        // Ternary operator
        // variable = expression ? expression1 : expression2;
    }
}
