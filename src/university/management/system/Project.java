package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {
    JMenu Exit;
    JMenuItem ex , calculator , notepad;
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

//      FOR EXAMIUNATION
        JMenu exam = new JMenu("EXAMINATION");
        exam.setForeground(Color.orange);
        mb.add(exam);

        JMenuItem examinationDetails = new JMenuItem("EXAMINATION RESULTS");
        exam.add(examinationDetails);

        JMenuItem entermarks = new JMenuItem("ENTER MARKS");
        exam.add(entermarks);

//      UPDATE DETAILS
        JMenu updateDetails = new JMenu("UPDATE DETAILS");
        updateDetails.setForeground(Color.blue);
        mb.add(updateDetails);

        JMenuItem updateFacultyinfo = new JMenuItem("UPDATE FACULTY DETAILS");
        updateDetails.add(updateFacultyinfo);

        JMenuItem updateStudentinfo = new JMenuItem("UPDATE STUDENT DETAILS");
        updateDetails.add(updateStudentinfo);

        JMenu fees = new JMenu("FEES");
        fees.setForeground(Color.red);
        mb.add(fees);

        JMenuItem feesstructure = new JMenuItem("FEES STRUCTURE");
        fees.add(feesstructure);

        JMenuItem feesform = new JMenuItem("FEES FORM");
        fees.add(feesform);


        JMenu utility = new JMenu("UTILITY ");
        utility.setForeground(Color.green);
        mb.add(utility);

        notepad = new JMenuItem("NOTEPAD");
        utility.add(notepad);
        notepad.addActionListener(this);

         calculator = new JMenuItem("CALCULATOR");
        utility.add(calculator);
        calculator.addActionListener(this);



         Exit = new JMenu("EXIT ");
        Exit.setForeground(Color.blue);
        Exit.addActionListener(this);
        mb.add(Exit);
         ex = new JMenuItem("EXIT");
         ex.addActionListener(this);
        Exit.add(ex);







        setJMenuBar(mb);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Exit){


        }else if(e.getSource() == ex){
            setVisible(false);

        }else if (e.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");

            }catch (Exception ae){

            }
        }else if (e.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception ee){

            }
        }

    }


    public static void main(String[] args) {
        new Project();

    }


}
