package StudentManagementSystem;

import java.sql.SQLException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws SQLException {
        DataServiceLayer data = new DataServiceLayer();

        List<Student> list = data.getStudents();

        for (Student student : list) {
            System.out.println(student.toString());
        }

        Student student1 = new Student(2541002,"Diksha","Pandey",11,"1995-08-20",1236547890L,"dikshapandey@gmail.com","Raipur");

        System.out.println(data.insertStudent(student1));
    }
}
