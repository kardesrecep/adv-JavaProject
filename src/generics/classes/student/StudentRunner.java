package generics.classes.student;

public class StudentRunner {
    public static void main(String[] args) {
        StudentDB <Student> studentDB = new StudentDB<Student>();
       Student student = studentDB.save(new Student(1L, "John", "Doe"));
        System.out.println("id: "+ student.getId() + " name: " + student.getName()+ " last name: " + student.getLastName());

    }


}
