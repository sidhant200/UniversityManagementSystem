package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Project extends JFrame {
    Project (){
//        setLocation(100 , 250 );
        setSize(1540 , 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540 , 750 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //THIS IS MENU BAR

        JMenuBar mb = new JMenuBar();

        // THIS IS INFORMATION

        JMenu newinformation = new JMenu("NEW INFORMATION");
        newinformation.setForeground(Color.red);
        mb.add(newinformation);

        JMenuItem Faculty = new JMenuItem("New Faculty info");
        newinformation.add(Faculty);

        JMenuItem Studentinfo = new JMenuItem("Student info");
        newinformation.add(Studentinfo);


        // THIS IS DETAILS

        JMenu Details = new JMenu("VIEW DETAILS");
        Details.setForeground(Color.blue);
        mb.add(Details);

        JMenuItem Facultydetails = new JMenuItem("View Faculty Details");
        Details.add(Facultydetails);

        JMenuItem Studentdetails = new JMenuItem("View Student Details");
        Details.add(Studentdetails);



        // THIS IS FOR APPLYING LEAVE

        JMenu leave = new JMenu("LEAVE");
        leave.setForeground(Color.black);
        mb.add(leave);

        JMenuItem Facultyleave = new JMenuItem("Apply Faculty Leave");
        leave.add(Facultyleave);

        JMenuItem Studentleave = new JMenuItem("Apply Student Leave");
        leave.add(Studentleave);


        //THIS IS FOR VIEWING LEAVE DETAILS

        JMenu leavedetails = new JMenu("LEAVE DETAILS");
        leavedetails.setForeground(Color.blue);
        mb.add(leavedetails);

        JMenuItem Facultyleavedetails = new JMenuItem("View Faculty Leave Details");
        leavedetails.add(Facultyleavedetails);

        JMenuItem Studentleavedetails = new JMenuItem("View Student Leave Details");
        leavedetails.add(Studentleavedetails);


        JMenu exam = new JMenu("EXAMINATION");
        exam.setForeground(Color.orange);
        mb.add(exam);

        JMenuItem examinationDetails = new JMenuItem("EXAMINATION RESULTS");
        exam.add(examinationDetails);

        JMenuItem entermarks = new JMenuItem("ENTER MARKS");
        exam.add(entermarks);


        JMenu updateDetails = new JMenu("UPDATE DETAILS");
        updateDetails.setForeground(Color.blue);
        mb.add(updateDetails);

        JMenuItem updateFacultyinfo = new JMenuItem("UPDATE FACULTY DETAILS");
        updateDetails.add(updateFacultyinfo);

        JMenuItem updateStudentinfo = new JMenuItem("UPDATE STUDENT DETAILS");
        updateDetails.add(updateStudentinfo);


        setJMenuBar(mb);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Project();

    }
}
