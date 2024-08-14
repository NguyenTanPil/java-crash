import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Java Arrays
        int[] age = {23, 3, 4, 5, 5};
        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        // loop for array
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        for (int a : age) {
            System.out.println(a);
        }

        // 2d array
        int[][] a = {
                {1,2,3},
                {5, 6, 7},
                {9}
        };
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        // for each for 2d array
        for (int[] innerArray: a) {
            for(int data: innerArray) {
                System.out.println(data);
            }
        }

        // create a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }

        // Copying Arrays Using Assignment Operator
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }

        // Using Looping Construct to Copy Arrays
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[source.length];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

        // converting array to string
        System.out.println(Arrays.toString(destination));

        // Copying Arrays Using arraycopy() method
        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 0, 4);
        System.out.println("n3 = " + Arrays.toString(n3));

        // Copying Arrays Using copyOfRange() method
        int[] source1 = {2, 3, 12, 4, 12, -2};

        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source1, 0, source1.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(source1, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));
    }
}
