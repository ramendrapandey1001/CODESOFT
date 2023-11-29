package StudentManagementSystem;

import javax.swing.*;
import java.awt.*;

public class StudentFrame extends JFrame {

    public StudentFrame()
    {
        ImageIcon icon = new ImageIcon("StudentManagementSystem/lamborghini_PNG10709.png");
        this.setIconImage(icon.getImage());
        this.setTitle("Student Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,400);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GRAY);
    }


}
