package generics.classes;

public class GenericClassTwoParams <T, E> {


    private T field;

    private E value;

    public GenericClassTwoParams(T field, E value) {
        this.field = field;
        this.value = value;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
