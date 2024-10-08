public class OOP1 {
    private String name;
    private OOP1(String nameInput) {
        System.out.println("Initial class");
        name = nameInput;
    }

    private OOP1() {
        System.out.println("Overload constructor");
    }

    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    private static void display(String a) {
        System.out.println("Arguments: " + a);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display("Hello");

        // java constructors
        OOP1 obj = new OOP1("Felix Nguyen");
        System.out.println(obj.name);
        OOP1 obj1 = new OOP1();

        int value = OOP1.sum(1, 5);
        System.out.println("Sum: " + value);

        // create strings
        String first = "Java ";
        String second = "Python ";
        String third = "Javascript";
        System.out.println(first + second + third);

        System.out.println("Length: " + first.length());
        String joinedString = first.concat(second);
        System.out.println("Joined string: " + joinedString);
        boolean comparedString = first.equals(second);
        System.out.println("Compare two strings: " + comparedString);

        boolean isContains = first.contains("Java");
        System.out.println(isContains);

        String str = "Java Programming";

        // creating a char array
        char[] result;

        result = str.toCharArray();
        System.out.println(result);
    }

}
