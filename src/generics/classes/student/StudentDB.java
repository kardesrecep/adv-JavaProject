package generics.classes.student;

public class StudentDB <T> {
    public Student save(T student) {
        System.out.println("Student is saved successfully");

        return (Student) student;
    }
    public void delete(T student) {
        System.out.println("Student is deleted successfully");


    }
}
