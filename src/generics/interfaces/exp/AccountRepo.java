package generics.interfaces.exp;

public class AccountRepo implements Repository<Account> {
    @Override
    public void save(Account object) {

    }

    @Override
    public Account find() {
        return null;
    }
}
