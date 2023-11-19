package StudentManagementSystem;

import java.net.ConnectException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DataServiceLayer {

    static final String url = "jdbc:mysql://localhost:3306/codsoft";
    static final String user = "root";
    static final String password = "ramendra";
    static DataServiceLayer dataServiceLayer = new DataServiceLayer();


    public List<Student> getStudents() throws SQLException {

        Connection con = DriverManager.getConnection(url, user, password);
        List<Student> studentRepository = new LinkedList<>();

        String query = "select * from students;";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            Student student = new Student();

            student.setRollNumber(resultSet.getInt(1));
            student.setFirstName(resultSet.getString(2));
            student.setLastName(resultSet.getString(3));
            student.setGrade(resultSet.getInt(4));
            student.setBirthdayDate(resultSet.getString(5));
            student.setAddress(resultSet.getString(6));
            student.setPhoneNumber(resultSet.getLong(7));
            student.setEmailID(resultSet.getString(8));

            studentRepository.add(student);

        }

        return studentRepository;

    }
    public boolean insertStudent (Student student) throws  SQLException
    {
        Connection con = DriverManager.getConnection(url, user, password);

        String query = "insert into students values("+student.getRollNumber()+",'"+
                student.getFirstName()+"','"+
                student.getLastName()+"',"+
                student.getGrade()+",'"+
                student.getBirthdayDate()+"','"+
                student.getAddress()+"',"+student.getPhoneNumber()+",'"+
                student.getEmailID()+"')";
        Statement statement = con.createStatement();
        return !statement.execute(query);
    }

}
