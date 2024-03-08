package serialization_deserialization;

import java.io.*;

public class Serialization_Deserialization {
    public static void main(String[] args) throws IOException {

       // writeObjects();
        readObjects();


    }




    private static void writeObjects() throws IOException {
        System.out.println("user object created");
        User user1 = new User(1L, "John Doe", "123-456-789");
        User user2 = new User(2L, "Jane Doe", "111-222-333");
        User user3 = new User(3L, "Mary Doe", "123-456-789");


        try (FileOutputStream fos = new FileOutputStream("users.ser")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());


        }
    }

    private static void readObjects() {



        try (FileInputStream fis = new FileInputStream("users.ser")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            User user1 = (User) ois.readObject();
            User user2 = (User) ois.readObject();
            User user3 = (User) ois.readObject();

                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);


            }
        } catch (IOException | ClassNotFoundException e) {

        }
    }
}

class User implements Serializable {

    private Long id;
    private String name;

    private String ssn;

    public User(Long id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}