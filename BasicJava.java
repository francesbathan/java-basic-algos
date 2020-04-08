import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

    // #1
    public static void Print255() {
        for (int i = 0; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // #2
    public static void PrintOddOne255() {
        for (int i = 0; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // #3
    public static void PrintSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    // #4 - using ArrayList
    public static void IterateThroughArrayList(ArrayList<Integer> x) {
        int size = x.size();
        for (int i = 0; i < size; i++) {
            System.out.println(x.get(i));
        }
    }

    // #4 - using regular Array
    public static void IterateThroughArray(int[] x) {
        int size = x.length;
        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }

    // #5
    public static void FindMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    // #6
    public static void GetAverage(int[] array) {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            avg = sum/array.length;
        }
        System.out.println(avg);
    }

    // #7 
    public static void ArrayOddNumbers() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        System.out.println("Y = " + y);
    }
    
    // #8
    public static void GreaterThanY(int[] array, int y) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > y) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    // #9
    public static void SquareTheValues(ArrayList<Integer> x) {
        // ArrayList<Integer> x = new ArrayList<Integer>();
        int arrayLength = x.size();
        for (int i = 0; i < arrayLength; i++) {
            x.set(i, x.get(i) * x.get(i));
        }
        System.out.println(x);
    }

    // #10
    public static void EliminateNegaNums(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    // #11
    public static void MaxMinAvg(int[] x) {
        int maxNum = x[0];
        int minNum = x[0];
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxNum) {
                maxNum = x[i];
            }
            if (x[i] < minNum) {
                minNum = x[i];
            }
            sum = sum + x[i];
        }
        avg = sum / x.length;
        ArrayList<Object> newArray = new ArrayList<Object>();
        newArray.add(maxNum);
        newArray.add(minNum);
        newArray.add(avg);
        System.out.println(newArray);
    }

    // #12
    public static void ShiftingValues(int[] x) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 1; i < x.length; i++) {
            newArray.add(x[i]);
        }
        newArray.add(0);
        System.out.println(newArray);
    }



    //////////////////////////// TESTS /////////////////////////////////

    

    public static void main(String[] args) {
        // Print255();
        
        // PrintOddOne255();
        
        // PrintSum();

        // ArrayList<Integer> x = new ArrayList<Integer>();
        // IterateThroughArrayList(x);

        // int[] lillysArray = {1, 2, 3, 4, 5};
        // IterateThroughArray(lillysArray);

        // int[] maxArray = {3, 7, 13, -15, 25, 98, 1};
        // FindMax(maxArray);
    
        // int[] avgArray = {2, 10, 3};
        // GetAverage(avgArray);

        // ArrayOddNumbers();

        // int[] yArray = {1, 3, 5, 7};
        // int y = 1;
        // GreaterThanY(yArray, y);

        // ArrayList<Integer> x = new ArrayList<Integer>();
        // x.add(1);
        // x.add(5);
        // x.add(10);
        // x.add(-2);
        // SquareTheValues(x);

        // int[] noNega = {1, 5, 10, -2};
        // EliminateNegaNums(noNega);

        // int[] xArray = {1, 5, 10, -2};
        // MaxMinAvg(xArray);

        // int[] xArray = {1, 5, 10, 7, -2};
        // ShiftingValues(xArray);
    }

}