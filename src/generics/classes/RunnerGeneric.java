package generics.classes;

public class RunnerGeneric {
    public static void main(String[] args) {
        GenericProduct<String> book = new GenericProduct<>();
        GenericProduct<Integer> comp = new GenericProduct<>();

        book.setCode("123");
        String bookStr = book.getCode();
        System.out.println(bookStr);


        comp.setCode(123);
        Integer compInt = comp.getCode();
        System.out.println(compInt);


//====================================================================
        GenericClassTwoParams<Integer,String> myApp=new GenericClassTwoParams<>(123,"abc");
        GenericClassTwoParams<Integer,Integer> myApp2=new GenericClassTwoParams<>(890,4123);

        System.out.println(myApp2.getField());


    }
}
