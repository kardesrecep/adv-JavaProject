package generics.interfaces;

public class GenericInterfaceIMp<T> implements GenericInterface<T> {

    @Override
    public void print(T value) {
      String str= (String) value;
        System.out.println(str.toUpperCase());

    }

    @Override
    public T find() {
        return null;
    }

    @Override
    public String getData(int val) {
        return null;
    }
}
