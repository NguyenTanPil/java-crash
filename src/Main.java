// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*
    This is an example of multi-line comment.
    The program prints "Hello and welcome!"
 */

public class Main {
    public static void main(String[] args) {
        // First program
        System.out.println("Hello and welcome!");

        // Java Data Types (Primitive)
        // boolean type - two possible values, either true or false - default false value.
        boolean flag = true;
        System.out.println(flag);

        // byte type - have values from -128 to 127 (8-bit signed two's complement integer - default 0.
        byte range = 124;
        System.out.println(range);

        // short type - have values from -32768 to 32767 (16-bit) it's used instead of other integer data type(int, long) - default 0.
        short temperature = -300;
        System.out.println(temperature);

        // int type - can have values from -2^31 to 2^31 - 1 (32-bit) - default 0.
        int int_range = -425000;
        System.out.println(int_range);

        // long type - can have values from -2^63 to 2^63 - 1 (64-bit) - default 0.
        long long_range = -42332200000L;
        System.out.println(long_range);

        // double type - it's a double precision 64-bit floating-pointer - never used for precise value as currency - default 0.0.
        double double_number = -23.3;
        System.out.println(double_number);

        // float type - it's a double precision 32-bit floating-pointer - never used for precise value as currency - default 0.0.
        float float_number = -42.3f;
        System.out.println(float_number);

        // char type - it's a 16-bit Unicode character - min is '\u0000'(0) and max is '\uffff' - default '\u0000'
        char letter = '\u0051';
        System.out.println(letter);

        char letter1 = '9';
        System.out.println(letter1);

        char letter2 = 65;
        System.out.println(letter2);

        // string type - it's not primitive type. It's a object.
        String myString = "Java Programming";
        System.out.println(myString);
    }
}