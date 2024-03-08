package generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericWithWildCard {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        addElements(integerList);
        System.out.println(integerList);

        addElements(objectList);

        multiplyByTwo(integerList);
        addElements(numberList);

        List<Object> listObj = new ArrayList<>();
        printObj(listObj);


    }

    public static void addElements(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }


    }

    public static void printElements(List<?> listOfUnknown) {
        for (Object ob : listOfUnknown) {
            System.out.println(ob);

        }
        //  listOfUnknown.add("java"); --compile time error
        listOfUnknown.add(null);


    }

    public static void printObj(List<Object> listOfObject) {

        for (Object ob : listOfObject) {
            System.out.println(ob);
        }
        listOfObject.add("java");





    }
    public static void multiplyByTwo (List < ? extends Number > list){


        list.stream().map(t -> 2 * t.doubleValue()).forEach(System.out::println);
        //wildcard---> readonly

    }
}