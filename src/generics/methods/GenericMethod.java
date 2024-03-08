package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"a", "b", "c", "d", "e"};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(intArray);
        genericPrintArray(intArray);
        genericPrintArray(strArray);
        genericPrintArray(doubleArray);
        System.out.println(getFirstLetter(strArray));
        printArrayAndValue(strArray, 5);


    }

    public static void printArray(Integer[] arr) {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println("");


    }

    //generic method
    public static <T> void genericPrintArray(T[] arr) {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println("");


    }

    public static <T> char getFirstLetter(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
       char newArr= arr[0].toString().toUpperCase().charAt(0);

        return newArr;
    }


    public static <S, U> void printArrayAndValue(S[] arr, U value) {

        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println("-----------------------------"+value);


    }


}
