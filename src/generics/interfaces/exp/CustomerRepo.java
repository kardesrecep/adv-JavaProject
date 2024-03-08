package generics.interfaces.exp;

public class CustomerRepo implements Repository<Customer> {
    @Override
    public void save(Customer object) {

    }

    @Override
    public Customer find() {
        return null;
    }
}
