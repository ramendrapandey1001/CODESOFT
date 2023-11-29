package StudentManagementSystem;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Test {

    public static void main1(String[] args) throws SQLException {
        DataServiceLayer data = new DataServiceLayer();

        List<Student> list = data.getStudents();

        for (Student student : list) {
            System.out.println(student.toString());
        }

        Student student1 = new Student(2541002,"Diksha","Pandey",11,"1995-08-20",1236547890L,"dikshapandey@gmail.com","Raipur");

        System.out.println(data.insertStudent(student1));
    }

    public static void main(String[] args) {

       StudentFrame studentFrame = new StudentFrame();
       ImageIcon icon = new ImageIcon("StudentManagementSystem/OIP.jpeg");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel jLabel = new JLabel();
        jLabel.setText("Jai Shri Ram");
        jLabel.setIcon(icon);
        jLabel.setHorizontalTextPosition(jLabel.CENTER);
        jLabel.setVerticalTextPosition(jLabel.TOP);
        jLabel.setForeground(new Color(0x00FF00));
        jLabel.setFont(new Font("MV Boli", Font.PLAIN,20));
        jLabel.setIconTextGap(0);
        studentFrame.add(jLabel);
    }
}
