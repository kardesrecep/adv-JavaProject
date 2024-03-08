package generics.interfaces.exp;

public interface Repository <T>{
    void save(T object);

    T find();
}
