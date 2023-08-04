package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener {
    JTextField tfname, tffathername  , tfaddress , tfphoneno , tfemail , tfclassxii , tfclassx , tfaddhhar;
    JDateChooser dcdob;
    JLabel labelrollno;
    JComboBox cbcourse , bcourse;
    JButton cancel , submit;

    Random ran  = new Random();
    long first4 = Math.abs(ran.nextLong()%9000L) + 1000L;

    AddStudent(){
        setSize(900 , 600);
        setLayout(null);
        setLocation(150 , 60);


        JLabel heading = new JLabel("NEW STUDENTS DETAILS");
        heading.setBounds(320 , 0 , 600 , 50);
        heading.setFont(new Font("Arial Black" , Font.BOLD , 16));
        add(heading);

        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(40 , 50 , 600 , 50);
        lblname.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(100 , 65 , 210 , 20);
        tfname.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfname.setForeground(Color.red);
        add(tfname);


        JLabel lblfathername = new JLabel("FATHER'S NAME");
        lblfathername.setBounds(400 , 50 , 600 , 50);
        lblfathername.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblfathername);


        tffathername = new JTextField();
        tffathername.setBounds(550 , 65 , 250 , 20);
        tffathername.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tffathername.setForeground(Color.red);
        add(tffathername);


        JLabel lblrollno = new JLabel("ROLL NO");
        lblrollno.setBounds(40 , 80 , 600 , 50);
        lblrollno.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblrollno);

        labelrollno = new JLabel("2023" + first4);
        labelrollno.setBounds(150 , 80 , 600 , 50);
        labelrollno.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(labelrollno);

        JLabel lbldob = new JLabel("DOB");
        lbldob.setBounds(400 , 80 , 600 , 50);
        lbldob.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(450 , 100 , 200 , 18);
        dcdob.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(dcdob);

        JLabel lbladdress = new JLabel("ADDRESS");
        lbladdress.setBounds(40 , 120 , 600 , 50);
        lbladdress.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(150 , 140 , 210 , 20);
        tfaddress.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfaddress.setForeground(Color.red);
        add(tfaddress);


        JLabel lblphoneno = new JLabel("PHONE");
        lblphoneno.setBounds(400 , 120 , 600 , 50);
        lblphoneno.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblphoneno);


        tfphoneno = new JTextField();
        tfphoneno.setBounds(550 , 135 , 200 , 20);
        tfphoneno.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfphoneno.setForeground(Color.red);
        add(tfphoneno);



        JLabel lblemail = new JLabel("EMAIL");
        lblemail.setBounds(40 , 160 , 600 , 50);
        lblemail.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(150 , 180 , 210 , 20);
        tfemail.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfemail.setForeground(Color.red);
        add(tfemail);


        JLabel lblclassxii = new JLabel("CLASS XII(%)");
        lblclassxii.setBounds(400 , 160 , 600 , 50);
        lblclassxii.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblclassxii);


        tfclassxii = new JTextField();
        tfclassxii.setBounds(550 , 180 , 200 , 20);
        tfclassxii.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfclassxii.setForeground(Color.red);
        add(tfclassxii);

        JLabel lblclassx = new JLabel("CLASS X(%)");
        lblclassx.setBounds(40 , 200 , 600 , 50);
        lblclassx.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblclassx);

        tfclassx = new JTextField();
        tfclassx.setBounds(150 , 220 , 210 , 20);
        tfclassx.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfclassx.setForeground(Color.red);
        add(tfclassx);

        JLabel lbladdhhar = new JLabel("ADDHAR NO:");
        lbladdhhar.setBounds(400 , 200 , 600 , 50);
        lbladdhhar.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lbladdhhar);


        tfaddhhar = new JTextField();
        tfaddhhar.setBounds(550 , 220 , 200 , 20);
        tfaddhhar.setFont(new Font("Arial Black" , Font.BOLD , 15));
        tfaddhhar.setForeground(Color.red);
        add(tfaddhhar);

        JLabel lblcourse = new JLabel("COURSE");
        lblcourse.setBounds(40 , 280 , 600 , 50);
        lblcourse.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblcourse);

        String course[] = {"BA" , "BSC"  , "BBA"  , "BCA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(120 , 300 , 150 , 20);
        cbcourse.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add( cbcourse);



        JLabel lblbranch = new JLabel("BRANCH");
        lblbranch.setBounds(600 , 285 , 600 , 50);
        lblbranch.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(lblbranch);


        String bbcourse[] = {"NEPALI" , "ENGLISH" , "ECONOMICS" , "POL SCI" , "HISTORY" , "GEOGRAPHY" , "MATHS" , "PHYSICS" , "CHEMISTRY" , "COMPUTER SCIENCE"};
        bcourse = new JComboBox(bbcourse);
        bcourse.setBounds(700 , 300 , 150 , 20);
        bcourse.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add( bcourse);


        submit = new JButton("Submit");
        submit.setBounds(100 , 500 , 100 , 20);
        submit.addActionListener(this);
        submit.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(500 , 500 , 100 , 20);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Arial Black" , Font.BOLD , 15));
        add(cancel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            String name = tfname.getText();
            String fname = tffathername.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone  = tfphoneno.getText();
            String email = tfemail.getText();
            String classxii = tfclassxii.getText();
            String classx  = tfclassx.getText();
            String addhar = tfaddhhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) bcourse.getSelectedItem();

            try{
                String query = "insert into student values( '"+name+"' ,  '"+fname+"' , '"+rollno+"' , '"+dob+"',  '"+address+"' , '"+phone+"' , '"+email+"' , '"+classxii+"' , '"+classx+"' , '"+addhar+"', '"+course+"' , '"+branch+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null , "Student details successfully inserted");
                setVisible(false);

            }catch(Exception ae ){
                ae.printStackTrace();

            }

        }else{
            JOptionPane.showMessageDialog(null , "you have not registered please re register");
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddStudent();
    }


}
