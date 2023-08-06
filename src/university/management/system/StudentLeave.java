package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class StudentLeave extends JFrame {
    Choice crollno;
    StudentLeave(){
        setSize(500 , 500);
        setLocation(500 , 100 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("APPLY STUDENT LEAVE");
        heading.setBounds(40 , 40 , 300 , 30);
        heading.setFont(new Font("Arial Black" , Font.BOLD , 16));
        add(heading);

        JLabel lblrollno = new JLabel("Search by roll no");
        lblrollno.setBounds(0, 50, 150, 20);
        add(lblrollno);

        crollno = new Choice();
        crollno.setBounds(180, 20, 150, 20);
        add(crollno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        setVisible(true);


    }




    public static void main(String[] args) {
        new StudentLeave();
    }
}
