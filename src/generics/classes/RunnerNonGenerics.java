package generics.classes;

public class RunnerNonGenerics {
    public static void main(String[] args) {
        NonGenericProduct book=new NonGenericProduct();
       book.setCode("java");

       NonGenericProduct comp= new NonGenericProduct();
       comp.setCode(5465);

       String strBook= (String) book.getCode();
        System.out.println(strBook);

        Integer intComp= (Integer) comp.getCode();
        System.out.println(intComp);



    }
}
