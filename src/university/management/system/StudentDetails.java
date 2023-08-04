package university.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentDetails extends JFrame implements ActionListener {
    JButton search , update , add , print , cancel , delete;
    JTable table;
    Choice crollno;

    StudentDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search by roll no");
        heading.setBounds(0, 20, 150, 20);
        add(heading);

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

        table = new JTable();
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
            JScrollPane jsp = new JScrollPane(table);
            jsp.setBounds(0, 80, 1500, 600);
            add(jsp);

            search = new JButton("search");
            search.setBounds(700 , 20 , 100, 20);
            search.addActionListener(this);
           add(search);

           print = new JButton("print");
            print.setBounds(800 , 20 , 100, 20);
            print.addActionListener(this);
           add(print);

           update = new JButton("update");
            update.setBounds(950 , 20 , 100, 20);
            update.addActionListener(this);
           add(update);

           add = new JButton("add");
            add.setBounds(1100 , 20 , 100, 20);
            add.addActionListener(this);
           add(add);

           cancel = new JButton("cancel");
            cancel.setBounds(1200 , 20 , 100, 20);
            cancel.addActionListener(this);
           add(cancel);

        delete = new JButton("delete");
        delete.setBounds(1300 , 20 , 100, 20);
        delete.addActionListener(this);
        add(delete);

            setBounds(10, 100, 1500, 700);
            setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==search){
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e){
                e.printStackTrace();

            }

        }else if (ae.getSource()==print){
            try {
                table.print();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource()==add){
            setVisible(false);
            new AddStudent();
        }else if (ae.getSource()==update){
            setVisible(false);
            //new UpdateStudent();
        }else if (ae.getSource()==cancel){
            setVisible(false);
        }else if (ae.getSource()==delete){
            deletestudent deleteByIDFrame = new deletestudent();

            // Set the frame visible
            deleteByIDFrame.setVisible(true);
        }

    }


    public static void main(String[] args) {
        new StudentDetails();
    }


}

